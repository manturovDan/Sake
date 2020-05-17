import man.dan.interpreter.Interpreter;
import man.dan.robot.Maze;
import man.dan.robot.Travel;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class MazeTest {
    protected Travel goMaze(String pathToAlg, String pathToMaze, OutputStream progOut, OutputStream progErr) throws Exception {
        InputStream progIn = new FileInputStream(pathToAlg);
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
    public void maze1ToFinish() throws Exception {
        String pathToSake = "SakePrograms/Robot/Minotaur.sake";
        String pathToMaze = "tests/mazes/simplem1.maze";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        Travel travel = goMaze(pathToSake, pathToMaze, progOut, progErr);

        //System.out.println(progOut.toString());
        //System.out.println(progErr.toString());

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        assertEquals(phrasesOut[0], "-> { X 26, Y 9, Z 5 }");

        assertEquals(phrasesErr.length, 1);
        assertEquals(phrasesErr[0], "");

    }
}
