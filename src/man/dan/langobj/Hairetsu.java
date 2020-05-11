package man.dan.langobj;

import java.util.ArrayList;

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

    public SakeObj get(int num) {
        return arr.get(num);
    }

    public void set(int where, SakeObj what) {
        arr.set(where, what);
    }
}
