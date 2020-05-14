package man.dan.interpreter;

import man.dan.errors.ErrorListener;
import man.dan.langobj.SakeObj;
import man.dan.memory.AreaVis;
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
    protected InputStream sin;
    protected OutputStream sout;
    protected OutputStream serr;
    protected PrintStream outPrint;
    protected PrintStream errPrint;
    protected AreaVis memory;
    protected boolean clear;

    public Interpreter(InputStream _in, OutputStream _out, OutputStream _err) {
        sin = _in;
        sout = _out;
        serr = _err;
        outPrint = new PrintStream(sout, true);
        errPrint = new PrintStream(serr, true);
        memory = new AreaVis();
        clear = true;
    }

    public void disableClear() {
        clear = false;
    }

    public void run() throws IOException {
        CharStream input = CharStreams.fromStream(sin);
        SakeParserLexer lexer = new SakeParserLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SakeParserParser parser = new SakeParserParser(tokens);
        parser.removeErrorListeners();
        ErrorListener erHandler = new ErrorListener(errPrint);
        parser.addErrorListener(erHandler);

        try {
            ParseTree tree = parser.program();
            SakeVisitor eval = new SakeVisitor(memory, sin, outPrint, errPrint, erHandler);

            if (!clear)
                eval.disableClearing();

            int ers = erHandler.getSyntaxErrorCount();
            if (ers > 0)
                errPrint.println("There are (is) " + ers + " syntax error(s) in the program");

            eval.visit(tree);
        } catch (ParseCancellationException e) {
            errPrint.println("Fatal parsing error");
        } //catch (Exception e) {
         //   errPrint.println("Fatal execution error");
        //}
    }

    public AreaVis getMemory() {
        return memory;
    }
}
