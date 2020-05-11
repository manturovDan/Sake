import man.dan.interpreter.Interpreter;
import man.dan.langobj.Countable;
import man.dan.langobj.Hairetsu;
import man.dan.langobj.Rippotai;
import man.dan.langobj.Undefined;
import man.dan.memory.AreaVis;
import man.dan.parser.SakeParserParser;
import man.dan.visitor.CubeAttr;
import man.dan.visitor.Pointer;
import org.junit.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

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

        assertEquals(((Countable)memory.getValByPtr("c1")).getValue(), 121);
        assertEquals(((Countable)memory.getValByPtr("b")).getValue(), 152);
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

        assertEquals(((Countable)memory.getValByPtr("var1")).getValue(), 1900);
        assertEquals(((Countable)memory.getValByPtr("bl")).getValue(), 500);
        assertEquals(((Countable)memory.getValByPtr("c")).getValue(), 1403);
        assertEquals(((Countable)memory.getValByPtr("k")).getValue(), 0);
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

        assertEquals(((Countable)memory.getValByPtr("var1")).getValue(), 1400);
        assertEquals(((Countable)memory.getValByPtr("bl")).getValue(), 1);
        assertEquals(((Countable)memory.getValByPtr("c")).getValue(), 1403);
        assertEquals(((Countable)memory.getValByPtr("k")).getValue(), 1);
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

        assertEquals(((Countable)memory.getValByPtr("some_var")).getValue(), -201);
        assertEquals(((Countable)memory.getValByPtr("target")).getValue(), 10000);
        assertEquals(((Countable)memory.getValByPtr("counter")).getValue(), 10204);
        assertEquals(((Countable)memory.getValByPtr("cont")).getValue(), 5);
    }

    @Test
    public void LoopIfTest() throws Exception {
        String initialString =  "seisu undef;\n" +
                                "ronri undef_ron;\n" +
                                "undef_ron = osu;\n" +
                                "seisu redef = -(4-9);\n" +
                                "undef = redef;\n" +
                                "seisu ko;\n" +
                                "shuki k1 = 0 : (5+2) kido\n" +
                                "    sorenara redef > 9 kido\n" +
                                "        redef = redef + 2;\n" +
                                "    shushi;\n" +
                                "    \n" +
                                "    sorenara redef < 10 kido \n" +
                                "        redef = redef + 1;\n" +
                                "    shushi;\n" +
                                "shushi\n";

        AreaVis memory = execute(initialString);

        assertEquals(((Countable)memory.getValByPtr("undef")).getValue(), 5);
        assertEquals(((Countable)memory.getValByPtr("redef")).getValue(), 14);
        assertEquals(((Countable)memory.getValByPtr("undef_ron")).getValue(), 0);
        assertEquals(((Undefined)memory.getValByPtr("ko")).getType(), SakeParserParser.SEISU);
    }

    @Test
    public void arrayCrTest() throws Exception {
        String initialString =      "seisu b = 123;\n" +
                                    "hairetsu arr1 = { 4, 3, 2, 1 };\n" +
                                    "arr1[0, 0, 0, 0] = 56;\n" +
                                    "arr1[3, 0, 1, 0] = b + -3;\n" +
                                    "arr1[0, 0, 1, 0] = {2};\n" +
                                    "arr1[0, 0, 1, 0, 1]  = arr1[3, 0, 1, 0] < 1000;";

        AreaVis memory = execute(initialString);

        assertEquals(((Countable)memory.getValByPtr("b")).getValue(), 123);
        assertTrue(memory.getValByPtr("arr1") instanceof Hairetsu);
        assertEquals(((Countable)memory.getValByPtr(new Pointer("arr1", new ArrayList<>(Arrays.asList(0, 0, 0, 0))))).getValue(), 56);
        assertEquals(((Countable)memory.getValByPtr(new Pointer("arr1", new ArrayList<>(Arrays.asList(3, 0, 1, 0))))).getValue(), 120);
        assertTrue(memory.getValByPtr(new Pointer("arr1", new ArrayList<>(Arrays.asList(0, 0, 1, 0)))) instanceof Hairetsu);
        assertEquals(((Countable)memory.getValByPtr(new Pointer("arr1", new ArrayList<>(Arrays.asList(0, 0, 1, 0, 1))))).getValue(), 1);
    }

    @Test
    public void cubeTest() throws Exception {
        String initialString =      "rippotai cube1 = [0, 1, 2, osu];\n" +
                                    "hairetsu carr = {2, 2, 2, 2};\n" +
                                    "carr[0, 1, 0, 1] = cube1;\n" +
                                    "carr[0, 1, 0, 1] => Z = 5;";

        AreaVis memory = execute(initialString);

        assertEquals(((Countable)(memory.getValByPtr(new Pointer("cube1", CubeAttr.X)))).getValue(), 0);
        assertEquals(((Countable)(memory.getValByPtr(new Pointer("cube1", CubeAttr.Y)))).getValue(), 1);
        assertEquals(((Countable)(memory.getValByPtr(new Pointer("cube1", CubeAttr.Z)))).getValue(), 2);
        assertEquals(((Countable)(memory.getValByPtr(new Pointer("cube1", CubeAttr.kabe)))).getValue(), 0);

        assertEquals(((Countable)(memory.getValByPtr(new Pointer("carr", new ArrayList<>(Arrays.asList(0, 1, 0, 1)), CubeAttr.X)))).getValue(), 0);
        assertEquals(((Countable)(memory.getValByPtr(new Pointer("carr", new ArrayList<>(Arrays.asList(0, 1, 0, 1)), CubeAttr.Y)))).getValue(), 1);
        assertEquals(((Countable)(memory.getValByPtr(new Pointer("carr", new ArrayList<>(Arrays.asList(0, 1, 0, 1)), CubeAttr.Z)))).getValue(), 5);
        assertEquals(((Countable)(memory.getValByPtr(new Pointer("carr", new ArrayList<>(Arrays.asList(0, 1, 0, 1)), CubeAttr.kabe)))).getValue(), 0);
    }

}
