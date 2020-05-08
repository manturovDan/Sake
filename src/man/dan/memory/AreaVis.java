package man.dan.memory;

import man.dan.langobj.SakeObj;

import java.util.ArrayList;
import java.util.HashMap;

public class AreaVis {
    protected HashMap<String, SakeObj> variables;
    protected ArrayList<AreaVis> nested;
    protected AreaVis parent;

    public AreaVis() {
        variables = new HashMap<>();
        nested = new ArrayList<>();
        parent = null;
    }

    public AreaVis(AreaVis _par) {
        variables = new HashMap<>();
        nested = new ArrayList<>();
        parent = _par;
    }

    public void declAndAssign(String name, SakeObj obj) throws Exception {
        if (variables.containsKey(name))
            throw new Exception("Semantic: one var two times"); //redo than

        variables.put(name, obj);
    }

    public SakeObj getValByName(String name) throws Exception {
        if (variables.containsKey(name))
            return variables.get(name);

        if(parent != null)
            return parent.getValByName(name);

        throw new Exception("No var");
    }
}
