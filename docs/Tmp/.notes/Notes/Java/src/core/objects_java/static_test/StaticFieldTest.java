package core.objects_java.static_test;

public class StaticFieldTest {
        // step 1 start main()
        public static void main(String[] args) {

        // creating employee objects
        // step 2
        Employee employee_1 = new Employee();
        // step 3
        Employee employee_2 = new Employee();

        // setting names
        employee_2.setName("Sally");

        // step 4
        employee_1.setName("Lucy");
        // step 5
        employee_2.setName("Sally");

        // setting ids

        // step 6
        employee_1.setEmpId();
        // step 7
        employee_2.setEmpId();


        // printing out info about the employees
        System.out.println("employee_1.getEmpId() = "
                + employee_1.getEmpId());
        System.out.println("employee_1.getName() = "
                + employee_1.getName());
        System.out.println();
        System.out.println("employee_2.getEmpId() = "
                + employee_2.getEmpId());
        System.out.println("employee_2.getName() = "
                + employee_2.getName());
    }
}
