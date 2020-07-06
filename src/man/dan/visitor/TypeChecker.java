package man.dan.visitor;

import man.dan.errors.SemanticSakeError;
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



    protected static Types typeByType(int type) throws SemanticSakeError {
        switch (type) {
            case (SakeParserParser.SEISU) :
                return Types.seisu;
            case (SakeParserParser.RONRI) :
                return Types.ronri;
            case (SakeParserParser.RIPPOTAI) :
                return Types.rippotai;
            case (SakeParserParser.HAIRETSU) :
                return Types.hairetsu;
            default :
                throw new SemanticSakeError("type mismatch");
        }
    }
}
