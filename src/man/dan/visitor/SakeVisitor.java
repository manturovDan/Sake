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
            printStream.println("Program");
            return super.visitProgram(ctx);
        } finally {
            cleanup();
        }
    }

    @Override
    public SakeObj visitNum_assign(SakeParserParser.Num_assignContext ctx) {
        String name = ctx.ID().getText();
        Countable value = (Countable) visit(ctx.expr());

        //to mem

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
    public SakeObj visitPlusMin(SakeParserParser.PlusMinContext ctx) throws Exception {
        Countable left = (Countable) visit(ctx.expr(0));
        Countable right = (Countable) visit(ctx.expr(1));

        if(ctx.op.getType() == SakeParserParser.PLUS) {
            return left.plus(right);
        }
        else if (ctx.op.getType() == SakeParserParser.MINUS) {
            return left.minus(right);
        } else {
            throw new Exception("Interpreter grammar error");
        }
    }

}
