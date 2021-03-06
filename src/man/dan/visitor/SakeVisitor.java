package man.dan.visitor;
import io.vavr.Tuple2;
import man.dan.errors.ErrorListener;
import man.dan.errors.SemanticSakeError;
import man.dan.langobj.*;
import man.dan.memory.AreaVis;
import man.dan.parser.SakeParserBaseVisitor;
import man.dan.parser.SakeParserParser;
import man.dan.robot.RoboState;
import man.dan.robot.Travel;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;

public class SakeVisitor extends SakeParserBaseVisitor<SakeObj>{
    protected InputStream sin;
    protected PrintStream sout;
    protected PrintStream serr;
    protected AreaVis memory;
    protected ErrorListener errHandler;
    protected Travel travel;

    protected PrintStream printStream;
    protected BufferedReader inputStream;

    protected SakeObj returnVal;

    protected boolean clearAreas;
    protected HashSet<Rippotai> openCubes;

    protected RobotActions robotHelp;

    public SakeVisitor(AreaVis mem, InputStream _in, PrintStream _out, PrintStream _err, ErrorListener handler) {
        sin = _in;
        sout = _out;
        serr = _err;
        memory = mem;
        returnVal = null;
        errHandler = handler;
        clearAreas = true;
        robotHelp = new RobotActions(this);
    }

    public void disableClearing() {
        clearAreas = false;
    }

    protected void init() {
        printStream = new PrintStream(sout, true);
        inputStream = new BufferedReader(new InputStreamReader(sin));
    }

    protected void cleanup() {
        if (clearAreas) {
            memory.clear();
        }
    }

    public void visStmt(List<SakeParserParser.StatementContext> statement) {
        for (SakeParserParser.StatementContext stmt : statement)
            if (stmt.function() != null)
                visit(stmt);
        for (SakeParserParser.StatementContext stmt : statement)
            if (stmt.function() == null) {
                visit(stmt);
                if (returnVal != null) {
                    break;
                }
            }
    }

    public void setTravelVis(Travel trv) {
        travel = trv;
    }

    public Travel getTravelVis() {
        return travel;
    }

    public HashSet<Rippotai> getOpenCubes() {
        return openCubes;
    }

    @Override
    public SakeObj visitProgram(SakeParserParser.ProgramContext ctx) {
        init();
        try {
            visStmt(ctx.statement());
        } finally {
            cleanup();
        }

        return null;
    }

    protected void assignCountable(Pointer ptr, Countable value, ParserRuleContext ctx) {
        try {
            memory.declAndAssign(ptr, value);
        } catch (SemanticSakeError e) {
            errHandler.semanticError(ctx, e.toString());
        }
    }

    @Override
    public SakeObj visitNum_assign(SakeParserParser.Num_assignContext ctx) {
        Pointer ptr = new Pointer(ctx.ID().getText());
        Countable value = null;

        try {
            value = (Countable) visit(ctx.expr());
        } catch (Exception e) {
            errHandler.semanticError(ctx, "r_value of seisu is undefined");
        }

        assignCountable(ptr, value, ctx);

        return value;
    }

    @Override
    public SakeObj visitBool_assign(SakeParserParser.Bool_assignContext ctx) {
        Pointer ptr = new Pointer(ctx.ID().getText());

        Countable value = null;

        try {
            value = (Countable) visit(ctx.expr());
        } catch (Exception e) {
            errHandler.semanticError(ctx, "r_value of ronri is undefined");
        }

        assignCountable(ptr, value, ctx);

        return value;
    }

    @Override
    public SakeObj visitUnMin(SakeParserParser.UnMinContext ctx) {
        Countable minExpr = (Countable)visit(ctx.expr());
        minExpr.unMin();

        return minExpr;
    }

    @Override
    public SakeObj visitNot(SakeParserParser.NotContext ctx) {
        Countable minExpr = (Countable)visit(ctx.expr());
        minExpr.not();

        return minExpr;
    }

