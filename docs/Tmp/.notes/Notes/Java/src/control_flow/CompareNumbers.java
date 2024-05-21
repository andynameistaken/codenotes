package control_flow;

import helpers.OutToFile;

public class CompareNumbers
{
    public static void compareNums(int a, int b)
    {
        if (a > b)
            System.out.println(a + " is greater than " + b);
        else if (a < b)
            System.out.println(a + " is less than " + b);
        else
            System.out.println(a + " is  equal to " + b);
    }
    
    public static void main(String[] args)
    {
        new OutToFile("compare_numbers");
        int a = 1;
        int b = 0;
        compareNums(a, b);
        compareNums(b, a);
        a = 0;
        b = 0;
        compareNums(a, b);
    }
}
