package core.objects_java.memory_model;

public class MyRunnable implements Runnable {

    private int counter = 0;

    public void printCounter() {
        System.out.println("counter = " + counter);
    }

    /// This will be called by the thread.start() method.
    @Override
    // synchronized
    public void run() {
        for (int i = 0; i < 100; i++) {
            this.counter++;
        }
        System.out.println(
                Thread
                        .currentThread()
                        .getName() +" : " + this.counter);
    }
}
