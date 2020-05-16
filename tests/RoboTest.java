import man.dan.interpreter.Interpreter;
import man.dan.memory.AreaVis;
import man.dan.robot.Maze;
import man.dan.robot.Passage;
import man.dan.robot.RoboState;
import man.dan.robot.Travel;
import org.junit.Test;

import java.io.*;

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

        System.out.println(progOut.toString());
        System.out.println(progErr.toString());

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        assertEquals(phrasesOut[0], "-> { X 26, Y 9, Z 5 }");
        assertEquals(phrasesOut[1], "-> { X 27, Y 9, Z 5 }");
        assertEquals(phrasesOut[2], "*_*");

        assertEquals(phrasesErr.length, 1);
        assertEquals(phrasesErr[0], "");

    }
}
