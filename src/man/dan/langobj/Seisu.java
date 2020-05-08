package man.dan.langobj;

public class Seisu implements SakeObj {
    protected int value;

    public Seisu(int val) {
        value = val;
    }

    public void unMin() {
        value *= -1;
    }

    public Seisu plus(Seisu add) {
        return new Seisu(value + add.value);
    }
}
