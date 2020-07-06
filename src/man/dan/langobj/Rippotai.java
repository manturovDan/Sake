package man.dan.langobj;

import man.dan.errors.SemanticSakeError;
import man.dan.visitor.CubeAttr;

public class Rippotai implements SakeObj {
    protected int x;
    protected int y;
    protected int z;
    protected boolean kabe; //wall

    static public final int minCoord = 0;
    static public final int maxCoord = 29;

    public Rippotai(int _x, int _y, int _z, boolean _kabe) throws SemanticSakeError {
        if (_x < minCoord || _y < minCoord || _z < minCoord || _x > maxCoord || _y > maxCoord || _z > maxCoord)
            throw new SemanticSakeError("bad rippotai coordinates");

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
            default: assert false;
            return -1;
        }
    }

    public void setByAttr(CubeAttr attr, int val) throws SemanticSakeError {
        if (val < 0)
            throw new SemanticSakeError("bad rippotai coordinate " + attr);
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
            default: assert false;
        }
    }

    @Override
    public String toString() {
        return "{ X : " + x + "; Y : " + y + "; Z : " + z + "; isKabe : " + kabe + " }";
    }

    @Override
    public SakeObj clone() {
        try {
            return new Rippotai(x, y, z, isKabe());
        } catch (Exception e) { return null; }
    }

    @Override
    public boolean equals(Object obj) {
        Rippotai eq = (Rippotai)obj;
        return x == eq.x && y == eq.y && z == eq.z && kabe == eq.kabe;
    }

    @Override
    public int hashCode() {
        return (x + y + z) % 17 + (kabe ? 1 : 0);
    }
}