    @Override
    public SakeObj visitPlusMin(SakeParserParser.PlusMinContext ctx) {
        Countable left = (Countable) visit(ctx.expr(0));
        Countable right = (Countable) visit(ctx.expr(1));

        if(ctx.op.getType() == SakeParserParser.PLUS) {
            return left.plus(right);
        }
        else if (ctx.op.getType() == SakeParserParser.MINUS) {
            return left.minus(right);
        }

        errHandler.semanticError(ctx, "addition/subtraction operators error");
        return null;

    }

    @Override
    public SakeObj visitGrLess(SakeParserParser.GrLessContext ctx) {
        Countable left = (Countable) visit(ctx.expr(0));
        Countable right = (Countable) visit(ctx.expr(1));

        if (ctx.op.getType() == SakeParserParser.LESS) {
            return left.lessThan(right);
        }
        else if (ctx.op.getType() == SakeParserParser.GREATER) {
            return right.lessThan(left);
        }

        errHandler.semanticError(ctx, "greater/less operators error");
        return null;

    }

    @Override
    public SakeObj visitConst(SakeParserParser.ConstContext ctx) {
        if(ctx.constant().INT() != null) {
            String digStr = ctx.constant().INT().getText();
            if (digStr.charAt(0) == 'x')
                return new Countable(Integer.parseInt(digStr.substring(1), 16));
            else
                return new Countable(Integer.parseInt(digStr));
        } else if (ctx.constant().SHINRI() != null)
            return new Countable(true);
        else if (ctx.constant().OSU() != null)
            return new Countable(false);

        assert false;
        return null;
    }

    @Override
    public SakeObj visitApp(SakeParserParser.AppContext ctx) {
        ArrayList<Integer> deep = ArFromOrder(ctx.appeal().order());
        CubeAttr cAttr = whichCubeAttr(ctx.appeal());
        Pointer ptr = new Pointer(ctx.appeal().ID().getText(), deep, cAttr);

        try {
            return memory.getValByPtr(ptr).clone();
        } catch (SemanticSakeError e) {
            errHandler.semanticError(ctx, e.toString());
            return null;
        }
    }

    @Override
    public SakeObj visitSenden_stmt(SakeParserParser.Senden_stmtContext ctx) {
        if (ctx.expr() != null)
            printStream.println(visit(ctx.expr()));
        else if (ctx.r_value() != null)
            printStream.println(visit(ctx.r_value()));
        return null;
    }

    @Override
    public SakeObj visitBrackets(SakeParserParser.BracketsContext ctx) {
        return visit(ctx.expr());
    }

    protected SakeObj getCubeFromDef(SakeParserParser.Block_coubContext block_cb) {
        int x = ((Countable)visit(block_cb.expr(0))).getValue();
        int y = ((Countable)visit(block_cb.expr(1))).getValue();
        int z = ((Countable)visit(block_cb.expr(2))).getValue();
        boolean kabe = ((Countable) visit(block_cb.expr(3))).getValue() == 1;

        SakeObj value = null;
        try {
            value = new Rippotai(x, y, z, kabe);
        } catch (SemanticSakeError e) {
            errHandler.semanticError(block_cb, e.toString());
        }

        return value;
    }

    protected SakeObj defineRippotai(SakeParserParser.Block_coubContext block_cb, Pointer ptr, boolean assign) {
        SakeObj value = getCubeFromDef(block_cb);

        try {
            if (assign)
                memory.declAndAssign(ptr, value);
            else
                memory.defineVal(ptr, value);
        } catch (SemanticSakeError e) {
            return null;
        }

        return value;
    }

