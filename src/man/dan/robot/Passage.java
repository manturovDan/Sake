package man.dan.robot;

public class Passage {
    protected int x;
    protected int y;
    protected int z;
    protected boolean portal;

    public Passage(int _x, int _y, int _z) {
        x = _x;
        y = _y;
        z = _z;
    }

    public Passage(int _x, int _y, int _z, boolean _p) {
        x = _x;
        y = _y;
        z = _z;
        portal = _p;
    }
}
