package man.dan.langobj;

public class Countable implements SakeObj {
    int value;

    public Countable(int val) {
        value = val;
    }

    public Countable(boolean val) {
        value = val ? 1 : 0;
    }

    public void unMin() {
        value *= -1;
    }

    public void not() {
        if (value == 0)
            value = 1;
        else value = 0;
    }

    public Countable plus(Countable add) {
        return new Countable(value + add.value);
    }

    public Countable minus(Countable sub) {
        return new Countable(value - sub.value);
    }
}