    protected SakeObj defineHairetsu(SakeParserParser.OrderContext order, Pointer ptr, boolean assign) {
        ArrayList<Integer> dimensions = ArFromOrder(order, 1);

        Hairetsu arr = new Hairetsu(dimensions);

        try {
            if (assign)
                memory.declAndAssign(ptr, arr);
            else
                memory.defineVal(ptr, arr);
        } catch (SemanticSakeError e) {
            errHandler.semanticError(order, e.toString());
        }

        return arr;
    }

    protected ArrayList<Integer> ArFromOrder(SakeParserParser.OrderContext order) {
        return ArFromOrder(order, 0);
    }

    protected ArrayList<Integer> ArFromOrder(SakeParserParser.OrderContext order, int border) {
        if (order == null)
            return null;

        ArrayList<Integer> res = new ArrayList<>();
        for (SakeParserParser.ExprContext expr : order.expr()) {
            int sz = ((Countable)visit(expr)).getValue();
            if (sz < border) {
                errHandler.semanticError(order, "bad array parameter (" + sz + ")");
            }
            res.add(sz);
        }

        return res;
    }


    protected CubeAttr whichCubeAttr(SakeParserParser.AppealContext appeal) {
        if(appeal.cube_attr() == null)
            return null;

        int attrType = appeal.cube_attr().hand.getType();
        switch (attrType) {
            case (SakeParserParser.TOX):
                return CubeAttr.X;
            case (SakeParserParser.TOY):
                return CubeAttr.Y;
            case (SakeParserParser.TOZ):
                return CubeAttr.Z;
            case (SakeParserParser.TOKABE):
                return CubeAttr.kabe;
            default:
                assert false;
                return null;
        }
    }

    protected ArrayList<SakeObj> extractArgs(SakeParserParser.ArgumentsContext arguments) {
        ArrayList<SakeObj> extraction = new ArrayList<>();
        for (SakeParserParser.R_valueContext rv : arguments.r_value()) {
            SakeObj arg = visit(rv);
            
            extraction.add(arg);
        }

        return extraction;
    }

    protected ArrayList<Tuple2<String, Types>> defineFunArgs(SakeParserParser.ParamsContext params) {
        ArrayList<Tuple2<String, Types>> pasDct = new ArrayList<>();
        HashSet<String> busyNames = new HashSet<>();

        for(SakeParserParser.One_paramContext param : params.one_param()) {
            String name = param.ID().getText();
            if (busyNames.contains(name)) {
                errHandler.semanticError(param, "argument " + name + " is busy");
                continue;
            }

            try {
                pasDct.add(new Tuple2<>(name, TypeChecker.typeByType(param.type().t.getType())));
            } catch (SemanticSakeError e) {
                errHandler.semanticError(param, e.toString());
            }

            busyNames.add(name);

        }

        return pasDct;
    }

    @Override
    public SakeObj visitRippotai_assign(SakeParserParser.Rippotai_assignContext ctx) {
        Pointer ptr = new Pointer(ctx.ID().getText());
        SakeObj cube = null;
        if (ctx.block_coub() != null)
            cube = defineRippotai(ctx.block_coub(), ptr, true);
        else if (ctx.expr() != null)
            try {
                try {
                    cube = visit(ctx.expr()).clone();
                } catch (NullPointerException e) {
                    errHandler.semanticError(ctx, "null value assigns to rippotai");
                }

                if (!(cube instanceof Rippotai)) {
                    errHandler.semanticError(ctx, "type mismatch in rippotai assignment");
                }

                memory.declAndAssign(ptr, cube);
            } catch (SemanticSakeError e) {
                errHandler.semanticError(ctx, e.toString());
            }
        else
            assert false;

        if (cube == null)
            errHandler.semanticError(ctx, "appeal to nonexistent cube or the second declaration");

        return cube;
    }

