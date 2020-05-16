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
    public void simpMotion() throws Exception {
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

    }
}
