package man.dan.visitor;

import java.util.ArrayList;

public class Pointer {
    protected String name;
    protected ArrayList<Integer> inDeep;
    protected CubeAttr attr;
    protected int attrValue;

    public Pointer(String n) {
        name = n;
        inDeep = null;
    }

    public Pointer(String n, ArrayList<Integer> deep) {
        name = n;
        setInDeep(deep);
    }

    public Pointer(String n, CubeAttr at, int atVal) {
        name = n;
        setAttr(at, atVal);
    }

    public Pointer(String n, ArrayList<Integer> deep, CubeAttr at, int atVal) {
        name = n;
        setInDeep(deep);
        setAttr(at, atVal);
    }

    protected void setInDeep(ArrayList<Integer> deep) {
        if (deep != null)
            inDeep = new ArrayList<>(deep);
    }

    protected void setAttr(CubeAttr at, int atVal) {
        if (at != null) {
            attr = at;
            attrValue = atVal;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isArray() {
        if (inDeep == null)
            return false;
        return !inDeep.isEmpty();
    }

    public ArrayList<Integer> getDeep() {
        return new ArrayList<>(inDeep);
    }
}
