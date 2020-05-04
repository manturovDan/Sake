package man.dan;

import man.dan.parser.SakeParserLexer;
import man.dan.parser.SakeParserParser;
import man.dan.parser.SakeParserWalker;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Launcher {
    public static void main(String[] args) {
        SakeParserLexer lexer = new SakeParserLexer(CharStreams.fromString("seisu a;"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SakeParserParser parser = new SakeParserParser(tokens);
        ParseTree tree = parser.statement();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SakeParserWalker(), tree);
    }
}
