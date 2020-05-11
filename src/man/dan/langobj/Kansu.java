package man.dan.langobj;

import man.dan.memory.AreaVis;
import man.dan.parser.SakeParserParser;

import java.util.HashMap;

public class Kansu implements SakeObj {
    protected SakeParserParser.FunctionContext ctx;
    protected HashMap<String, Types> params;
    protected AreaVis curMemory;

    public Kansu(SakeParserParser.FunctionContext _ctx, HashMap<String, Types> par) {
        ctx = _ctx;
        params = new HashMap<>(par);
    }

    public void setArea(AreaVis mem) {
        curMemory = mem;
    }

    @Override
    public SakeObj getCopy() {
        return null;
    }
}
