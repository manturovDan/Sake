package man.dan.langobj;

import man.dan.parser.SakeParserParser;

public class Kansu implements SakeObj {
    protected SakeParserParser.FunctionContext ctx;

    public Kansu(SakeParserParser.FunctionContext _ctx) {
        ctx = _ctx;
    }

    @Override
    public SakeObj getCopy() {
        return null;
    }
}
