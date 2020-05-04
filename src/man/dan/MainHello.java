package man.dan;

import man.dan.lexer.*;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MainHello {
    public static void main(String[] args) {
        helloLexer lexer = new helloLexer(CharStreams.fromString("hello world"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        helloParser parser = new helloParser(tokens);
        helloParser.RContext tree = parser.r();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new helloWalker(), tree);
    }
}
