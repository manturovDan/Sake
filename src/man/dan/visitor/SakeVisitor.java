package man.dan.visitor;
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

    @Override
    public SakeObj visitProgram(SakeParserParser.ProgramContext ctx) {
        init();
        try {
            sout.println("Visit");
            return super.visitProgram(ctx);
        } finally {
            cleanup();
        }
    }

    protected void init() {
        printStream = new PrintStream(sout, true);
        inputStream = new BufferedReader(new InputStreamReader(sin));
    }

    protected void cleanup() {

    }
}
