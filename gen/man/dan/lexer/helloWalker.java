package man.dan.lexer;

public class helloWalker extends helloBaseListener {
    public void enterR(helloParser.RContext ctx) {
        System.out.println( "Entering R : " + ctx.ID().getText() );
    }

    public void exitR(helloParser.RContext ctx ) {
        System.out.println( "Exiting R" );
    }
}
