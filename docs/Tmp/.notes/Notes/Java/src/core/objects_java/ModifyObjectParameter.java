package core.objects_java;

public class ModifyObjectParameter {
    public static void main(String[] args) {
        // Create a new object
        Person person_1 = new Person();
        person_1.setName("John");
        Person person_2 = new Person();
        person_2.setName("Mary");

        System.out.println("Before swap: ");
        System.out.println("person_1.getName() = " + person_1.getName());
        System.out.println("person_2.getName() = " + person_2.getName());

        swapNames(person_1, person_2);

        System.out.println("After swap: ");
        System.out.println("person_1.getName() = " + person_1.getName());
        System.out.println("person_2.getName() = " + person_2.getName());

    }

    public static void swapNames(Person p_1, Person p_2) {
        // step 1
        String tmp_name = p_1.getName();
        // step 2
        p_1.setName(p_2.getName());
        // step 3
        p_2.setName(tmp_name);
    }
}