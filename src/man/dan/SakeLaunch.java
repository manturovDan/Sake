package man.dan;

import man.dan.interpreter.Interpreter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SakeLaunch {
    public static void main(String[] args) {
        InputStream progIn = null;
        InputStream mazeIn = null;

        Interpreter interpreter;

        try {
            if (args.length == 0 || args.length == 2 || args.length > 3) {
                System.err.println("Run interpreter with <PROGRAM>.sake [<MAZE>.maze <DELAY SECONDS>]");
                System.exit(-1);
            }

            progIn = new FileInputStream(args[0]);
            interpreter = new Interpreter(progIn, System.out, System.err);

            if (args.length == 1) {
                interpreter.run();
            }
            else {
                mazeIn = new FileInputStream(args[1]);
                interpreter.run();
            }

        } catch (IOException e) {
            System.err.println("Critical error: " + e.getMessage());
            System.exit(-1);
        } finally {
            if (progIn != null) {
                try {
                    progIn.close();
                } catch (IOException ignored) {}
            }
        }
    }
}
