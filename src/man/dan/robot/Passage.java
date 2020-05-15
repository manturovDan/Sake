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

    @Override
    public boolean equals(Object obj) {
        Passage pass = (Passage)obj;
        return x == pass.x && y == pass.y && z == pass.z && portal == pass.portal;
    }

    @Override
    public int hashCode() {
        return (x + y + z) % 17 + (portal ? 1 : 0);
    }

    public void incX() {
        x++;
    }

    public void decX() {
        x--;
    }

    public void incY() {
        y++;
    }

    public void decY() {
        y--;
    }

    public void incZ() {
        z++;
    }

    public void decZ() {
        z--;
    }
}
