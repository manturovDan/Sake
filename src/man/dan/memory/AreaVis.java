package man.dan.memory;

import man.dan.langobj.Countable;
import man.dan.langobj.Hairetsu;
import man.dan.langobj.Rippotai;
import man.dan.langobj.SakeObj;
import man.dan.visitor.CubeAttr;
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
        return getInArr((Hairetsu)arr.get(deep.get(0)), new ArrayList<>(deep.subList(1, deep.size())));
    }

    protected void setInArr(Hairetsu arr, ArrayList<Integer> deep, SakeObj whatSet, CubeAttr attr) {
        if (deep.size() == 1) {
            try {
                if (attr == null)
                    arr.set(deep.get(0), whatSet);
                else {
                    ((Rippotai)arr.get(deep.get(0))).setByAttr(attr, ((Countable)whatSet).getValue());
                }
                return;
            } catch (Exception e) {
                return;
            } //expr later
        }

        setInArr((Hairetsu)arr.get(deep.get(0)), new ArrayList<>(deep.subList(1, deep.size())), whatSet, attr);
    }

    public SakeObj getValByPtr(Pointer ptr) throws Exception {
        //expr later
        if (variables.containsKey(ptr.getName())) {
            if (ptr.isArray()) {
                SakeObj whatInArr = getInArr((Hairetsu) variables.get(ptr.getName()), ptr.getDeep());
                if (ptr.isCube())
                    return new Countable(((Rippotai)whatInArr).getByAttr(ptr.getAttr()));
                else return whatInArr;
            }
            else if (ptr.isCube())
                return new Countable(((Rippotai)variables.get(ptr.getName())).getByAttr(ptr.getAttr()));
            else
                return variables.get(ptr.getName());
        }

        if(parent != null)
            return parent.getValByPtr(ptr);

        throw new Exception("No var");
    }

    public SakeObj getValByPtr(String name) throws Exception {
        Pointer ptr = new Pointer(name);
        return getValByPtr(ptr);
    }

    public void defineVal(Pointer ptr, SakeObj obj) throws Exception {
        //expr later
        if (variables.containsKey(ptr.getName()))
            if (ptr.isArray()) {
                setInArr((Hairetsu) variables.get(ptr.getName()), ptr.getDeep(), obj, ptr.getAttr());
            }
            else if (ptr.isCube())
                ((Rippotai)variables.get(ptr.getName())).setByAttr(ptr.getAttr(), ((Countable)obj).getValue());
            else
                variables.put(ptr.getName(), obj);
        else if (parent != null)
            parent.defineVal(ptr, obj);
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
