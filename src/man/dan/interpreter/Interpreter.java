package man.dan.interpreter;

import man.dan.langobj.SakeObj;
import man.dan.parser.SakeParserLexer;
import man.dan.parser.SakeParserParser;
import man.dan.parser.SakeParserVisitor;
import man.dan.visitor.SakeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Interpreter {
    protected InputStream in;
    protected OutputStream out;
    protected OutputStream err;
    protected PrintStream outPrint;
    protected PrintStream errPrint;

    public Interpreter(InputStream _in, OutputStream _out, OutputStream _err) {
        in = _in;
        out = _out;
        err = _err;
        outPrint = new PrintStream(out, true);
        errPrint = new PrintStream(err, true);
    }

    public void run(InputStream progIn) throws IOException {
        CharStream input = new UnbufferedCharStream(progIn);
        SakeParserLexer lexer = new SakeParserLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SakeParserParser parser = new SakeParserParser(tokens);

        try {
            ParseTree tree = parser.program();
            SakeVisitor eval = new SakeVisitor(in, outPrint, errPrint);
        } catch (ParseCancellationException e) {
            errPrint.println("Error message");
        }

    }
}
