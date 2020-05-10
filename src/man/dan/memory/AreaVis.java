package man.dan.memory;

import man.dan.langobj.Hairetsu;
import man.dan.langobj.SakeObj;
import man.dan.visitor.Pointer;

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

    public void declAndAssign(Pointer ptr, SakeObj obj) throws Exception {
        if (ptr.isArray() || variables.containsKey(ptr.getName()) || obj == null)
            throw new Exception("Semantic: one var two times or null"); //redo than

        variables.put(ptr.getName(), obj);
    }

    protected SakeObj getInArr(Hairetsu arr, ArrayList<Integer> deep) {
        if (deep.size() == 1)
            return arr.get(deep.get(0));
        return getInArr((Hairetsu)arr.get(0), new ArrayList<>(deep.subList(1, deep.size())));

    }

    public SakeObj getValByPtr(Pointer ptr) throws Exception {
        if (variables.containsKey(ptr.getName())) {
            if (ptr.isArray())
                return getInArr((Hairetsu) variables.get(ptr.getName()), ptr.getDeep());
            else
                return variables.get(ptr.getName());
        }

        if(parent != null)
            return parent.getValByPtr(ptr);

        throw new Exception("No var");
    }

    public void defineVal(String name, SakeObj obj) throws Exception {
        if (variables.containsKey(name))
            variables.put(name, obj);
        else if (parent != null)
            parent.defineVal(name, obj);
        else throw new Exception("No var");
    }

    public AreaVis nestedArea() {
        AreaVis newArea = new AreaVis(this);
        nested.add(newArea);
        return newArea;
    }

    public AreaVis parentArea() {
        return parent;
    }
}
