package man.dan.robot;

import java.util.concurrent.TimeUnit;

public class Travel implements Runnable {
    protected Maze maze;
    protected int delay;

    public Travel(Maze _maze, int _delay) {
        maze = _maze;
        delay = _delay;
    }

    @Override
    public void run() {

    }

    public Maze getMaze() {
        return maze;
    }

    public int getDelay() {
        return delay;
    }

    public void fakeStep() {
        System.out.println("STEP START");
        try {
            TimeUnit.SECONDS.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("STEP END");
    }
}
