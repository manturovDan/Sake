package man.dan.langobj;

import io.vavr.Tuple2;
import man.dan.errors.SemanticSakeError;
import man.dan.memory.AreaVis;
import man.dan.parser.SakeParserParser;
import man.dan.visitor.Pointer;

import java.util.ArrayList;

//this is master change 2
public class Kansu implements SakeObj {
    protected SakeParserParser.FunctionContext ctx;
    protected ArrayList<Tuple2<String, Types>> params;
    protected AreaVis curMemory;
    protected Types retType;

    public Kansu(SakeParserParser.FunctionContext _ctx, ArrayList<Tuple2<String, Types>> par, Types ret) {
        ctx = _ctx;
        params = new ArrayList<>(par);
        retType = ret;
    }

    public void setArea(AreaVis mem) {
        curMemory = mem;
    }

    public Types getRetType() {
        return retType;
    }

    public static boolean compareTypes(SakeObj ob, Types type) {
        if (ob instanceof Countable && (type == Types.seisu || type == Types.ronri))
            return true;
        if (ob instanceof Rippotai && type == Types.rippotai)
            return true;
        if (ob instanceof Hairetsu && type == Types.hairetsu)
            return true;

        return false;
    }

    public AreaVis setRun(ArrayList<SakeObj> arguments) throws SemanticSakeError {
        if (arguments.size() != params.size())
            throw new SemanticSakeError("arguments count mismatch");

        AreaVis runVis = curMemory.nestedArea();

        for (int i = 0; i < arguments.size(); ++i) {
            if (compareTypes(arguments.get(i), params.get(i)._2()))
                runVis.declAndAssign(new Pointer(params.get(i)._1()), arguments.get(i));
            else {
                runVis.clear();
                throw new SemanticSakeError("Parameters type mismatch");
            }
        }

        return runVis;
    }

    public SakeParserParser.FunctionContext getContext() {
        return ctx;
    }

    @Override
    public SakeObj clone() {
        assert false;
        return null;
    }
}
