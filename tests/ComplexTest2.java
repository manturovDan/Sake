import man.dan.interpreter.Interpreter;
import man.dan.langobj.Countable;
import man.dan.memory.AreaVis;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ComplexTest2 {
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

    @Test
    public void fibonacciTest5() throws Exception {
        String initialString =      "seisu kansu fibo(seisu f) kido\n" +
                "    sorenara f < 3 kido\n" +
                "        modoru 1;\n" +
                "    shushi;\n" +
                "\n" +
                "    modoru fibo(f-2) + fibo(f-1);\n" +
                "shushi;\n" +
                "\n" +
                "seisu k = fibo(5) - 5;";

        AreaVis memory = execute(initialString);

        assertEquals(((Countable)memory.getValByPtr("k")).getValue(),  5-5);
    }
}
