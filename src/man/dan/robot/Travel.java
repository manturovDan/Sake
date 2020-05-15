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
        while (true) {
            System.out.println("In parallel thread");
            try {
                TimeUnit.SECONDS.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
