import man.dan.interpreter.Interpreter;
import man.dan.langobj.Countable;
import man.dan.memory.AreaVis;
import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class SimpleExprTest {
    AreaVis execute(String initialString) throws IOException {
        InputStream progIn = new ByteArrayInputStream(initialString.getBytes());
        Interpreter interpreter;
        interpreter = new Interpreter(System.in, System.out, System.out);
        AreaVis memory = interpreter.getMemory();
        interpreter.run(progIn);
        return memory;
    }

    @Test
    public void simpleCalc() throws Exception {
        String initialString =  "seisu b =   x98;\n" +
                                "seisu c1 =   123;\n" +
                                "\n" +
                                "seisu aa1 = b    + c1;\n" +
                                "    senden   aa1;\n" +
                                "c1 = c1 + -2;\n" +
                                "\n" +
                                "\n";

        AreaVis memory = execute(initialString);

        assertEquals(((Countable)memory.getValByName("c1")).getValue(), 121);
        assertEquals(((Countable)memory.getValByName("b")).getValue(), 152);
    }

    @Test
    public void simpleCondTTest() throws Exception {
        String initialString =  "seisu var1 = x578;\n" + //1400
                                "ronri bl = shinri;\n" +
                                "seisu c = var1 + (bl + 2);\n" +
                                "sorenara (var1 > 100) kido\n" +
                                "    bl = 500;\n" +
                                "    var1 = (bl + var1);\n" +
                                "shushi;\n" +
                                "ronri k = var1 < bl;\n";

        AreaVis memory = execute(initialString);

        assertEquals(((Countable)memory.getValByName("var1")).getValue(), 1900);
        assertEquals(((Countable)memory.getValByName("bl")).getValue(), 500);
        assertEquals(((Countable)memory.getValByName("c")).getValue(), 1403);
        assertEquals(((Countable)memory.getValByName("k")).getValue(), 0);
    }

    @Test
    public void simpleCondFTest() throws Exception {
        String initialString =  "seisu var1 = x578;\n" + //1400
                                "ronri bl = shinri;\n" +
                                "seisu c = var1 + (bl + 2);\n" +
                                "sorenara (var1 < 100) kido\n" +
                                "    bl = 500;\n" +
                                "    var1 = (bl + var1);\n" +
                                "shushi;\n" +
                                "ronri k = var1 > bl;\n";

        AreaVis memory = execute(initialString);

        assertEquals(((Countable)memory.getValByName("var1")).getValue(), 1400);
        assertEquals(((Countable)memory.getValByName("bl")).getValue(), 1);
        assertEquals(((Countable)memory.getValByName("c")).getValue(), 1403);
        assertEquals(((Countable)memory.getValByName("k")).getValue(), 1);
    }

    @Test
    public void simpleLoopTest() throws Exception {
        String initialString =      "seisu some_var = -201;\n" +
                                    "seisu target = 10000;\n" +
                                    "seisu counter = 0;\n" +
                                    "seisu cont = -1;\n" +
                                    "\n" +
                                    "shuki i = some_var - 1 : target - -2 kido\n" +
                                    "    seisu some_var = 5;\n" +
                                    "    cont = some_var;\n" +
                                    "    counter = counter + 1;\n" +
                                    "shushi;";

        AreaVis memory = execute(initialString);

        assertEquals(((Countable)memory.getValByName("some_var")).getValue(), -201);
        assertEquals(((Countable)memory.getValByName("target")).getValue(), 10000);
        assertEquals(((Countable)memory.getValByName("counter")).getValue(), 10204);
        assertEquals(((Countable)memory.getValByName("cont")).getValue(), 5);
    }
}
