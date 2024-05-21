package core.objects_java.memory_model;

public class SharedRunnable {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr, "Thread 1");
        Thread t2 =  new Thread(mr, "Thread 2");
        // starting threads
        t1.start();
        t2.start();

        // waiting for threads to finish their execution
        t1.join();
        t2.join();

        //printing counter value
        mr.printCounter();

    }
}
