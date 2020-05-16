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
        assertEquals(phrasesOut[5], "-> { X 26, Y 9, Z 6 }"); //0
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
                                    "{^-0;^-^};\n" + //
                                    "^-^;\n" +
                                    "v-v;\n" +
                                    "#hairetsu vw = ^-0;\n" +
                                    "#senden vw;\n" +
                                    "#{^-^;^-^;^-^;^-^};\n" +
                                    "#v-v;\n" +
                                    "#{v-v;>->};\n" +
                                    "#{>->};\n" +
                                    "#{>->};\n" +
                                    "#o-o;\n" +
                                    "#<-<;\n" +
                                    "" +
                                    "#<-<;\n" +
                                    "#o-0;\n" +
                                    "seisu kansu funfun(hairetsu meas, seisu _) kido\n" +
                                    "   shuki k = 0 : nagasa meas kido\n" +
                                    "       meas[k] => X = meas[k] => X + _;\n" +
                                    "       meas[k] => Y = meas[k] => Y + _;\n" +
                                    "       meas[k] => Z = meas[k] => Z + _;\n" +
                                    "   shushi;\n" +
                                    "shushi;\n";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        Travel travel = go(initialString, "tests/mazes/simplem1.maze", progOut, progErr);

        System.out.println(progOut.toString());
        System.out.println(progErr.toString());

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

        assertEquals(phrasesOut[7], "-> { X 26, Y 9, Z 5 }"); //o
        /*assertEquals(phrasesOut[5], "-> { X 26, Y 9, Z 6 }"); //^
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
        assertEquals(phrasesErr[1], "Semantic error: trying to manipulate successful robot in line 14");*/

    }
}
