package man.dan;

import man.dan.interpreter.Interpreter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SakeLaunch {
    public static void main(String[] args) {
        InputStream progIn = null;
        InputStream mazeIn;

        Interpreter interpreter;

        try {
            if (args.length == 0) {
                System.out.println("Run interpreter with <PROGRAM>.sake <MAZE>.LB (optional)");
                System.exit(-1);
            }

            if (args.length == 1) {
                progIn = new FileInputStream(args[0]);
                interpreter = new Interpreter(System.in, System.out, System.out);
                interpreter.run(progIn);
            }

        } catch (IOException e) {
            System.out.println("Critical error: " + e.getMessage());
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
