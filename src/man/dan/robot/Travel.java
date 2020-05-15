package man.dan.robot;

import man.dan.parser.SakeParserParser;

import java.util.concurrent.TimeUnit;
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

    public void up() {
        maze.up();
    }

    public void down() {
        maze.down();
    }

    public void leftward() {
        maze.leftward();
    }

    public void rightward() {
        maze.rightward();
    }

    public void forward() {
        maze.forward();
    }

    public void back() {
        maze.back();
    }

    public int look_up() {
        return maze.look_up();
    }

    public int look_down() {
        return maze.look_down();
    }

    public int look_left() {
        return maze.look_left();
    }

    public int look_right() {
        return maze.look_right();
    }

    public int look_forward() {
        return maze.look_forward();
    }

    public int look_back() {
        return maze.look_back();
    }

    public RoboState getStatus() {
        return maze.RoboState();
    }

    public String whereRobotPrint() {
        return "\uD83E\uDD16 : { X " + maze.rX() + ", Y " + maze.rY() + ", Z " + maze.rZ() + " }";
    }
}
