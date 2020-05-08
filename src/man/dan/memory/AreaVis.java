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
}
