package man.dan.errors;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.io.PrintStream;

public class ErrorListener extends BaseErrorListener {
    protected int errorCount;
    protected PrintStream errPrint;

    public ErrorListener(PrintStream serrStr) {
        errorCount = 0;
        errPrint = serrStr;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        errPrint.println("Syntax Error: " + msg + " in line " + line + ", at character " + charPositionInLine);
        errorCount++;
    }

    public int getErrorCount() {
        return errorCount;
    }
}
