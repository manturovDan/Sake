import man.dan.interpreter.Interpreter;
import man.dan.memory.AreaVis;
import man.dan.robot.Maze;
import man.dan.robot.Passage;
import man.dan.robot.RoboState;
import man.dan.robot.Travel;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class RoboTest {
    protected Travel go(String initialString, String pathToMaze, OutputStream progOut, OutputStream progErr) throws Exception {
        InputStream progIn = new ByteArrayInputStream(initialString.getBytes());
        Interpreter interpreter;
        interpreter = new Interpreter(progIn, progOut, progErr);

        InputStream mazeIn = new FileInputStream(pathToMaze);
        Maze lab = new Maze(mazeIn);

        Travel travel = new Travel(lab, 0);

        Thread goon = new Thread(travel);
        goon.start();

        interpreter.setTravel(travel);
        travel.lock();

        interpreter.run();
        return travel;
    }

    @Test
    public void simpMazeTest() throws Exception {
        String initialString =      "seisu c = 123;\n" +
                "shuki j = 0 : 5 kido\n" +
                "sorenara shinri > 0 kido\n" +
                "c = 521;\n" +
                "shushi;" +
                "shushi;\n" +
                "senden c;";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        Travel travel = go(initialString, "tests/mazes/simplem1.maze", progOut, progErr);

        Maze maze = travel.getMaze();

        assertEquals(maze.rX(), 25);
        assertEquals(maze.rY(), 9);
        assertEquals(maze.rZ(), 5);
        assertEquals(travel.getRx(), 25);
        assertEquals(travel.getRy(), 9);
        assertEquals(travel.getRz(), 5);
        assertEquals(travel.getDelay(), 0);
        assertEquals(travel.getStatus(), RoboState.inMotion);

        assertTrue(maze.isPassage(new Passage(24, 9, 5)));
        assertTrue(maze.isPassage(new Passage(24, 10, 5)));
        assertTrue(maze.isPassage(new Passage(24, 9, 6)));
        assertTrue(maze.isPassage(new Passage(25, 9, 5)));
        assertTrue(maze.isPassage(new Passage(26, 9, 5)));
        assertTrue(maze.isPassage(new Passage(26, 8, 5)));
        assertTrue(maze.isPassage(new Passage(26, 7, 5)));
        assertTrue(maze.isPassage(new Passage(26, 9, 6)));
        assertTrue(maze.isPassage(new Passage(26, 9, 7)));
        assertTrue(maze.isPassage(new Passage(26, 9, 8)));
        assertTrue(maze.isPassage(new Passage(26, 9, 9)));
        assertTrue(maze.isPassage(new Passage(26, 9, 10)));
        assertTrue(maze.isPassage(new Passage(27, 9, 8)));
        assertTrue(maze.isPassage(new Passage(28, 9, 8)));
        assertTrue(maze.isPassage(new Passage(29, 9, 8)));
        assertTrue(maze.isPassage(new Passage(28, 10, 8)));
        assertTrue(maze.isPassage(new Passage(29, 10, 8)));
        assertTrue(maze.isPassage(new Passage(28, 8, 8)));
        assertTrue(maze.isPassage(new Passage(29, 8, 8)));

        assertFalse(maze.isPassage(new Passage(20, 9, 5)));
        assertFalse(maze.isPassage(new Passage(30, 0, 5)));
        assertFalse(maze.isPassage(new Passage(29, 9, 9)));
        assertFalse(maze.isPassage(new Passage(0, 0, 0)));
        assertFalse(maze.isPassage(new Passage(24, 9, 7)));
        assertFalse(maze.isPassage(new Passage(3, 1, -12)));
        assertFalse(maze.isPassage(new Passage(20, 19, 5)));
        assertFalse(maze.isPassage(new Passage(201, 9, 5)));

        assertTrue(maze.isPassagePoor(new Passage(28, 10, 8, true)));
        assertTrue(maze.isPassagePoor(new Passage(29, 8, 8, true)));
        assertFalse(maze.isPassagePoor(new Passage(29, 10, 8, true)));
        assertFalse(maze.isPassagePoor(new Passage(29, 20, 8, true)));

        assertEquals(maze.mazeSize(), 19);

    }

    @Test
    public void motionTest() throws Exception {
        String initialString =      "{>->; >->};";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        Travel travel = go(initialString, "tests/mazes/simplem1.maze", progOut, progErr);

        //System.out.println(progOut.toString());
        //System.out.println(progErr.toString());

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        assertEquals(phrasesOut[0], "-> { X 26, Y 9, Z 5 }");
        assertEquals(phrasesOut[1], "-> { X 27, Y 9, Z 5 }");
        assertEquals(phrasesOut[2], "*_*");

        assertEquals(phrasesErr.length, 1);
        assertEquals(phrasesErr[0], "");

    }

    @Test
    public void motionErrTest() throws Exception {
        String initialString =      "{>->; >->; <-<};";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        Travel travel = go(initialString, "tests/mazes/simplem1.maze", progOut, progErr);

        //System.out.println(progOut.toString());
        //System.out.println(progErr.toString());

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        assertEquals(phrasesOut[0], "-> { X 26, Y 9, Z 5 }");
        assertEquals(phrasesOut[1], "-> { X 27, Y 9, Z 5 }");
        assertEquals(phrasesOut[2], "*_*");

        assertEquals(phrasesErr.length, 1);
        assertEquals(phrasesErr[0], "Semantic error: trying to manipulate died robot in line 1");

    }

    @Test
    public void complMotionTest() throws Exception {
        String initialString =      "{>->; ~-~; ~-~; o-o};\n" +
                                    "o-o;\n" +
                                    "{^-^};\n" +
                                    "^-^;\n" +
                                    "v-v;\n" +
                                    "{^-^;^-^;^-^;^-^};\n" +
                                    "v-v;\n" +
                                    "{v-v;>->};\n" +
                                    "{>->};\n" +
                                    "{>->};\n" +
                                    "o-o;\n" +
                                    "<-<;\n" +
                                    "" +
                                    "<-<;\n" +
                                    "o-0;";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        Travel travel = go(initialString, "tests/mazes/simplem1.maze", progOut, progErr);

        //System.out.println(progOut.toString());
        //System.out.println(progErr.toString());

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        assertEquals(phrasesOut.length, 20);

        assertEquals(phrasesOut[0], "-> { X 26, Y 9, Z 5 }"); //>
        assertEquals(phrasesOut[1], "-> { X 26, Y 8, Z 5 }"); //~
        assertEquals(phrasesOut[2], "-> { X 26, Y 7, Z 5 }"); //~
        assertEquals(phrasesOut[3], "-> { X 26, Y 8, Z 5 }"); //o
        assertEquals(phrasesOut[4], "-> { X 26, Y 9, Z 5 }"); //o
        assertEquals(phrasesOut[5], "-> { X 26, Y 9, Z 6 }"); //o
        assertEquals(phrasesOut[6], "-> { X 26, Y 9, Z 7 }"); //^
        assertEquals(phrasesOut[7], "-> { X 26, Y 9, Z 6 }"); //v
        assertEquals(phrasesOut[8], "-> { X 26, Y 9, Z 7 }"); //^
        assertEquals(phrasesOut[9], "-> { X 26, Y 9, Z 8 }"); //^
        assertEquals(phrasesOut[10], "-> { X 26, Y 9, Z 9 }"); //^
        assertEquals(phrasesOut[11], "-> { X 26, Y 9, Z 10 }"); //^
        assertEquals(phrasesOut[12], "-> { X 26, Y 9, Z 9 }"); //v
        assertEquals(phrasesOut[13], "-> { X 26, Y 9, Z 8 }"); //v
        assertEquals(phrasesOut[14], "-> { X 27, Y 9, Z 8 }"); //>
        assertEquals(phrasesOut[15], "-> { X 28, Y 9, Z 8 }"); //>
        assertEquals(phrasesOut[16], "-> { X 29, Y 9, Z 8 }"); //>
        assertEquals(phrasesOut[17], "-> { X 29, Y 10, Z 8 }"); //^
        assertEquals(phrasesOut[18], "-> { X 28, Y 10, Z 8 }"); //<
        assertEquals(phrasesOut[19], "SUCCESS"); //success

        assertEquals(phrasesErr.length, 2);
        assertEquals(phrasesErr[0], "Semantic error: trying to manipulate successful robot in line 13");
        assertEquals(phrasesErr[1], "Semantic error: trying to manipulate successful robot in line 14");

    }

    @Test
    public void complSensorTest() throws Exception {
        String initialString =      "hairetsu view = {>-0; v-0; <-0};\n" +
                                    "senden view;\n" +
                                    "view = ^-0;\n" +
                                    "senden view;\n" +
                                    "senden {>->; ~-0; ~-~; ~-~; o-o};\n" +
                                    "o-o;\n" +
                                    "senden funfun({^-0;^-^}, 1);\n" +
                                    "^-^;\n" +
                                    "v-v;\n" +
                                    "hairetsu view2 = {^-^; >-0; ^-^; <-0; ^-^; ^-^};\n" +
                                    "seisu c = funfun(view2, 0);\n" +
                                    "v-v;\n" +
                                    "senden {o-0;v-v;~-0;>->;~-0};\n" +
                                    "{>->};\n" +
                                    "senden {>-0; o-0};\n" +
                                    "senden {>->; >-0; >->; ^-0};\n" +
                                     "" +
                                    "o-o;\n" +
                                    "<-<;\n" +
                                    "<-<;\n" +
                                    "o-0;\n" +
                                    "seisu kansu funfun(hairetsu meas, seisu _) kido\n" +
                                    "   shuki k = 0 : nagasa meas kido\n" +
                                    "       meas[k] => X = meas[k] => X + _;\n" +
                                    "       meas[k] => Y = meas[k] => Y + _;\n" +
                                    "       meas[k] => Z = meas[k] => Z + _;\n" +
                                    "   shushi;\n" +
                                    "   senden meas;\n" +
                                    "   modoru 0;\n" +
                                    "shushi;\n";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        Travel travel = go(initialString, "tests/mazes/simplem1.maze", progOut, progErr);

        //System.out.println(progOut.toString());
        //System.out.println(progErr.toString());

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        //assertEquals(phrasesOut.length, 20);

        StringBuilder phrase1 = new StringBuilder(phrasesOut[0]);
        phrase1.setLength(phrase1.length() - 1);
        phrase1.deleteCharAt(0);
        ArrayList<String> phrase1Parts = new ArrayList<>(Arrays.asList(phrase1.toString().split(", ")));

        assertTrue(phrase1Parts.contains("{ X : 23; Y : 9; Z : 5; isKabe : true }"));
        assertTrue(phrase1Parts.contains("{ X : 24; Y : 9; Z : 5; isKabe : false }"));
        assertTrue(phrase1Parts.contains("{ X : 26; Y : 9; Z : 5; isKabe : false }"));
        assertTrue(phrase1Parts.contains("{ X : 27; Y : 9; Z : 5; isKabe : true }"));
        assertTrue(phrase1Parts.contains("{ X : 25; Y : 9; Z : 4; isKabe : true }"));
        assertEquals(phrase1Parts.size(), 5);
        assertEquals(phrasesOut[1], "{{ X : 25; Y : 9; Z : 6; isKabe : true }}"); //>
        assertEquals(phrasesOut[2], "-> { X 26, Y 9, Z 5 }"); //>
        assertEquals(phrasesOut[3], "-> { X 26, Y 8, Z 5 }"); //~
        assertEquals(phrasesOut[4], "-> { X 26, Y 7, Z 5 }"); //~
        assertEquals(phrasesOut[5], "-> { X 26, Y 8, Z 5 }"); //o

        StringBuilder phrase2 = new StringBuilder(phrasesOut[6]);
        phrase2.setLength(phrase2.length() - 1);
        phrase2.deleteCharAt(0);
        ArrayList<String> phrase2Parts = new ArrayList<>(Arrays.asList(phrase2.toString().split(", ")));

        assertTrue(phrase2Parts.contains("{ X : 26; Y : 6; Z : 5; isKabe : true }"));
        assertTrue(phrase2Parts.contains("{ X : 26; Y : 8; Z : 5; isKabe : false }"));
        assertTrue(phrase2Parts.contains("{ X : 26; Y : 7; Z : 5; isKabe : false }"));
        assertEquals(phrase2Parts.size(), 3);

        assertEquals(phrasesOut[7], "-> { X 26, Y 9, Z 5 }"); //o
        assertEquals(phrasesOut[8], "-> { X 26, Y 9, Z 6 }"); //^

        StringBuilder phrase3 = new StringBuilder(phrasesOut[9]);
        phrase3.setLength(phrase3.length() - 1);
        phrase3.deleteCharAt(0);
        ArrayList<String> phrase3Parts = new ArrayList<>(Arrays.asList(phrase3.toString().split(", ")));

        assertTrue(phrase3Parts.contains("{ X : 27; Y : 10; Z : 7; isKabe : false }"));
        assertTrue(phrase3Parts.contains("{ X : 27; Y : 10; Z : 8; isKabe : false }"));
        assertTrue(phrase3Parts.contains("{ X : 27; Y : 10; Z : 9; isKabe : false }"));
        assertTrue(phrase3Parts.contains("{ X : 27; Y : 10; Z : 10; isKabe : false }"));
        assertTrue(phrase3Parts.contains("{ X : 27; Y : 10; Z : 11; isKabe : false }"));
        assertTrue(phrase3Parts.contains("{ X : 27; Y : 10; Z : 12; isKabe : true }"));
        assertEquals(phrase3Parts.size(), 6);

        assertEquals(phrasesOut[10], "0");
        assertEquals(phrasesOut[11], "-> { X 26, Y 9, Z 7 }"); //^
        assertEquals(phrasesOut[12], "-> { X 26, Y 9, Z 6 }"); //v
        assertEquals(phrasesOut[13], "-> { X 26, Y 9, Z 7 }"); //^
        assertEquals(phrasesOut[14], "-> { X 26, Y 9, Z 8 }"); //^
        assertEquals(phrasesOut[15], "-> { X 26, Y 9, Z 9 }"); //^
        assertEquals(phrasesOut[16], "-> { X 26, Y 9, Z 10 }"); //^
        assertEquals(phrasesOut[17], "{{ X : 25; Y : 9; Z : 8; isKabe : true }, { X : 27; Y : 9; Z : 7; isKabe : true }}");
        assertEquals(phrasesOut[18], "-> { X 26, Y 9, Z 9 }"); //v
        assertEquals(phrasesOut[19], "-> { X 26, Y 9, Z 8 }"); //v
        assertEquals(phrasesOut[20], "-> { X 27, Y 9, Z 8 }"); //>

        StringBuilder phrase5 = new StringBuilder(phrasesOut[21]);
        phrase5.setLength(phrase5.length() - 1);
        phrase5.deleteCharAt(0);
        ArrayList<String> phrase5Parts = new ArrayList<>(Arrays.asList(phrase5.toString().split(", ")));

        assertTrue(phrase5Parts.contains("{ X : 26; Y : 10; Z : 9; isKabe : true }"));
        assertTrue(phrase5Parts.contains("{ X : 26; Y : 8; Z : 8; isKabe : true }"));
        assertTrue(phrase5Parts.contains("{ X : 27; Y : 8; Z : 8; isKabe : true }"));
        assertEquals(phrase5Parts.size(), 3);

        assertEquals(phrasesOut[22], "-> { X 28, Y 9, Z 8 }"); //>

        StringBuilder phrase6 = new StringBuilder(phrasesOut[23]);
        phrase6.setLength(phrase6.length() - 1);
        phrase6.deleteCharAt(0);
        ArrayList<String> phrase6Parts = new ArrayList<>(Arrays.asList(phrase6.toString().split(", ")));

        assertTrue(phrase6Parts.contains("{ X : 29; Y : 9; Z : 8; isKabe : false }"));
        assertTrue(phrase6Parts.contains("{ X : 28; Y : 10; Z : 8; isKabe : false }"));
        assertTrue(phrase6Parts.contains("{ X : 28; Y : 11; Z : 8; isKabe : true }"));
        assertEquals(phrase6Parts.size(), 3);

        assertEquals(phrasesOut[24], "-> { X 29, Y 9, Z 8 }"); //>
        assertEquals(phrasesOut[25], "-> { X 30, Y 9, Z 8 }"); //>x
        assertEquals(phrasesOut[26], "*_*"); //crash
        assertEquals(phrasesOut[27], "{}");

        assertEquals(phrasesOut.length, 28);

        assertEquals(phrasesErr.length, 5);
        assertEquals(phrasesErr[0], "Semantic error: trying to manipulate died robot in line 16");
        assertEquals(phrasesErr[1], "Semantic error: trying to manipulate died robot in line 17");
        assertEquals(phrasesErr[2], "Semantic error: trying to manipulate died robot in line 18");
        assertEquals(phrasesErr[3], "Semantic error: trying to manipulate died robot in line 19");
        assertEquals(phrasesErr[4], "Semantic error: trying to manipulate died robot in line 20");

    }

    @Test
    public void stupidMotionTest() throws Exception {
        StringBuilder sen = new StringBuilder("<-0; >-<; <-<;");
        for(int i = 0; i < 6; ++i)
            sen.append(sen);
        sen.setLength(sen.length() - 1);

        StringBuilder senFw = new StringBuilder("o-0; >-<; o-o;");
        for(int i = 0; i < 6; ++i)
            senFw.append(senFw);
        senFw.setLength(senFw.length() - 1);

        StringBuilder senRight = new StringBuilder(">-0; >-<; >->;");
        for(int i = 0; i < 6; ++i)
            senRight.append(senRight);
        senRight.setLength(senRight.length() - 1);


        String initialString =      "senden {" + sen + "};\n" +
                                    "senden ~-0;\n" +
                                    "senden {" + senFw + "};\n" +
                                    "senden {v-0; " + senRight + "};\n" +
                                    "senden {^-0; ^-0; >-<; ^-^; ^-0; ^-0; >-<; ^-^; ^-0; ^-0; >-<; ^-^; ^-0; ^-0; >-<; ^-^; ^-0; ^-0; >-<; ^-^};\n" +
                                    "{-; <-<};";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        Travel travel = go(initialString, "tests/mazes/simplem2.maze", progOut, progErr);

        //System.out.println(progOut.toString());
        //System.out.println(progErr.toString());

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        //assertEquals(phrasesOut.length, 20);

        assertEquals(phrasesOut[0], "-> { X 13, Y 0, Z 0 }");
        assertEquals(phrasesOut[1], "-> { X 12, Y 0, Z 0 }");
        assertEquals(phrasesOut[2], "-> { X 11, Y 0, Z 0 }");
        assertEquals(phrasesOut[3], "-> { X 10, Y 0, Z 0 }");
        assertEquals(phrasesOut[4], "-> { X 9, Y 0, Z 0 }");
        assertEquals(phrasesOut[5], "-> { X 8, Y 0, Z 0 }");
        assertEquals(phrasesOut[6], "-> { X 7, Y 0, Z 0 }");
        assertEquals(phrasesOut[7], "-> { X 6, Y 0, Z 0 }");
        assertEquals(phrasesOut[8], "-> { X 5, Y 0, Z 0 }");
        assertEquals(phrasesOut[9], "-> { X 4, Y 0, Z 0 }");
        assertEquals(phrasesOut[10], "-> { X 3, Y 0, Z 0 }");
        assertEquals(phrasesOut[11], "-> { X 2, Y 0, Z 0 }");
        assertEquals(phrasesOut[12], "-> { X 1, Y 0, Z 0 }");
        assertEquals(phrasesOut[13], "-> { X 0, Y 0, Z 0 }");

        StringBuilder phraseLeft = new StringBuilder(phrasesOut[14]);
        phraseLeft.setLength(phraseLeft.length() - 1);
        phraseLeft.deleteCharAt(0);
        ArrayList<String> phraseLeftParts = new ArrayList<>(Arrays.asList(phraseLeft.toString().split(", ")));

        assertTrue(phraseLeftParts.contains("{ X : 13; Y : 0; Z : 0; isKabe : false }"));
        assertTrue(phraseLeftParts.contains("{ X : 12; Y : 0; Z : 0; isKabe : false }"));
        assertTrue(phraseLeftParts.contains("{ X : 11; Y : 0; Z : 0; isKabe : false }"));
        assertTrue(phraseLeftParts.contains("{ X : 10; Y : 0; Z : 0; isKabe : false }"));
        assertTrue(phraseLeftParts.contains("{ X : 9; Y : 0; Z : 0; isKabe : false }"));
        assertTrue(phraseLeftParts.contains("{ X : 8; Y : 0; Z : 0; isKabe : false }"));
        assertTrue(phraseLeftParts.contains("{ X : 7; Y : 0; Z : 0; isKabe : false }"));
        assertTrue(phraseLeftParts.contains("{ X : 6; Y : 0; Z : 0; isKabe : false }"));
        assertTrue(phraseLeftParts.contains("{ X : 5; Y : 0; Z : 0; isKabe : false }"));
        assertTrue(phraseLeftParts.contains("{ X : 4; Y : 0; Z : 0; isKabe : false }"));
        assertTrue(phraseLeftParts.contains("{ X : 3; Y : 0; Z : 0; isKabe : false }"));
        assertTrue(phraseLeftParts.contains("{ X : 2; Y : 0; Z : 0; isKabe : false }"));
        assertTrue(phraseLeftParts.contains("{ X : 1; Y : 0; Z : 0; isKabe : false }"));
        assertTrue(phraseLeftParts.contains("{ X : 0; Y : 0; Z : 0; isKabe : false }"));
        assertEquals(phraseLeftParts.size(), 14);

        assertEquals(phrasesOut[15], "{}");

        assertEquals(phrasesOut[16], "-> { X 0, Y 1, Z 0 }");
        assertEquals(phrasesOut[17], "-> { X 0, Y 2, Z 0 }");
        assertEquals(phrasesOut[18], "-> { X 0, Y 3, Z 0 }");
        assertEquals(phrasesOut[19], "-> { X 0, Y 4, Z 0 }");
        assertEquals(phrasesOut[20], "-> { X 0, Y 5, Z 0 }");
        assertEquals(phrasesOut[21], "-> { X 0, Y 6, Z 0 }");

        StringBuilder phraseTop = new StringBuilder(phrasesOut[22]);
        phraseTop.setLength(phraseTop.length() - 1);
        phraseTop.deleteCharAt(0);
        ArrayList<String> phraseTopParts = new ArrayList<>(Arrays.asList(phraseTop.toString().split(", ")));

        assertTrue(phraseTopParts.contains("{ X : 0; Y : 1; Z : 0; isKabe : false }"));
        assertTrue(phraseTopParts.contains("{ X : 0; Y : 2; Z : 0; isKabe : false }"));
        assertTrue(phraseTopParts.contains("{ X : 0; Y : 3; Z : 0; isKabe : false }"));
        assertTrue(phraseTopParts.contains("{ X : 0; Y : 4; Z : 0; isKabe : false }"));
        assertTrue(phraseTopParts.contains("{ X : 0; Y : 5; Z : 0; isKabe : false }"));
        assertTrue(phraseTopParts.contains("{ X : 0; Y : 6; Z : 0; isKabe : false }"));
        assertTrue(phraseTopParts.contains("{ X : 0; Y : 7; Z : 0; isKabe : true }"));
        assertEquals(phraseTopParts.size(), 7);

        assertEquals(phrasesOut[23], "-> { X 1, Y 6, Z 0 }");
        assertEquals(phrasesOut[24], "-> { X 2, Y 6, Z 0 }");
        assertEquals(phrasesOut[25], "-> { X 3, Y 6, Z 0 }");
        assertEquals(phrasesOut[26], "-> { X 4, Y 6, Z 0 }");
        assertEquals(phrasesOut[27], "-> { X 5, Y 6, Z 0 }");

        StringBuilder phraseRight = new StringBuilder(phrasesOut[28]);
        phraseRight.setLength(phraseRight.length() - 1);
        phraseRight.deleteCharAt(0);
        ArrayList<String> phraseRightParts = new ArrayList<>(Arrays.asList(phraseRight.toString().split(", ")));

        assertTrue(phraseRightParts.contains("{ X : 1; Y : 6; Z : 0; isKabe : false }"));
        assertTrue(phraseRightParts.contains("{ X : 2; Y : 6; Z : 0; isKabe : false }"));
        assertTrue(phraseRightParts.contains("{ X : 3; Y : 6; Z : 0; isKabe : false }"));
        assertTrue(phraseRightParts.contains("{ X : 4; Y : 6; Z : 0; isKabe : false }"));
        assertTrue(phraseRightParts.contains("{ X : 5; Y : 6; Z : 0; isKabe : false }"));
        assertTrue(phraseRightParts.contains("{ X : 6; Y : 6; Z : 0; isKabe : true }"));
        assertEquals(phraseRightParts.size(), 6);

        assertEquals(phrasesOut[29], "-> { X 5, Y 6, Z 1 }");
        assertEquals(phrasesOut[30], "{{ X : 5; Y : 6; Z : 1; isKabe : false }, { X : 5; Y : 6; Z : 2; isKabe : true }}");
        assertEquals(phrasesOut[31], "-> { X 4, Y 6, Z 1 }");
        assertEquals(phrasesOut[32], "SUCCESS");

        assertEquals(phrasesOut.length, 33);

        assertEquals(phrasesErr.length, 3);
        assertEquals(phrasesErr[0], "Syntax Error: mismatched input '-' expecting {'^-^', 'v-v', '<-<', '>->', 'o-o', '~-~', '>-<', '^-0', 'v-0', '<-0', '>-0', 'o-0', '~-0'} in line 6, at character 1");
        assertEquals(phrasesErr[1], "There are (is) 1 syntax error(s) in the program");
        assertEquals(phrasesErr[2], "Semantic error: unknown robot command in line 6");
    }
}
