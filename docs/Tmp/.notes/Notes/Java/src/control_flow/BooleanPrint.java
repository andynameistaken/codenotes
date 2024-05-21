package control_flow;

import helpers.OutToFile;

public class BooleanPrint
{
    public static void main(String[] args)
    {
        new OutToFile("boolean_print");
        System.out.println(1 == 1);
        System.out.println(0 == 1);
    }
}
