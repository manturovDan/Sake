package man.dan.visitor;
import man.dan.langobj.SakeObj;
import man.dan.langobj.Seisu;
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
        Seisu value = (Seisu) visit(ctx.expr());

        //to mem

        return value;
    }

    @Override
    public SakeObj visitUn_min(SakeParserParser.Un_minContext ctx) {

    }

}
