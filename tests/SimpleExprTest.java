import man.dan.interpreter.Interpreter;
import man.dan.langobj.Countable;
import man.dan.langobj.Hairetsu;
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
import java.util.Collections;

import static org.junit.Assert.*;

public class SimpleExprTest {
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
        String initialString =  "seisu b =   x98;\n" +
                                "seisu c1 =   123;\n" +
                                "\n" +
                                "seisu aa1 = b    + c1;\n" +
                                "    #senden   aa1;\n" +
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
                                "shushi;\n";

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
                                    "carr[0, 1, 0, 1] => Z = 5;" +
                                    "seisu k = carr[0, 1, 0, 1] => Y + - 3;";

        AreaVis memory = execute(initialString);

        assertEquals(((Countable)(memory.getValByPtr(new Pointer("cube1", CubeAttr.X)))).getValue(), 0);
        assertEquals(((Countable)(memory.getValByPtr(new Pointer("cube1", CubeAttr.Y)))).getValue(), 1);
        assertEquals(((Countable)(memory.getValByPtr(new Pointer("cube1", CubeAttr.Z)))).getValue(), 2);
        assertEquals(((Countable)(memory.getValByPtr(new Pointer("cube1", CubeAttr.kabe)))).getValue(), 0);

        assertEquals(((Countable)(memory.getValByPtr(new Pointer("carr", new ArrayList<>(Arrays.asList(0, 1, 0, 1)), CubeAttr.X)))).getValue(), 0);
        assertEquals(((Countable)(memory.getValByPtr(new Pointer("carr", new ArrayList<>(Arrays.asList(0, 1, 0, 1)), CubeAttr.Y)))).getValue(), 1);
        assertEquals(((Countable)(memory.getValByPtr(new Pointer("carr", new ArrayList<>(Arrays.asList(0, 1, 0, 1)), CubeAttr.Z)))).getValue(), 5);
        assertEquals(((Countable)(memory.getValByPtr(new Pointer("carr", new ArrayList<>(Arrays.asList(0, 1, 0, 1)), CubeAttr.kabe)))).getValue(), 0);

        assertEquals(((Countable)memory.getValByPtr("k")).getValue(), -2);
    }

    @Test
    public void funcTest() throws Exception {
        String initialString =      "seisu c1 = 56;\n" +
                                    "rippotai rip = [1, 2, 3, shinri];\n" +
                                    "hairetsu hai = {10, 2};\n" +
                                    "hai[2, 1] = rip;\n" +
                                    "hai[4, 1] = osu;\n" +
                                    "hai[0, 1] = {2, 2};\n" +
                                    "\n" +
                                    "seisu kansu functionCall(seisu a, rippotai b, hairetsu c, rippotai d, ronri e, hairetsu f, rippotai g, seisu h, hairetsu i) kido\n" +
                                    "    #senden 123;\n" +
                                    "    modoru 1;\n" +
                                    "shushi;\n" +
                                    "\n" +
                                    "seisu ret = functionCall(c1, rip, hai, [1, 1, 0, 0], x78A, {1, 1, 1}, hai[2, 1], hai[4, 1], hai[0, 1]);\n" +
                                    "\n" +
                                    "#senden c1;\n" +
                                    "#senden ret;";

        AreaVis memory = execute(initialString);

        assertEquals(((Countable)memory.getValByPtr("c1")).getValue(), 56);
        assertEquals(((Countable)memory.getValByPtr("ret")).getValue(), 1);
    }

    @Test
    public void fibonacciTest() throws Exception {
        String initialString =      "seisu kansu fibo(seisu f) kido\n" +
                                    "    sorenara f < 3 kido\n" +
                                    "        modoru 1;\n" +
                                    "    shushi;\n" +
                                    "\n" +
                                    "    modoru fibo(f-2) + fibo(f-1);\n" +
                                    "shushi;\n" +
                                    "\n" +
                                    "seisu k = fibo(30) - 1;";

        AreaVis memory = execute(initialString);

        assertEquals(((Countable)memory.getValByPtr("k")).getValue(),  832040-1);
    }

    @Test
    public void bubbleTest() throws Exception {
        String initialString =      "seisu kansu swap(hairetsu A, seisu i, seisu j) kido\n" +
                                    "    seisu c = A[i];\n" +
                                    "    A[i] = A[j];\n" +
                                    "    A[j] = c;\n" +
                                    "    modoru 0; #return\n" +
                                    "shushi;\n" +
                                    "\n" +
                                    "seisu kansu bubble(hairetsu A, seisu N) kido\n" +
                                    "    shuki j = 0 : N-1 kido\n" +
                                    "        ronri F = osu;\n" +
                                    "        shuki i = 0 : N-j-1 kido\n" +
                                    "            sorenara A[i] > A[i+1] kido\n" +
                                    "                swap(A, i, i+1);\n" +
                                    "                F = shinri;\n" +
                                    "            shushi;\n" +
                                    "        shushi;\n" +
                                    "\n" +
                                    "        sorenara ~F kido\n" +
                                    "            j = N - 2;\n" +
                                    "        shushi;\n" +
                                    "    shushi;\n" +
                                    "\n" +
                                    "    modoru 0;\n" +
                                    "shushi;\n" +
                                    "\n" +
                                    "seisu N = 10;\n" +
                                    "hairetsu A = {N};\n" +
                                    "A[0] = 21;\n" +
                                    "A[1] = -21;\n" +
                                    "A[2] = 33213;\n" +
                                    "A[3] = 321;\n" +
                                    "A[4] = -321;\n" +
                                    "A[5] = 5+5;\n" +
                                    "A[6] = 5+2+10<15-(1+2);\n" +
                                    "A[7] = 0;\n" +
                                    "A[8] = -1;\n" +
                                    "A[9] = -11;\n" +
                                    "\n" +
                                    "#senden A;\n" +
                                    "\n" +
                                    "bubble(A, N);\n" +
                                    "\n" +
                                    "#senden A;\n" +
                                    "\n" +
                                    "#bubble(A, N);\n";

        AreaVis memory = execute(initialString);

        assertEquals(((Countable)memory.getValByPtr(new Pointer("A", new ArrayList<>(Collections.singletonList(0))))).getValue(), -321);
        assertEquals(((Countable)memory.getValByPtr(new Pointer("A", new ArrayList<>(Collections.singletonList(1))))).getValue(), -21);
        assertEquals(((Countable)memory.getValByPtr(new Pointer("A", new ArrayList<>(Collections.singletonList(2))))).getValue(), -11);
        assertEquals(((Countable)memory.getValByPtr(new Pointer("A", new ArrayList<>(Collections.singletonList(3))))).getValue(), -1);
        assertEquals(((Countable)memory.getValByPtr(new Pointer("A", new ArrayList<>(Collections.singletonList(4))))).getValue(), 0);
        assertEquals(((Countable)memory.getValByPtr(new Pointer("A", new ArrayList<>(Collections.singletonList(5))))).getValue(), 0);
        assertEquals(((Countable)memory.getValByPtr(new Pointer("A", new ArrayList<>(Collections.singletonList(6))))).getValue(), 10);
        assertEquals(((Countable)memory.getValByPtr(new Pointer("A", new ArrayList<>(Collections.singletonList(7))))).getValue(), 21);
        assertEquals(((Countable)memory.getValByPtr(new Pointer("A", new ArrayList<>(Collections.singletonList(8))))).getValue(), 321);
        assertEquals(((Countable)memory.getValByPtr(new Pointer("A", new ArrayList<>(Collections.singletonList(9))))).getValue(), 33213);
    }

}

//1234