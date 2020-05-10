package man.dan.langobj;

public class Rippotai implements SakeObj {
    protected int x;
    protected int y;
    protected int z;
    protected boolean kabe; //wall

    public Rippotai(int _x, int _y, int _z, boolean _kabe) throws Exception {
        if (_x < 0 || _y < 0 || _z < 0)
            throw new Exception("#2"); //make normal

        x = _x;
        y = _y;
        z = _z;
        kabe = _kabe;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public boolean isKabe() {
        return kabe;
    }

    @Override
    public String toString() {
        return "{ X : " + x + "; Y : " + y + "; Z : " + z + "; isKabe" + kabe + " }";
    }

    @Override
    public SakeObj getCopy() {
        try {
            return new Rippotai(x, y, z, isKabe());
        } catch (Exception e) { return null; }
    }
}