    @Override
    public SakeObj visitHairetsu_assign(SakeParserParser.Hairetsu_assignContext ctx) {
        Pointer ptr = new Pointer(ctx.ID().getText());
        SakeObj arr = null;
        if (ctx.array_vals() != null)
            arr = defineHairetsu(ctx.array_vals().order(), ptr, true);
        else if (ctx.expr() != null) {
            try {
                try {
                    arr = visit(ctx.expr()).clone();
                } catch (NullPointerException e) {
                    errHandler.semanticError(ctx, "null value assigns to hairetsu");
                }

                if (!(arr instanceof Hairetsu)) {
                    errHandler.semanticError(ctx, "type mismatch in hairetsu assignment");
                }

                memory.declAndAssign(ptr, arr);
            } catch (SemanticSakeError e) {
                errHandler.semanticError(ctx, e.toString());
            }
        }
        else if (ctx.robo_do() != null) {
            arr = visit(ctx.robo_do());
            try {
                memory.declAndAssign(ptr, arr);
            } catch (SemanticSakeError e) {
                errHandler.semanticError(ctx, e.toString());
            }
        }
        else
            assert false;

        return arr;
    }

    @Override
    public SakeObj visitDef_simp_stmt(SakeParserParser.Def_simp_stmtContext ctx) {
        String name = ctx.appeal().ID().getText();
        ArrayList<Integer> deep = ArFromOrder(ctx.appeal().order());
        CubeAttr attr = whichCubeAttr(ctx.appeal());
        Pointer ptr = new Pointer(name, deep, attr);

        SakeObj value = null;
        SakeObj current;

        try {
            current = memory.getValByPtr(ptr);
        } catch (SemanticSakeError e) {
            errHandler.semanticError(ctx, e.toString());
            return null;
        }

        if (TypeChecker.isCountable(current))
            try {
                value = visit(ctx.r_value().expr());
            } catch (Exception e) {
                errHandler.semanticError(ctx, "Type mismatch in definition if number");
                return null;
            }
        else if (TypeChecker.isRippotai(current)) {
            if (ctx.r_value().expr() != null) {
                try {
                    value = visit(ctx.r_value().expr()).clone();
                } catch (NullPointerException e) {
                    errHandler.semanticError(ctx, "null value assigns");
                }

                if (!(value instanceof Rippotai))
                    errHandler.semanticError(ctx, "type mismatch in rippotai definition");
            }
            else if (ctx.r_value().block_coub() != null) {
                SakeObj cube = defineRippotai(ctx.r_value().block_coub(), ptr, false);
                if (cube == null)
                    errHandler.semanticError(ctx, "appeal to nonexistent cube in rippotai");

                return cube;
            }
            else
                errHandler.semanticError(ctx, "type mismatch in rippotai definition (hairetsu)");
        }
        else if (TypeChecker.isHairetsu(current)) {
            if (ctx.r_value().expr() != null) {
                try {
                    value = visit(ctx.r_value().expr()).clone();
                } catch (NullPointerException e) {
                    errHandler.semanticError(ctx, "null value assigns");
                }

                if (!(value instanceof Hairetsu))
                    errHandler.semanticError(ctx, "type mismatch in hairetsu definition");
            }
            else if (ctx.r_value().array_vals() != null)
                return defineHairetsu(ctx.r_value().array_vals().order(), ptr, false);
            else if (ctx.r_value().robo_do() != null)
                value = visit(ctx.r_value().robo_do());
            else
                errHandler.semanticError(ctx, "type mismatch in hairetsu definition (rippotai)");
        }
        else if (ptr.isArray()) {
            if (ctx.r_value().expr() != null)
                try {
                    value = visit(ctx.r_value().expr()).clone();
                } catch (NullPointerException e) {
                    errHandler.semanticError(ctx, "null value assigns");
                }
            else if (ctx.r_value().array_vals() != null)
                return defineHairetsu(ctx.r_value().array_vals().order(), ptr, false);
            else if (ctx.r_value().block_coub() != null) {
                SakeObj cube = defineRippotai(ctx.r_value().block_coub(), ptr, false);
                if (cube == null)
                    errHandler.semanticError(ctx, "appeal to nonexistent cube in hairetsu");

                return cube;
            }
            else {
                errHandler.semanticError(ctx, "hairetsu definition error");
            }
        }
        else {
            errHandler.semanticError(ctx, "definition l_value error");
        }

        try {
            memory.defineVal(ptr, value);
        } catch (SemanticSakeError e) {
            errHandler.semanticError(ctx, e.toString());
            return null;
        }

        return value;
    }

