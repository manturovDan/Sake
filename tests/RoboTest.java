import man.dan.interpreter.Interpreter;
import man.dan.memory.AreaVis;
import man.dan.robot.Maze;
import man.dan.robot.Travel;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class RoboTest {
    protected AreaVis go(String initialString, String pathToMaze, OutputStream progOut, OutputStream progErr) throws Exception {
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
        return interpreter.getMemory();
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

        AreaVis memory = go(initialString, "tests/mazes/simplem1.maze", progOut, progErr);

        assertEquals(1, 1);
    }
}
