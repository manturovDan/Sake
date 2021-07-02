import man.dan.interpreter.Interpreter;
import man.dan.langobj.Countable;
import man.dan.memory.AreaVis;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ComplexTest {
    protected void executeWithClear(String initialString, OutputStream progOut, OutputStream progErr) throws IOException {
        InputStream progIn = new ByteArrayInputStream(initialString.getBytes());
        Interpreter interpreter;
        interpreter = new Interpreter(progIn, progOut, progErr);
        interpreter.run();
    }

    AreaVis execute(String initialString) throws IOException {
        InputStream progIn = new ByteArrayInputStream(initialString.getBytes());
        Interpreter interpreter;
        interpreter = new Interpreter(progIn, System.out, System.out);
        AreaVis memory = interpreter.getMemory();
        interpreter.disableClear();
        interpreter.run();
        return memory;
    }

    @Test
    public void simpleCalc() throws Exception {
        String initialString =  "seisu bz = -xAF;\n" +
                                "senden bz;\n" +
                                "hairetsu la = {4, 2};\n" +
                                "la[2, 1] = [1, 2, 0, shinri];\n" +
                                "senden la;\n" +
                                "senden la[2, 1] => Z;\n" +
                                "la[2, 1] => Y = 5;\n" +
                                "senden la[2, 1] => Y;\n" +
                                "senden la[2, 1];\n" +
                                "rippotai kb = [0, 0, 0, 5];\n" +
                                "la[2, 0] = kb;\n" +
                                "kb => X = 1;\n" +
                                "senden la;\n" +
                                "senden kb;";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        executeWithClear(initialString, progOut, progErr);

        String[] phrasesOut = progOut.toString().split("\n");

        assertEquals(phrasesOut[0], "-175");assertEquals(phrasesOut[0], "-175");
        assertEquals(phrasesOut[2], "0");
        assertEquals(phrasesOut[3], "5");
        assertEquals(phrasesOut[4], "{ X : 1; Y : 5; Z : 0; isKabe : true }");
        assertEquals(phrasesOut[5], "{{undefined, undefined}, {undefined, undefined}, {{ X : 0; Y : 0; Z : 0; isKabe : false }, { X : 1; Y : 5; Z : 0; isKabe : true }}, {undefined, undefined}}");
        assertEquals(phrasesOut[6], "{ X : 1; Y : 0; Z : 0; isKabe : false }");
    }

    @Test
    public void syntaxTestError() throws Exception {
        String initialString =  "seisu bz = -xAF;\n" +
                                "senden bz;\n" +
                                "hairetsu la = {4, 2}\n" +
                                "la[2, 1] = [1, 2, 0, shinri]\n" +
                                "senden la;\n" +
                                "senden la[2, 1] => Z;\n" +
                                "la[2, 1] => Y = 5;\n" +
                                "senden la[2, 1] => Y;\n" +
                                "senden la2, 1];\n" +
                                "rippotail kb = [0, 0, 0, 5];\n" +
                                "la[2, 0] = kb;\n" +
                                "kb => X = \n" +
                                "senden la;\n" +
                                "senden kb;";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        executeWithClear(initialString, progOut, progErr);

        //System.out.println(progErr.toString());

        String[] phrasesErr = progErr.toString().split("\n");

        assertEquals(phrasesErr[0], "Syntax Error: missing ';' at 'la' in line 4, at character 0");
        assertEquals(phrasesErr[1], "Syntax Error: missing ';' at 'senden' in line 5, at character 0");
        assertNotEquals(-1, phrasesErr[2].indexOf("in line 9, at character 10"));
        assertNotEquals(-1, phrasesErr[3].indexOf("in line 13, at character 0"));
        assertEquals(phrasesErr[4], "There are (is) 4 syntax error(s) in the program");
        assertEquals(phrasesErr[5], "Semantic error: appeal to nonexistent variable kb in line 10");
    }

    @Test
    public void varTypeMismatchTest() throws Exception {
        String initialString =  "seisu bz = -xAF;\n" +
                                "senden bz;\n" +
                                "seisu la = {4, 2};\n";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        executeWithClear(initialString, progOut, progErr);

        String[] phrasesErr = progErr.toString().split("\n");

        assertNotEquals(-1, phrasesErr[0].indexOf("in line 3"));
    }

    @Test
    public void varTypeErrorTest() throws Exception {
        String initialString =  "seisu bz = -xAF;\n" +
                "senden bz;\n" +
                "seiseu la = 3;\n";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        executeWithClear(initialString, progOut, progErr);

        String[] phrasesErr = progErr.toString().split("\n");

        assertNotEquals(-1, phrasesErr[0].indexOf("in line 3"));
    }

    @Test
    public void nonExistentVarTest() throws Exception {
        String initialString =  "seisu bz = -xAF;\n" +
                "senden bz;\n" +
                "hairetsu la = {4, 2};\n" +
                "la[2, 1] = [1, 2, 0, shinri];\n" +
                "senden la;\n" +
                "ne => X = 55;" +
                "senden la[2, 1] => Z;\n" +
                "la[2, 1] => Y = 5;\n" +
                "senden la[2, 1] => Y;\n" +
                "senden la[2, 1];\n" +
                "rippotai kb = [0, 0, 0, 5];\n" +
                "la[2, 0] = kb;\n" +
                "kb => X = 1;\n" +
                "senden la;\n" +
                "senden kb;\n" +
                "kb => X = -1;\n" +
                "rippotai kbp = [0, -21, 0, 5];\n";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        executeWithClear(initialString, progOut, progErr);

        //System.out.println(progErr);

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        assertEquals(phrasesOut[0], "-175");assertEquals(phrasesOut[0], "-175");
        assertEquals(phrasesOut[2], "0");
        assertEquals(phrasesOut[3], "5");
        assertEquals(phrasesOut[4], "{ X : 1; Y : 5; Z : 0; isKabe : true }");
        assertEquals(phrasesOut[5], "{{undefined, undefined}, {undefined, undefined}, {{ X : 0; Y : 0; Z : 0; isKabe : false }, { X : 1; Y : 5; Z : 0; isKabe : true }}, {undefined, undefined}}");
        assertEquals(phrasesOut[6], "{ X : 1; Y : 0; Z : 0; isKabe : false }");

        assertEquals(phrasesErr[0], "Semantic error: appeal to nonexistent variable ne => X in line 6");
        assertEquals(phrasesErr[1], "Semantic error: bad rippotai coordinate X in line 15");
        assertEquals(phrasesErr[2], "Semantic error: bad rippotai coordinates in line 16");
    }

    @Test
    public void definitionTest() throws Exception {
        String initialString =  "seisu bz = -xAF;\n" +
                                "senden bz\n" +
                                "hairetsu la = {4, 2};\n" +
                                "la[2, 1] = [1, 2, 0, shinri];\n" +
                                "senden la;\n" +
                                "ronri la = osu;\n" +
                                "ne => X = 55;" +
                                "senden la[2, 1] => Z;\n" +
                                "la[2, 1] => Y = 5;\n" +
                                "senden la[2, 1] => Y;\n" +
                                "senden la[2, 1];\n" +
                                "rippotai kb = [0, 0, 0, 5];" +
                                "rippotai kb;\n" +
                                "la[2, 0] = kb;\n" +
                                "kb => X = 1;\n" +
                                "senden la;\n" +
                                "senden kb;\n" +
                                "kb => X = 1;\n" +
                                "rippotai kbp = [0, 21, 0, shinri];\n" +
                                "rippotai kbp = [9, 21, 5, shinri];\n" +
                                "rippotai kbpt = [9, 211, 5, shinri];";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        executeWithClear(initialString, progOut, progErr);

        //System.out.println(progOut);
        //System.out.println(progErr);

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        assertEquals(phrasesOut[0], "{{undefined, undefined}, {undefined, undefined}, {undefined, { X : 1; Y : 2; Z : 0; isKabe : true }}, {undefined, undefined}}");
        assertEquals(phrasesOut[1], "0");
        assertEquals(phrasesOut[2], "5");
        assertEquals(phrasesOut[3], "{ X : 1; Y : 5; Z : 0; isKabe : true }");
        assertEquals(phrasesOut[4], "{{undefined, undefined}, {undefined, undefined}, {{ X : 0; Y : 0; Z : 0; isKabe : false }, { X : 1; Y : 5; Z : 0; isKabe : true }}, {undefined, undefined}}");
        assertEquals(phrasesOut[5], "{ X : 1; Y : 0; Z : 0; isKabe : false }");


        assertEquals(phrasesErr[0], "Syntax Error: no viable alternative at input 'bzhairetsu' in line 3, at character 0");
        assertEquals(phrasesErr[1], "There are (is) 1 syntax error(s) in the program");
        assertEquals(phrasesErr[2], "Semantic error: variable 'la' was declared one more times in line 6");
        assertEquals(phrasesErr[3], "Semantic error: appeal to nonexistent variable ne => X in line 7");
        assertEquals(phrasesErr[4], "Semantic error: variable 'kb' was declared one more times in line 11");
        assertEquals(phrasesErr[5], "Semantic error: appeal to nonexistent cube or the second declaration in line 18");
        assertEquals(phrasesErr[6], "Semantic error: bad rippotai coordinates in line 19");

    }

    @Test
    public void redefNullTest() throws Exception {
        String initialString =  "seisu ab;\n" +
                                "seisu redef = -(4-9);\n" +
                                "shuki k1 = 0 : (5+2) kido\n" +
                                "    sorenara redef > 10 kido\n" +
                                "        redef = redef + 2;\n" +
                                "    shushi;\n" +
                                "\n" +
                                "    sorenara redef < 10 kido\n" +
                                "        redef = redef + 1;\n" +
                                "    shushi;\n" +
                                "    \n" +
                                "    seisu k = ab;\n" +
                                "shushi;";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        executeWithClear(initialString, progOut, progErr);

        String[] phrasesErr = progErr.toString().split("\n");


        assertEquals(phrasesErr[0], "Semantic error: r_value of seisu is undefined in line 12");
        assertEquals(phrasesErr[1], "Semantic error: r_value of k is null in line 12");

    }

    @Test
    public void redefNullCubeTest() throws Exception {
        String initialString =  "rippotai ab;\n" +
                                "rippotai cd = [0, 0, 5, shinri];\n" +
                                "ab = cd;\n" +
                                "senden ab;\n" +
                                "cd => X = 1;\n" +
                                "senden cd;\n" +
                                "rippotai ef = cd;\n" +
                                "ef => Y = 10;\n" +
                                "senden ef;\n" +
                                "rippotai gh;\n" +
                                "rippotai ij = gh;\n" +
                                "ab = gh;\n" +
                                "gh = 5;\n" +
                                "cd = {10, 10};\n" +
                                "\n";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        executeWithClear(initialString, progOut, progErr);

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        //System.out.println(progErr.toString());
        //System.out.println(progOut.toString());

        assertEquals(phrasesOut[0], "{ X : 0; Y : 0; Z : 5; isKabe : true }");
        assertEquals(phrasesOut[1], "{ X : 1; Y : 0; Z : 5; isKabe : true }");
        assertEquals(phrasesOut[2], "{ X : 1; Y : 10; Z : 5; isKabe : true }");

        assertEquals(phrasesErr[0], "Semantic error: type mismatch in rippotai assignment in line 11");
        assertEquals(phrasesErr[1], "Semantic error: type mismatch in rippotai definition in line 12");
        assertEquals(phrasesErr[2], "Semantic error: type mismatch in rippotai definition in line 13");
        assertEquals(phrasesErr[3], "Semantic error: type mismatch in rippotai definition (hairetsu) in line 14");

    }

    @Test
    public void redefNullArrTest() throws Exception {
        String initialString =  "hairetsu ab;\n" +
                                "hairetsu cd = {shinri, shinri, shinri};\n" +
                                "ab = cd;\n" +
                                "senden ab;\n" +
                                "cd[0, 0, 0] = [2, 2, 1, 1];\n" +
                                "senden cd;\n" +
                                "hairetsu ef = cd;\n" +
                                "ef[0, 0, 0] = 10;\n" +
                                "senden ef;\n" +
                                "hairetsu gh;\n" +
                                "hairetsu ij = gh;\n" +
                                "ab = gh;\n" +
                                "gh = 5;\n" +
                                "cd = [1, 1, 1, 1];\n" +
                                "\n";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        executeWithClear(initialString, progOut, progErr);

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        //System.out.println(progErr.toString());
        //System.out.println(progOut.toString());

        assertEquals(phrasesOut[0], "{{{undefined}}}");
        assertEquals(phrasesOut[1], "{{{{ X : 2; Y : 2; Z : 1; isKabe : true }}}}");
        assertEquals(phrasesOut[2], "{{{10}}}");

        assertEquals(phrasesErr[0], "Semantic error: type mismatch in rippotai definition in line 8");
        assertEquals(phrasesErr[1], "Semantic error: type mismatch in hairetsu assignment in line 11");
        assertEquals(phrasesErr[2], "Semantic error: type mismatch in hairetsu definition in line 12");
        assertEquals(phrasesErr[3], "Semantic error: type mismatch in hairetsu definition in line 13");
        assertEquals(phrasesErr[4], "Semantic error: type mismatch in hairetsu definition (rippotai) in line 14");

    }

    @Test
    public void arrayIndexesTest() throws Exception {
        String initialString =  "hairetsu A = {3, 3, 3};\n" +
                                "senden A[0, 0, 0];\n" +
                                "senden A;\n" +
                                "senden A[0, 0, 0, 0];\n" +
                                "senden A[10, 0];\n" +
                                "senden A[0, 0, 100, 0];\n" +
                                "senden A[0, 0, -1];\n" +
                                "senden A[0, 0, 3];\n";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        executeWithClear(initialString, progOut, progErr);

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        //System.out.println(progErr.toString());
        //System.out.println(progOut.toString());

        assertEquals(phrasesOut[0], "undefined");
        assertEquals(phrasesOut[1], "{{{undefined, undefined, undefined}, {undefined, undefined, undefined}, {undefined, undefined, undefined}}, {{undefined, undefined, undefined}, {undefined, undefined, undefined}, {undefined, undefined, undefined}}, {{undefined, undefined, undefined}, {undefined, undefined, undefined}, {undefined, undefined, undefined}}}");


        assertEquals(phrasesErr[0], "Semantic error: inconsistency array deep in line 4");
        assertEquals(phrasesErr[1], "Semantic error: inconsistency array deep in line 5");
        assertEquals(phrasesErr[2], "Semantic error: inconsistency array deep in line 6");
        assertEquals(phrasesErr[3], "Semantic error: bad array parameter (-1) in line 7");

    }

    @Test
    public void funcParamsTypeMiss() throws Exception {
        String initialString =  "seisu kansu fibo(seisu f) kido\n" +
                                "    sorenara f < 3 kido\n" +
                                "        modoru 1;\n" +
                                "    shushi;\n" +
                                "\n" +
                                "    modoru fibo(f-2) + fibo(f-1);\n" +
                                "shushi;\n" +
                                "\n" +
                                "senden fibo({10, 10, 10});";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        executeWithClear(initialString, progOut, progErr);

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        //System.out.println(progErr.toString());
        //System.out.println(progOut.toString());

        assertEquals(phrasesErr[0], "Semantic error: Parameters type mismatch in line 9");

    }

    @Test
    public void funcParamsCountMiss() throws Exception {
        String initialString =  "seisu kansu fibo(seisu f) kido\n" +
                "    sorenara f < 3 kido\n" +
                "        modoru 1;\n" +
                "    shushi;\n" +
                "\n" +
                "    modoru fibo(f-2) + fibo(f-1);\n" +
                "shushi;\n" +
                "\n" +
                "senden fibo(10, [1, 1, 1, 1]);";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        executeWithClear(initialString, progOut, progErr);

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        assertEquals(phrasesErr[0], "Semantic error: arguments count mismatch in line 9");

    }

    @Test
    public void funcRetTypeMiss() throws Exception {
        String initialString =  "seisu kansu fibo(seisu f) kido\n" +
                "    sorenara f < 3 kido\n" +
                "        modoru 1;\n" +
                "    shushi;\n" +
                "\n" +
                "    modoru fibo(f-2) + fibo(f-1);\n" +
                "shushi;\n" +
                "\n" +
                "hairetsu A = fibo(10);";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        executeWithClear(initialString, progOut, progErr);

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        //System.out.println(progErr.toString());
        //System.out.println(progOut.toString());

        assertEquals(phrasesErr[0], "Semantic error: type mismatch in hairetsu assignment in line 9");

    }

    @Test
    public void typeCompTest() throws Exception {
        String initialString =  "senden ruikei <5, -x6>;\n" +
                "senden ruikei <5, {3, 1, 1}>;\n" +
                "ronri p;\n" +
                "senden ruikei <p, shinri>;\n" +
                "senden ruikei <p, undefined>;\n" +
                "hairetsu pp = {2, 2, 2};\n" +
                "senden ruikei <pp[1, 1, 1], undefined>;\n" +
                "senden ruikei <pp[1, 1, 1], ronri>;\n" +
                "senden ruikei <pp[1, 1], hairetsu>;";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        executeWithClear(initialString, progOut, progErr);

        //String[] phrasesOut = progOut.toString().split("\n");
        //String[] phrasesErr = progErr.toString().split("\n");

        //System.out.println(progErr.toString());
        //System.out.println(progOut.toString());

        assertEquals(progOut.toString(), "1\n" +
                "0\n" +
                "0\n" +
                "1\n" +
                "1\n" +
                "0\n" +
                "1\n");

        assertEquals(progErr.toString(), "");
    }

    @Test
    public void fibonacciTest3() throws Exception {
        String initialString =      "seisu kansu fibo(seisu f) kido\n" +
                "    sorenara f < 3 kido\n" +
                "        modoru 1;\n" +
                "    shushi;\n" +
                "\n" +
                "    modoru fibo(f-2) + fibo(f-1);\n" +
                "shushi;\n" +
                "\n" +
                "seisu k = fibo(3) - 1;";

        AreaVis memory = execute(initialString);

        assertEquals(((Countable)memory.getValByPtr("k")).getValue(),  2-1);
    }

    @Test
    public void fibonacciTest4() throws Exception {
        String initialString =      "seisu kansu fibo(seisu f) kido\n" +
                "    sorenara f < 3 kido\n" +
                "        modoru 1;\n" +
                "    shushi;\n" +
                "\n" +
                "    modoru fibo(f-2) + fibo(f-1);\n" +
                "shushi;\n" +
                "\n" +
                "seisu k = fibo(4) - 5;";

        AreaVis memory = execute(initialString);

        assertEquals(((Countable)memory.getValByPtr("k")).getValue(),  3-5);
    }
}
