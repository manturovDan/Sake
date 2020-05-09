package man.dan.visitor;
import man.dan.langobj.Countable;
import man.dan.langobj.SakeObj;
import man.dan.memory.AreaVis;
import man.dan.parser.SakeParserBaseVisitor;
import man.dan.parser.SakeParserParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

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
        String name = ctx.ID().getText();
        Countable value = (Countable) visit(ctx.expr());

        //global now
        try {
            memory.declAndAssign(name, value);
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
        String name = ctx.appeal().ID().getText();
        try {
            return memory.getValByName(name);
        } catch (Exception e) {
            printStream.println("No var " + name);
            return null;
        } //write semantic error
    }

    @Override
    public SakeObj visitSenden_stmt(SakeParserParser.Senden_stmtContext ctx) {
        printStream.println(visit(ctx.expr()));
        return null;
    }

    @Override
    public SakeObj visitBool_assign(SakeParserParser.Bool_assignContext ctx) {
        String name = ctx.ID().getText();
        Countable value = (Countable) visit(ctx.expr());

        //UNITE with seisu
        //global now
        try {
            memory.declAndAssign(name, value);
        } catch (Exception e) { //make normal
            //Semantic error
        }

        return value;
    }

    @Override
    public SakeObj visitDef_stmt(SakeParserParser.Def_stmtContext ctx) {
        String name = ctx.appeal().ID().getText();
        Countable value = (Countable) visit(ctx.expr());

        //global now
        try {
            memory.defineVal(name, value);
        } catch (Exception e) { //make normal
            //Semantic error
        }

        return value;
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
}
