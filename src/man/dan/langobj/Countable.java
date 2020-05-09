package man.dan.langobj;

import man.dan.parser.SakeParserParser;

public class Countable implements SakeObj {
    protected int value;

    public Countable(int val) {
        value = val;
    }

    public Countable(boolean val) {
        value = val ? 1 : 0;
    }

    public void unMin() {
        value *= -1;
    }

    public int getValue() {
        return value;
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

    public Countable lessThan(Countable comp) {
        if (value < comp.value)
            return new Countable(true);
        else
            return new Countable(false);
    }

    public String toString() {
        return String.valueOf(value);
    }

    public boolean isShinri() {
        return value != 0;
    }

    public void inc() {
        value++;
    }
}
