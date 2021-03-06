package man.dan.langobj;

public class Undefined implements SakeObj {
    protected int type;

    public Undefined() {
        type = -1; //any type
    }

    public Undefined(int t) {
        type = t;
    }

    public String toString() {
        return "undefined";
    }

    public int getType() {
        return type;
    }

    @Override
    public SakeObj clone() {
        return new Undefined(type);
    }
}
