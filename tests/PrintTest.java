import man.dan.interpreter.Interpreter;
import man.dan.langobj.Countable;
import man.dan.memory.AreaVis;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;


public class PrintTest {
    protected AreaVis executeWithClear(String initialString, OutputStream progOut, OutputStream progErr) throws IOException {
        InputStream progIn = new ByteArrayInputStream(initialString.getBytes());
        Interpreter interpreter;
        interpreter = new Interpreter(progIn, progOut, progErr);
        interpreter.run();
        return interpreter.getMemory();
    }

    @Test
    public void fiboPrintTest() throws IOException {
        String initialString =      "seisu kansu fibo(seisu f) kido\n" +
                "    sorenara f < 3 kido\n" +
                "        modoru 1;\n" +
                "    shushi;\n" +
                "\n" +
                "    modoru fibo(f-2) + fibo(f-1);\n" +
                "shushi;\n" +
                "\n" +
                "seisu k = fibo(10);\n" +
                "senden k;";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        AreaVis memory = executeWithClear(initialString, progOut, progErr);

        assertEquals(progOut.toString(),  "55\n");
        assertNull(memory.parentArea());
        assertEquals(memory.nestedCount(), 0);
        assertEquals(memory.variablesCount(), 0);
    }

    @Test
    public void areaDefCondTest() throws IOException {
        String initialString =      "seisu c = 123;\n" +
                                    "sorenara shinri > 0 kido\n" +
                                        "c = 321;\n" +
                                        "senden c;\n" +
                                    "shushi;\n" +
                                    "senden c;";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        AreaVis memory = executeWithClear(initialString, progOut, progErr);

        assertEquals(progOut.toString(),  "321\n321\n");
        assertNull(memory.parentArea());
        assertEquals(memory.nestedCount(), 0);
        assertEquals(memory.variablesCount(), 0);
    }

    @Test
    public void areaDefCondLoopTest() throws IOException {
        String initialString =      "seisu c = 123;\n" +
                                        "shuki j = 0 : 5 kido\n" +
                                            "sorenara shinri > 0 kido\n" +
                                                "c = 521;\n" +
                                            "shushi;" +
                                        "shushi;\n" +
                                    "senden c;";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        AreaVis memory = executeWithClear(initialString, progOut, progErr);

        assertEquals(progOut.toString(),  "521\n");
        assertNull(memory.parentArea());
        assertEquals(memory.nestedCount(), 0);
        assertEquals(memory.variablesCount(), 0);
    }

    @Test
    public void areaDefCondLoopErrTest() throws IOException {
        String initialString =      "seisu c = 123;\n" +
                                    "shuki j = 0 : 5 kido\n" +
                                        "sorenara shinri > 0 kido\n" +
                                            "c = {10, 10};\n" +
                                        "shushi;" +
                                    "shushi;\n" +
                                    "senden c;";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        AreaVis memory = executeWithClear(initialString, progOut, progErr);

        assertEquals(progErr.toString().split("\n")[0],  "Semantic error: Type mismatch in definition if number in line 4");
        assertNull(memory.parentArea());
        assertEquals(memory.nestedCount(), 0);
        assertEquals(memory.variablesCount(), 0);
    }

    @Test
    public void areaAssignCondLoopTest() throws IOException {
        String initialString =      "seisu c = 123;\n" +
                                    "shuki j = 0 : 5 kido\n" +
                                    "sorenara shinri > 0 kido\n" +
                                    "hairetsu c = {1, 1};\n" +
                                    "senden c;\n" +
                                    "shushi;" +
                                    "shushi;\n" +
                                    "senden c;";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        AreaVis memory = executeWithClear(initialString, progOut, progErr);
        String[] output = progErr.toString().split("\n");

        assertEquals(output[0],  "{{undefined}}");
        assertEquals(output[1],  "123");
        assertNull(memory.parentArea());
        assertEquals(memory.nestedCount(), 0);
        assertEquals(memory.variablesCount(), 0);
    }

    @Test
    public void areaAssignCondLoop2Test() throws IOException {
        String initialString =      "seisu c = 123;\n" +
                                    "shuki j = 0 : 5 kido\n" +
                                    "sorenara shinri > 0 kido\n" +
                                    "seisu c = 555;\n" +
                                    "senden c;\n" +
                                    "shushi;" +
                                    "shushi;\n" +
                                    "senden c;";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        AreaVis memory = executeWithClear(initialString, progOut, progErr);
        String[] output = progOut.toString().split("\n");

        //System.out.println(progOut.toString());

        assertEquals(output[0],  "555");
        assertEquals(output[1],  "555");
        assertEquals(output[2],  "555");
        assertEquals(output[3],  "555");
        assertEquals(output[4],  "555");
        assertEquals(output[5],  "123");
        assertNull(memory.parentArea());
        assertEquals(memory.nestedCount(), 0);
        assertEquals(memory.variablesCount(), 0);
    }

    @Test
    public void fiboFIFTest() throws IOException {
        String initialString =      "seisu kansu fiboWrap(seisu f) kido\n" +
                                    "   seisu kansu fibo(seisu f) kido\n" +
                                    "       sorenara f < 3 kido\n" +
                                    "           modoru 1;\n" +
                                    "       shushi;\n" +
                                    "       modoru fibo(f-2) + fibo(f-1);\n" +
                                    "   shushi;\n" +
                                    "   seisu k = fibo(f);\n" +
                                    "   modoru k;\n" +
                                    "shushi;" +
                                    "senden fiboWrap(10);";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        AreaVis memory = executeWithClear(initialString, progOut, progErr);

        assertEquals(progOut.toString(),  "55\n");
        assertNull(memory.parentArea());
        assertEquals(memory.nestedCount(), 0);
        assertEquals(memory.variablesCount(), 0);
    }

    @Test
    public void fiboFIF2Test() throws IOException {
        String initialString =      "seisu kansu fiboWrap(seisu ff) kido\n" +
                                    "   seisu kansu fibo(seisu f) kido\n" +
                                    "       sorenara f < 3 kido\n" +
                                    "           modoru 1;\n" +
                                    "       shushi;\n" +
                                    "       modoru fibo(f-2) + fibo(f-1);\n" +
                                    "   shushi;\n" +
                                    "   seisu k = fibo(ff);\n" +
                                    "   modoru k;\n" +
                                    "shushi;" +
                                    "senden fiboWrap(10);";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        AreaVis memory = executeWithClear(initialString, progOut, progErr);

        assertEquals(progOut.toString(),  "55\n");
        assertNull(memory.parentArea());
        assertEquals(memory.nestedCount(), 0);
        assertEquals(memory.variablesCount(), 0);
    }
}
