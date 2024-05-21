package core.objects_java.static_test;

/**
 * StaticMethods
 */

public class StaticMethods {
    static int counter = 0;
    public static void main(String[] args) {
        Incrementable inc = new Incrementable();
        inc.increment();
        System.out.println("counter = " + counter);
        Incrementable.increment();
        System.out.println("counter = " + counter);
    }
}

class Incrementable {
    public static void increment() {
        StaticMethods.counter++;
    }
}