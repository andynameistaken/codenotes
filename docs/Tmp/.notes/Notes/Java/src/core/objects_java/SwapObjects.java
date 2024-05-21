package core.objects_java;

public class SwapObjects {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("John");
        Person p2 = new Person();
        p2.setName("Mary");

        System.out.println("p1.getName() = " + p1.getName());
        System.out.println("p2.getName() = " + p2.getName());

        Person.swap(p1, p2);

        System.out.println("p1.getName() = " + p1.getName());
        System.out.println("p2.getName() = " + p2.getName());
    }
}

