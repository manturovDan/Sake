package man.dan.visitor;

import java.util.ArrayList;

public class Pointer {
    protected String name;
    protected ArrayList<Integer> inDeep;

    public Pointer(String n) {
        name = n;
        inDeep = null;
    }

    public Pointer(String n, ArrayList<Integer> deep) {
        name = n;
        if (deep != null)
            inDeep = new ArrayList<>(deep);
    }

    public String getName() {
        return name;
    }

    public boolean isArray() {
        return !inDeep.isEmpty();
    }

    public ArrayList<Integer> getDeep() {
        return new ArrayList<>(inDeep);
    }
}
