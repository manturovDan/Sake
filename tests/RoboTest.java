import man.dan.interpreter.Interpreter;
import man.dan.robot.Maze;
import man.dan.robot.Travel;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class RoboTest {
    protected void go(String initialString, OutputStream progOut, OutputStream progErr) throws Exception {
        InputStream progIn = new ByteArrayInputStream(initialString.getBytes());
        Interpreter interpreter;
        interpreter = new Interpreter(progIn, progOut, progErr);
        interpreter.run();
    }

    @Test
    public void simpMotion() {

    }
}