    @Override
    public SakeObj visitDeclaration_stmt(SakeParserParser.Declaration_stmtContext ctx) {
        Pointer ptr = new Pointer(ctx.ID().getText());
        SakeObj undef = new Undefined(ctx.type().t.getType());

        try {
            memory.declAndAssign(ptr, undef);
        } catch (SemanticSakeError e) {
            errHandler.semanticError(ctx, e.toString());
        }

        return undef;
    }

    @Override
    public SakeObj visitOr(SakeParserParser.OrContext ctx) {
        Countable left = (Countable) visit(ctx.expr(0));

        if (left.isShinri())
            return new Countable(true);
        else {
            Countable right = (Countable) visit(ctx.expr(1));
            if (right.isShinri())
                return new Countable(true);
            else
                return new Countable(false);
        }
    }

    @Override
    public SakeObj visitAnd(SakeParserParser.AndContext ctx) {
        Countable left = (Countable) visit(ctx.expr(0));

        if (left.isShinri()) {
            Countable right = (Countable) visit(ctx.expr(1));
            if (right.isShinri())
                return new Countable(true);
            else
                return new Countable(false);
        }
        else
            return new Countable(false);
    }

    @Override
    public SakeObj visitCondition(SakeParserParser.ConditionContext ctx) {
        if (((Countable)visit(ctx.expr())).isShinri()) {
            memory = memory.nestedArea();

            visStmt(ctx.statement());

            AreaVis forClear = memory;
            memory = memory.parentArea();

            if (clearAreas)
                forClear.clear();
        }

        return null;
    }

    @Override
    public SakeObj visitCycle(SakeParserParser.CycleContext ctx) {
        memory = memory.nestedArea();
        Pointer ptr = new Pointer(ctx.ID().getText());

        Countable cur = (Countable) visit(ctx.expr(0)); // [
        Countable to = (Countable) visit(ctx.expr(1)); // )

        try {
            memory.declAndAssign(ptr, cur);
            while (((Countable)memory.getValByPtr(ptr)).lessThan(to).isShinri()) {
                visStmt(ctx.statement());

                if (returnVal != null)
                    break;

                ((Countable)memory.getValByPtr(ptr)).inc();
                memory.clearExcluding(ptr);
            }
            AreaVis forClear = memory;
            memory = memory.parentArea();

            if (clearAreas)
                forClear.clear();

        }
        catch (SemanticSakeError e) {
            errHandler.semanticError(ctx, e.toString());
        }

        return null;
    }

    @Override
    public SakeObj visitFunction(SakeParserParser.FunctionContext ctx) {
        Pointer ptr = new Pointer(ctx.ID().getText());
        ArrayList<Tuple2<String, Types>> argFields =  defineFunArgs(ctx.params());
        Types retType = Types.seisu; // to check errors later

        try {
            retType = TypeChecker.typeByType(ctx.type().t.getType());
        } catch (SemanticSakeError e) {
            errHandler.semanticError(ctx, e.toString());
        }

        Kansu func = new Kansu(ctx, argFields, retType);
        try {
            memory.declAndAssign(ptr, func);
        } catch (SemanticSakeError e) {
            errHandler.semanticError(ctx, e.toString());
        }

        return func;
    }

