package control_flow;

import helpers.OutToFile;

public class ForMultipleVar
{
    public static void main(String[] args)
    {
        new OutToFile("for_multiple_var");
        for (int i = 1, j = 2, k = 3; i + j + k < 20; i *= 2, j++, k = i - j)
        {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
            System.out.println("k = " + k);
            System.out.println();
            System.out.println("i + j + k = " + (i + j + k));
            System.out.println();
        }
    }
}
