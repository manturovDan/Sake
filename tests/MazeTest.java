import man.dan.interpreter.Interpreter;
import man.dan.robot.Maze;
import man.dan.robot.Passage;
import man.dan.robot.Travel;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MazeTest {
    private static Field getField(Class clazz, String fieldName)
            throws NoSuchFieldException {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw e;
            } else {
                return getField(superClass, fieldName);
            }
        }
    }

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

    protected void successTest(String pathToSake, String pathToMaze) throws Exception {
        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        Travel travel = goMaze(pathToSake, pathToMaze, progOut, progErr);
        Maze maze = travel.getMaze();

        //System.out.println(progOut.toString());
        //System.out.println(progErr.toString());

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        Pattern pattern = Pattern.compile("->\\s\\{\\sX\\s([0-9]+),\\sY\\s([0-9]+),\\sZ\\s([0-9]+)\\s}");
        int x, y, z, lx, ly, lz;
        x = y = z = lx = ly = lz = -1;
        int i = 0;
        Matcher match;

        while(true) {
            match = pattern.matcher(phrasesOut[i]);
            if (match.find()) {
                x = Integer.parseInt(match.group(1));
                y = Integer.parseInt(match.group(2));
                z = Integer.parseInt(match.group(3));
            }
            else break;

            assertTrue(maze.isPassage(new Passage(x, y, z)));
            if (lx > -1) {
                assertTrue(Math.abs(x - lx) == 1 ^ Math.abs(y - ly) == 1 ^ Math.abs(z - lz) == 1);
            }

            lx = x;
            ly = y;
            lz = z;
            i++;
        }

        assertEquals(phrasesOut[i++], "SUCCESS");
        assertEquals(phrasesOut[i], "0");
        assertEquals(phrasesOut.length, i+1);

        assertEquals(phrasesErr.length, 1);
        assertEquals(phrasesErr[0], "");
    }

    @Test
    public void maze1ToFinishTest() throws Exception {
        String pathToSake = "SakePrograms/Robot/Minotaur.sake";
        String pathToMaze = "tests/mazes/simplem1.maze";

        successTest(pathToSake, pathToMaze);
    }

    @Test
    public void maze1DeadEndTest() throws Exception {
        String pathToSake = "SakePrograms/Robot/Minotaur.sake";
        String pathToMaze = "tests/mazes/simplem1d.maze";

        OutputStream progOut = new ByteArrayOutputStream();
        OutputStream progErr = new ByteArrayOutputStream();

        Travel travel = goMaze(pathToSake, pathToMaze, progOut, progErr);
        Maze maze = travel.getMaze();

        //System.out.println(progOut.toString());
        //System.out.println(progErr.toString());

        String[] phrasesOut = progOut.toString().split("\n");
        String[] phrasesErr = progErr.toString().split("\n");

        Pattern pattern = Pattern.compile("->\\s\\{\\sX\\s([0-9]+),\\sY\\s([0-9]+),\\sZ\\s([0-9]+)\\s}");
        int x, y, z, lx, ly, lz;
        x = y = z = lx = ly = lz = -1;
        int i = 0;
        Matcher match;

        while(true) {
            match = pattern.matcher(phrasesOut[i]);
            if (match.find()) {
                x = Integer.parseInt(match.group(1));
                y = Integer.parseInt(match.group(2));
                z = Integer.parseInt(match.group(3));
            }
            else break;

            assertTrue(maze.isPassage(new Passage(x, y, z)));
            if (lx > -1) {
                assertTrue(Math.abs(x - lx) == 1 ^ Math.abs(y - ly) == 1 ^ Math.abs(z - lz) == 1);
            }

            lx = x;
            ly = y;
            lz = z;
            i++;
        }

        assertEquals(phrasesOut[i++], "-2");
        assertEquals(phrasesOut.length, i);

        assertEquals(phrasesErr.length, 1);
        assertEquals(phrasesErr[0], "");

    }

    @Test
    public void maze2ToFinishTest() throws Exception {
        String pathToSake = "SakePrograms/Robot/MinotaurHardcore.sake";
        String pathToMaze = "tests/mazes/hardcore.maze";

        successTest(pathToSake, pathToMaze);
    }

    @Test
    public void simpleTest() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void simple2Test() {
        Assert.assertEquals(1, 1);
    }

}