    @Override
    public SakeObj visitFunction_call(SakeParserParser.Function_callContext ctx) {
        String name = ctx.ID().getText();
        ArrayList<SakeObj> arguments = extractArgs(ctx.arguments());
        Kansu func = null;

        try {
            func = (Kansu) memory.getValByPtr(name);
        } catch (SemanticSakeError e) {
            errHandler.semanticError(ctx, e.toString());
        }


        AreaVis areaExec = null;
        try {
            areaExec = func.setRun(arguments);
        }
        catch (SemanticSakeError e) {
            errHandler.semanticError(ctx, e.toString());
            return null;
        }

        AreaVis current = memory;
        memory = areaExec;

        visStmt(func.getContext().statement());

        if (!Kansu.compareTypes(returnVal, func.getRetType()))
            errHandler.semanticError(ctx, "return value type mismatch");

        memory = current;

        if (clearAreas)
            areaExec.clear();

        SakeObj result = returnVal;
        returnVal = null;

        return result;
    }

    @Override
    public SakeObj visitR_value(SakeParserParser.R_valueContext ctx) {
        if(ctx.expr() != null) {
            SakeObj val = visit(ctx.expr());
            if (val instanceof Countable)
                return val;
            else if (val instanceof Rippotai)
                return val;
            else if (val instanceof Hairetsu)
                return val;
            else if (val instanceof Undefined)
                return val;
        }
        else if (ctx.block_coub() != null) {
            return getCubeFromDef(ctx.block_coub());
        }
        else if (ctx.array_vals() != null) {
            ArrayList<Integer> dimensions = ArFromOrder(ctx.array_vals().order(), 1);

            return new Hairetsu(dimensions);
        }
        else if (ctx.robo_do() != null) {
            return visit(ctx.robo_do());
        }
        return null;
    }

    @Override
    public SakeObj visitReturn_stmt(SakeParserParser.Return_stmtContext ctx) {
        SakeObj result = visit(ctx.expr());
        returnVal = result;
        return result;
    }

    @Override
    public SakeObj visitNagasa(SakeParserParser.NagasaContext ctx)  {
        String name = ctx.nagasa_expr().appeal().ID().getText();
        ArrayList<Integer> deep = ArFromOrder(ctx.nagasa_expr().appeal().order());
        CubeAttr attr = whichCubeAttr(ctx.nagasa_expr().appeal());
        Pointer ptr = new Pointer(name, deep, attr);

        Hairetsu hai = null;
        try {
            hai = (Hairetsu) memory.getValByPtr(ptr);
        } catch (SemanticSakeError e) {
            errHandler.semanticError(ctx, e.toString());
        }

        return new Countable(hai.getLen());
    }

