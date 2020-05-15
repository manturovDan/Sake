package man.dan.robot;

public class Travel implements Runnable {
    @Override
    public void run() {
        System.out.println("In parallel thread");
    }
}
