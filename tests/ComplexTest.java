import man.dan.interpreter.Interpreter;
import man.dan.langobj.Countable;
import man.dan.memory.AreaVis;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

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

        assertEquals(phrasesOut[0], "-175");

    }
}
