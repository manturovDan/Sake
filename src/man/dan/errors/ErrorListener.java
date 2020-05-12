package man.dan.errors;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.io.PrintStream;

public class ErrorListener extends BaseErrorListener {
    protected int syntaxErrorCount;
    protected int semanticErrorCount;
    protected PrintStream errPrint;

    public ErrorListener(PrintStream serrStr) {
        syntaxErrorCount = 0;
        semanticErrorCount = 0;
        errPrint = serrStr;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        errPrint.println("Syntax Error: " + msg + " in line " + line + ", at character " + charPositionInLine);
        syntaxErrorCount++;
    }

    public int getSyntaxErrorCount() {
        return syntaxErrorCount;
    }

    public void semanticError(ParserRuleContext ctx, String message) {
        errPrint.println("Semantic error: " + message + " in line " + ctx.getStart().getLine());
        semanticErrorCount++;
    }
}
