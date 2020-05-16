package man.dan.langobj;

import io.vavr.Tuple3;

import java.util.ArrayList;
import java.util.HashSet;

public class Hairetsu implements SakeObj{
    protected ArrayList<SakeObj> arr;

    @Override //returns pointer, not copy
    public SakeObj getCopy() {
        return this;
    }

    public Hairetsu(ArrayList<Integer> dims) {
        arr = new ArrayList<>();
        for (int i = 0; i < dims.get(0); ++i) {
            if (dims.size() != 1) {
                ArrayList<Integer> transfer = new ArrayList<>(dims.subList(1, dims.size()));
                arr.add(new Hairetsu(transfer));
            } else {
                arr.add(new Undefined());
            }
        }
    }

    public Hairetsu(HashSet<Rippotai> cubes) {
        arr = new ArrayList<>();

        if (cubes.size() == 0)
            return;

        for (Rippotai cube : cubes) {
            arr.add(cube.getCopy());
        }
    }

    public SakeObj get(int num) {
        return arr.get(num);
    }

    public void set(int where, SakeObj what) {
        arr.set(where, what);
    }

    public int getLen() {
        return arr.size();
    }

    public int getDim() {
        return getDim(1);
    }

    public int getDim(int curDim) {
        if (arr.get(0) instanceof Hairetsu) {
            return  curDim + getDim(((Hairetsu) arr.get(0)).getDim(curDim));
        }

        return curDim;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("{");
        for (SakeObj el : arr) {
            ret.append(el).append(", ");
        }
        ret.setLength(ret.length() - 2);
        ret.append("}");
        return ret.toString();
    }
}
