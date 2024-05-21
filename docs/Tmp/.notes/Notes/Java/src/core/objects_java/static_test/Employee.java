package core.objects_java.static_test;

public class Employee {
    private static int globalId = 0;
    private int empId;
    private String name;

    public void setEmpId() {
        empId = ++globalId;
    }
    public int getEmpId() {
        return empId;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