    @Override
    public SakeObj visitRobo_action(SakeParserParser.Robo_actionContext ctx) {
        if (travel == null) {
            errHandler.semanticError(ctx, "trying to manage the robot however robot mode is disabled");
            return null;
        }

        RoboState status = travel.getStatus();

        if (status == RoboState.died) {
            errHandler.semanticError(ctx, "trying to manipulate died robot");
            return null;
        } else if (status == RoboState.success) {
            errHandler.semanticError(ctx, "trying to manipulate successful robot");
            return null;
        }

        travel.unlock();

        boolean motion = false;
        int look = -1;

        if (ctx.UP() != null) {
            travel.up();
            motion = true;
        } else if (ctx.DOWN() != null) {
            travel.down();
            motion = true;
        } else if (ctx.LEFTWARD() != null) {
            travel.leftward();
            motion = true;
        } else if (ctx.RIGHTWARD() != null) {
            travel.rightward();
            motion = true;
        } else if (ctx.FORWARD() != null) {
            travel.forward();
            motion = true;
        } else if (ctx.BACK() != null) {
            travel.back();
            motion = true;
        }

        Countable ret = null;


        if (motion) {
            printStream.println("-> " + travel.whereRobotPrint());
            status = travel.getStatus();
            if(status == RoboState.died) {
                printStream.println("*_*");
            } else if (status == RoboState.success) {
                printStream.println("SUCCESS");
            }
        }
        else {
            try {
                if (ctx.LOOKUP() != null) {
                    look = travel.look_up();
                    //System.out.println("UP : " + look);
                    robotHelp.completeUp(look);
                } else if (ctx.LOOKDOWN() != null) {
                    look = travel.look_down();
                    //System.out.println("DOWN : " + look);
                    robotHelp.completeDown(look);
                } else if (ctx.LOOKLEFT() != null) {
                    look = travel.look_left();
                    //System.out.println("LEFT : " + look);
                    robotHelp.completeLeft(look);
                } else if (ctx.LOOKRIGHT() != null) {
                    look = travel.look_right();
                    //System.out.println("RIGHT : " + look);
                    robotHelp.completeRight(look);
                } else if (ctx.LOOKFW() != null) {
                    look = travel.look_forward();
                    //System.out.println("FW : " + look);
                    robotHelp.completeForward(look);
                } else if (ctx.LOOKBACK() != null) {
                    look = travel.look_back();
                    //System.out.println("BACK : " + look);
                    robotHelp.completeBack(look);
                } else {
                    throw new SemanticSakeError("unknown robot command");
                }
                ret = new Countable(look);
            } catch (SemanticSakeError error) {
                errHandler.semanticError(ctx, error.toString());
            }
        }

        travel.lock();
        //System.out.println("LOCK TO MAIN");

        return ret;
    }

    @Override
    public SakeObj visitRobo_do(SakeParserParser.Robo_doContext ctx) {
        openCubes = new HashSet<>();
        SakeObj res;
        boolean lastBr = false;
        for (SakeParserParser.Robo_actionContext act : ctx.robo_action()) {
            if (act.BREAK() != null)
                if (lastBr) break;
                else continue;

            lastBr = false;

            res = visit(act);
            if (res != null && ((Countable)res).getValue() == 0)
                lastBr = true;
        }

        SakeObj measure = new Hairetsu(openCubes);

        return measure;
    }

    @Override
    public SakeObj visitRuikei(SakeParserParser.RuikeiContext ctx) {
        SakeObj comp1 = objForComp(ctx, 0);
        SakeObj comp2 = objForComp(ctx, 1);

        return new Countable(    (comp1 instanceof Undefined && comp2 instanceof Undefined && ((((Undefined) comp1).getType() == -1 || ((Undefined) comp2).getType() == -1) ||
                ((Undefined) comp1).getType() == ((Undefined) comp2).getType()))
                ||  comp1 instanceof Countable && comp2 instanceof Countable
                ||  comp1 instanceof Rippotai && comp2 instanceof Rippotai
                ||  comp1 instanceof Hairetsu && comp2 instanceof Hairetsu);
    }

    public SakeObj objForComp(SakeParserParser.RuikeiContext ctx, int num) {
        SakeObj comp = null;
        if (ctx.type_comp().type_to_comp().get(num).UNDEFINED() != null)
            comp = new Undefined();
        else if (ctx.type_comp().type_to_comp().get(num).type() != null) {
            if (ctx.type_comp().type_to_comp().get(num).type().t.getType() == SakeParserParser.SEISU ||
                    ctx.type_comp().type_to_comp().get(num).type().t.getType() == SakeParserParser.RONRI)
                comp = new Countable(num);
            else if (ctx.type_comp().type_to_comp().get(num).type().t.getType() == SakeParserParser.HAIRETSU)
                comp = new Hairetsu(new ArrayList<>(Collections.singletonList(1)));
            else if (ctx.type_comp().type_to_comp().get(num).type().t.getType() == SakeParserParser.RIPPOTAI)
                try {
                    comp = new Rippotai(0, 0, 0, false);
                }catch (Exception ignored) {}
            else assert false;
        }
        else
            comp = visit(ctx.type_comp().type_to_comp(num).r_value());

        return comp;
    }
}
