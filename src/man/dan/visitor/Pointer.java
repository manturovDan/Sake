package man.dan.visitor;

import java.util.ArrayList;

public class Pointer {
    protected String name;
    protected ArrayList<Integer> inDeep;
    protected CubeAttr attr;

    public Pointer(String n) {
        name = n;
        inDeep = null;
    }

    public Pointer(String n, ArrayList<Integer> deep) {
        name = n;
        setInDeep(deep);
    }

    public Pointer(String n, CubeAttr at) {
        name = n;
        setAttr(at);
    }

    public Pointer(String n, ArrayList<Integer> deep, CubeAttr at) {
        name = n;
        setInDeep(deep);
        setAttr(at);
    }

    protected void setInDeep(ArrayList<Integer> deep) {
        if (deep != null)
            inDeep = new ArrayList<>(deep);
    }

    protected void setAttr(CubeAttr at) {
        if (at != null)
            attr = at;
    }

    public String getName() {
        return name;
    }

    public CubeAttr getAttr() {
        return attr;
    }

    public boolean isArray() {
        if (inDeep == null)
            return false;
        return !inDeep.isEmpty();
    }

    public boolean isCube() {
        return attr != null;

    }

    public ArrayList<Integer> getDeep() {
        return new ArrayList<>(inDeep);
    }
}
