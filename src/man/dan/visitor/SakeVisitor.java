package man.dan.visitor;
import man.dan.langobj.SakeObj;
import man.dan.parser.SakeParserBaseVisitor;
import man.dan.parser.SakeParserParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class SakeVisitor extends SakeParserBaseVisitor<SakeObj>{
    protected InputStream in;
    protected PrintStream out;
    protected PrintStream err;

    protected PrintStream printStream;
    protected BufferedReader inputStream;

    public SakeVisitor(InputStream _in, PrintStream _out, PrintStream _err) {
        in = _in;
        out = _out;
        err = _err;
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

    protected void init() {
        printStream = new PrintStream(out, true);
        inputStream = new BufferedReader(new InputStreamReader(in));
    }

    protected void cleanup() {

    }
}
