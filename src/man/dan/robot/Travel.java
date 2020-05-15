package man.dan.robot;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Travel implements Runnable {
    protected Maze maze;
    protected int delay;
    protected ReentrantLock lock;

    public Travel(Maze _maze, int _delay) {
        maze = _maze;
        delay = _delay;
        lock = new ReentrantLock();
    }

    public void lock() {
        lock.lock();
    }

    public void unlock() {
        lock.unlock();
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

    public synchronized void fakeStep() {
        lock.lock();
        System.out.println("STEP START");
        try {
            TimeUnit.SECONDS.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("STEP END");
        lock.unlock();
    }
}
