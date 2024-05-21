package core.objects_java.memory_model;

public class Racing {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr, "Thread 1");
        Thread t2 =  new Thread(mr, "Thread 2");
        // starting threads
        t1.start();
        t2.start();

        //printing counter value
        mr.printCounter();
    }
}
