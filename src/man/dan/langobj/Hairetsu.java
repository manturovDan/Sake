package man.dan.langobj;

import java.util.ArrayList;

public class Hairetsu implements SakeObj{
    protected ArrayList<SakeObj> arr;

    @Override
    public SakeObj getCopy() {
        return null;
    }

    public Hairetsu(ArrayList<Integer> dims) {
        arr = new ArrayList<>();
        if (dims.size() != 1) {
            arr.add(new Hairetsu((ArrayList<Integer>) dims.subList(1, dims.size())));
        }
        else {
            arr.add(new Undefined(0));
        }
    }
}
