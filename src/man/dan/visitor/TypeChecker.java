package man.dan.visitor;

import man.dan.langobj.*;
import man.dan.parser.SakeParserParser;

public class TypeChecker {
    protected static boolean isCountable(SakeObj current) {
        return  (current instanceof Countable || (current instanceof Undefined &&
                (((Undefined)current).getType() == SakeParserParser.SEISU ||
                        ((Undefined)current).getType() == SakeParserParser.RONRI)));
    }

    protected static boolean isRippotai(SakeObj current) {
        return  (current instanceof Rippotai || (current instanceof Undefined &&
                (((Undefined) current).getType() == SakeParserParser.RIPPOTAI)));
    }

    protected static boolean isHairetsu(SakeObj current) {
        return  (current instanceof Hairetsu || (current instanceof Undefined &&
                ((Undefined) current).getType() == SakeParserParser.HAIRETSU));
    }

    protected static boolean isUndefinedUndefined(SakeObj current) {
        return current instanceof Undefined && ((Undefined) current).getType() == -1;
    }
}
