package core.objects_java;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void swap(Person a, Person b) {
        Person temp = a;
        a = b;
        b = temp;
    }
}
