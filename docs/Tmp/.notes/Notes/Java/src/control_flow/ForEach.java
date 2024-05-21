package control_flow;

import helpers.OutToFile;

public class ForEach
{

    public static void main(String[] args)
    {
        new OutToFile("foreach");

        int[] arrayOfIntegers = {3, 12, 4, 23, 8};

        // the old way
        for (int i = 0; i < arrayOfIntegers.length ; i++)
        {
            System.out.print(arrayOfIntegers[i] + " ");
        }

        System.out.println();

        // the foreach way:
        for (int value : arrayOfIntegers)
        {
            System.out.print(value + " ");
        }
    }
}
