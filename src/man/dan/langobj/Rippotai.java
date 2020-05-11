package man.dan.langobj;

import man.dan.visitor.CubeAttr;

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

    public int getByAttr(CubeAttr attr) {
        switch (attr) {
            case X: return x;
            case Y: return y;
            case Z: return z;
            case kabe: return kabe ? 1 : 0;
            default: return -1; //error later
        }
    }

    public void setByAttr(CubeAttr attr, int val) {
        switch (attr) {
            case X:
                x = val;
                break;
            case Y:
                y = val;
                break;
            case Z:
                z = val;
                break;
            case kabe:
                kabe = val != 0;
            default: return; //error later
        }
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
