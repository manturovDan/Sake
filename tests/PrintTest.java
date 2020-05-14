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
    public void fiboPrint() throws IOException {
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
}
