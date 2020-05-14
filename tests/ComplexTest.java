import man.dan.interpreter.Interpreter;
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

        String[] phrasesErr = progErr.toString().split("\n");

        assertEquals(phrasesErr[0], "Syntax Error: missing ';' at 'la' in line 4, at character 0");
        assertEquals(phrasesErr[1], "Syntax Error: missing ';' at 'senden' in line 5, at character 0");
        assertNotEquals(-1, phrasesErr[2].indexOf("in line 9, at character 10"));
        assertNotEquals(-1, phrasesErr[3].indexOf("in line 13, at character 0"));
        assertEquals(phrasesErr[4], "There are (is) 4 syntax error(s) in the program");
        assertEquals(phrasesErr[5], "Semantic error: appeal to nonexistent variable la2 in line 9");
        assertEquals(phrasesErr[6], "Semantic error: appeal to nonexistent variable kb in line 10");
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
    public void nonExistentVar() throws Exception {
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

        System.out.println(progErr);

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


}
