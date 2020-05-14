package man.dan.memory;

import man.dan.errors.SemanticSakeError;
import man.dan.langobj.*;
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

    public void declAndAssign(Pointer ptr, SakeObj obj) throws SemanticSakeError {
        if (ptr.isArray() || variables.containsKey(ptr.getName()))
            throw new SemanticSakeError("variable '" + ptr + "' was declared one more times");
        else if (obj == null)
            throw new SemanticSakeError("r_value of " + ptr + " is null");

        if (obj instanceof Kansu)
            ((Kansu) obj).setArea(this);

        variables.put(ptr.getName(), obj);
    }

    protected SakeObj getInArr(Hairetsu arr, ArrayList<Integer> deep) throws SemanticSakeError {
        if (deep.size() == 1)
            return arr.get(deep.get(0));
        try {
            return getInArr((Hairetsu) arr.get(deep.get(0)), new ArrayList<>(deep.subList(1, deep.size())));
        } catch (Exception e) {
            throw new SemanticSakeError("inconsistency array deep");
        }
    }

    protected void setInArr(Hairetsu arr, ArrayList<Integer> deep, SakeObj whatSet, CubeAttr attr) throws SemanticSakeError{
        if (deep.size() == 1) {
            if (attr == null)
                arr.set(deep.get(0), whatSet);
            else {
                ((Rippotai)arr.get(deep.get(0))).setByAttr(attr, ((Countable)whatSet).getValue());
            }
            return;
        }

        setInArr((Hairetsu)arr.get(deep.get(0)), new ArrayList<>(deep.subList(1, deep.size())), whatSet, attr);
    }

    public SakeObj getValByPtr(Pointer ptr) throws SemanticSakeError {
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

        throw new SemanticSakeError("appeal to nonexistent variable " + ptr);
    }

    public SakeObj getValByPtr(String name) throws SemanticSakeError {
        Pointer ptr = new Pointer(name);
        return getValByPtr(ptr);
    }

    public void defineVal(Pointer ptr, SakeObj obj) throws SemanticSakeError {
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
        else throw new SemanticSakeError("trying to define the nonexistent variable " + ptr);
    }

    public AreaVis nestedArea() {
        AreaVis newArea = new AreaVis(this);
        nested.add(newArea);
        return newArea;
    }

    public AreaVis parentArea() {
        return parent;
    }

    public void clearExcluding(Pointer ptr) {
        SakeObj byPtr = null;
        try {
            byPtr = getValByPtr(ptr);
        } catch (Exception e) { assert false; }

        variables.clear();
        variables.put(ptr.getName(), byPtr);
    }

    public void clear() {
        assert nested.size() <= 0;

        variables.clear();
        if (parent == null)
            return;

        int delPar = parent.nested.indexOf(this);
        assert delPar != -1;

        parent.nested.remove(delPar);
    }
}
