import man.dan.interpreter.Interpreter;
import man.dan.langobj.Countable;
import man.dan.memory.AreaVis;
import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class SimpleExprTest {
    @Test
    public void simpleCalc() throws Exception {
        String initialString = "seisu b =   x98;\n" +
                "seisu c1 =   123;\n" +
                "\n" +
                "seisu aa1 = b    + c1;\n" +
                "    senden   aa1;\n" +
                "c1 = c1 + -2;\n" +
                "\n" +
                "\n" +
                "senden aa1;senden c1;\n";

        InputStream progIn = new ByteArrayInputStream(initialString.getBytes());
        Interpreter interpreter;
        interpreter = new Interpreter(System.in, System.out, System.out);
        AreaVis memory = interpreter.getMemory();
        interpreter.run(progIn);

        assertEquals(((Countable)memory.getValByName("c1")).getValue(), 121);
        assertEquals(((Countable)memory.getValByName("b")).getValue(), 152);
    }

}
