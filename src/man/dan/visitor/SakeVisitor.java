package man.dan.visitor;
import man.dan.langobj.*;
import man.dan.memory.AreaVis;
import man.dan.parser.SakeParserBaseVisitor;
import man.dan.parser.SakeParserParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class SakeVisitor extends SakeParserBaseVisitor<SakeObj>{
    protected InputStream sin;
    protected PrintStream sout;
    protected PrintStream serr;
    protected AreaVis memory;

    protected PrintStream printStream;
    protected BufferedReader inputStream;

    public SakeVisitor(AreaVis mem, InputStream _in, PrintStream _out, PrintStream _err) {
        sin = _in;
        sout = _out;
        serr = _err;
        memory = mem;
    }

    protected void init() {
        printStream = new PrintStream(sout, true);
        inputStream = new BufferedReader(new InputStreamReader(sin));
    }

    protected void cleanup() {

    }

    @Override
    public SakeObj visitProgram(SakeParserParser.ProgramContext ctx) {
        init();
        try {
            return super.visitProgram(ctx);
        } finally {
            cleanup();
        }
    }

    @Override
    public SakeObj visitNum_assign(SakeParserParser.Num_assignContext ctx) {
        Pointer ptr = new Pointer(ctx.ID().getText());
        Countable value = (Countable) visit(ctx.expr());

        //global now
        try {
            memory.declAndAssign(ptr, value);
        } catch (Exception e) { //make normal error later
            //Semantic error
            System.out.println(e.toString());
        }

        return value;
    }

    @Override
    public SakeObj visitBool_assign(SakeParserParser.Bool_assignContext ctx) {
        Pointer ptr = new Pointer(ctx.ID().getText());
        Countable value = (Countable) visit(ctx.expr());

        //UNITE with seisu
        //global now
        try {
            memory.declAndAssign(ptr, value);
        } catch (Exception e) { //make normal
            //Semantic error
        }

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
            //throw new Exception("Interpreter grammar error +-");
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
            //throw new Exception("Interpreter grammar error ><");
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
        return null;
    }

    @Override
    public SakeObj visitApp(SakeParserParser.AppContext ctx) {
        ArrayList<Integer> deep = ArFromOrder(ctx.appeal().order());
        Pointer ptr = new Pointer(ctx.appeal().ID().getText(), deep);

        try {
            return memory.getValByPtr(ptr).getCopy();
        } catch (Exception e) {
            printStream.println("No var " + ptr.getName());
            return null;
        } //write semantic error
    }

    @Override
    public SakeObj visitSenden_stmt(SakeParserParser.Senden_stmtContext ctx) {
        printStream.println(visit(ctx.expr()));
        return null;
    }

    @Override
    public SakeObj visitBrackets(SakeParserParser.BracketsContext ctx) {
        return visit(ctx.expr());
    }


    protected boolean isCountable(SakeObj current) {
        return  (current instanceof Countable || (current instanceof Undefined &&
                (((Undefined)current).getType() == SakeParserParser.SEISU ||
                ((Undefined)current).getType() == SakeParserParser.RONRI)));
    }

    protected boolean isRippotai(SakeObj current) {
        return  (current instanceof Rippotai || (current instanceof Undefined &&
                (((Undefined) current).getType() == SakeParserParser.RIPPOTAI)));
    }

    protected boolean isHairetsu(SakeObj current) {
        return  (current instanceof Hairetsu || (current instanceof Undefined &&
                ((Undefined) current).getType() == SakeParserParser.HAIRETSU));
    }

    protected boolean isUndefinedUndefined(SakeObj current) {
        return current instanceof Undefined && ((Undefined) current).getType() == -1;
    }

    protected SakeObj defineRippotai(SakeParserParser.Block_coubContext block_cb, Pointer ptr, boolean assign) {
        int x = ((Countable)visit(block_cb.expr(0))).getValue();
        int y = ((Countable)visit(block_cb.expr(1))).getValue();
        int z = ((Countable)visit(block_cb.expr(2))).getValue();
        boolean kabe = ((Countable) visit(block_cb.expr(3))).getValue() == 1;

        SakeObj value = null;
        try {
            value = new Rippotai(x, y, z, kabe);
        } catch (Exception e) {} //later

        try {
            if (assign)
                memory.declAndAssign(ptr, value);
            else
                memory.defineVal(ptr, value);
        } catch (Exception e) { //make normal
            //Semantic error
        }

        return value;
    }

    protected SakeObj defineHairetsu(SakeParserParser.OrderContext order, Pointer ptr, boolean assign) {
        ArrayList<Integer> dimensions = ArFromOrder(order);

        Hairetsu arr = new Hairetsu(dimensions);

        try {
            if (assign)
                memory.declAndAssign(ptr, arr);
            else
                memory.defineVal(ptr, arr);
        } catch (Exception e) { //make normal
            //Semantic error
        }

        return arr;
    }

    protected ArrayList<Integer> ArFromOrder(SakeParserParser.OrderContext order) {
        if (order == null)
            return null;

        ArrayList<Integer> res = new ArrayList<>();
        for (SakeParserParser.ExprContext expr : order.expr()) {
            int sz = ((Countable)visit(expr)).getValue();
            //if (sz < 1)
            //    throw later
            res.add(sz);
        }

        return res;
    }

    @Override
    public SakeObj visitRippotai_assign(SakeParserParser.Rippotai_assignContext ctx) {
        Pointer ptr = new Pointer(ctx.ID().getText());
        return defineRippotai(ctx.block_coub(), ptr, true);
    }

    @Override
    public SakeObj visitHairetsu_assign(SakeParserParser.Hairetsu_assignContext ctx) {
        Pointer ptr = new Pointer(ctx.ID().getText());
        return defineHairetsu(ctx.array_vals().order(), ptr, true);
    }

    @Override
    public SakeObj visitDef_simp_stmt(SakeParserParser.Def_simp_stmtContext ctx) {
        String name = ctx.appeal().ID().getText();
        ArrayList<Integer> deep = ArFromOrder(ctx.appeal().order());
        Pointer ptr = new Pointer(name, deep);

        SakeObj value = null;
        SakeObj current = null;

        try {
            current = memory.getValByPtr(ptr);
        } catch (Exception e) {} //later

        if (isCountable(current))
            value = visit(ctx.expr());
        else if (isRippotai(current)) {
            if (ctx.expr() != null)
                value = visit(ctx.expr()).getCopy();
            else
                return defineRippotai(ctx.block_coub(), ptr, false);
        }
        else if (isHairetsu(current)) {
            if (ctx.expr() != null)
                value = visit(ctx.expr()).getCopy();
            else
                return defineHairetsu(ctx.array_vals().order(), ptr, false);
        }
        else if (isUndefinedUndefined(current)) {
            if (ctx.expr() != null)
                value = visit(ctx.expr()).getCopy();
            else if (ctx.array_vals() != null)
                return defineHairetsu(ctx.array_vals().order(), ptr, false);
            else if (ctx.block_coub() != null)
                return defineRippotai(ctx.block_coub(), ptr, false);
            else { /* error later */}
        }
        else {
            //error later
        }

        try {
            memory.defineVal(ptr, value);
        } catch (Exception e) { //make normal
            //Semantic error
        }

        return value;
    }

    @Override
    public SakeObj visitDeclaration_stmt(SakeParserParser.Declaration_stmtContext ctx) {
        Pointer ptr = new Pointer(ctx.ID().getText());
        SakeObj undef = new Undefined(ctx.type().t.getType());

        try {
            memory.declAndAssign(ptr, undef);
        } catch (Exception e) { //make normal
            //Semantic error
        }

        return undef;
    }

    @Override
    public SakeObj visitOr(SakeParserParser.OrContext ctx) {
        Countable left = (Countable) visit(ctx.expr(0));
        Countable right = (Countable) visit(ctx.expr(1));

        if (left.isShinri() || right.isShinri())
            return new Countable(true);
        else
            return new Countable(false);
    }

    @Override
    public SakeObj visitAnd(SakeParserParser.AndContext ctx) {
        Countable left = (Countable) visit(ctx.expr(0));
        Countable right = (Countable) visit(ctx.expr(1));

        if (left.isShinri() && right.isShinri())
            return new Countable(true);
        else
            return new Countable(false);
    }

    @Override
    public SakeObj visitCondition(SakeParserParser.ConditionContext ctx) {
        if (((Countable)visit(ctx.expr())).isShinri()) {
            memory = memory.nestedArea();

            for (SakeParserParser.StatementContext stmt : ctx.statement()) {
                visit(stmt);
            }

            memory = memory.parentArea(); //maybe clear
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
            while (cur.lessThan(to).isShinri()) {
                for (SakeParserParser.StatementContext stmt : ctx.statement()) {
                    visit(stmt);
                }
                cur.inc();
            }

            memory = memory.parentArea(); //maybe clear
        }
        catch (Exception e) {}

        return null;
    }
}
