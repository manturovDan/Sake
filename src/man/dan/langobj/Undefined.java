package man.dan.langobj;

public class Undefined implements SakeObj {
    protected int type;

    public Undefined(int t) {
        type = t;
    }

    public String toString() {
        return "undefined";
    }
}
