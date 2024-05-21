package control_flow;

import helpers.OutToFile;

public class TestValueReturn
{
    // Basic explanation of method
    // public - we can access this method from another file
    // static - method is not bound to object so we don't have to create object of TestValueReturn (new TestValueReturn)
    // int - method testVal will return an int

    public static int testVal(int value, int compareTo)
    {
        if (value > compareTo)
            return 1;
        if (value < compareTo)
            return -1;
        return 0;
    }


    public static void main(String[] args)
    {
        new OutToFile("test_val");
        System.out.println(testVal(5, 5));
        System.out.println(testVal(65, 5));
        System.out.println(testVal(0, 1));
    }

}
