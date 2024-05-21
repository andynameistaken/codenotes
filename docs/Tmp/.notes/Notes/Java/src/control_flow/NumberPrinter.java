package control_flow;

import helpers.OutToFile;

import java.util.Random;

public class NumberPrinter
{
    public static boolean test()
    {
        new OutToFile("number_printer");
        Random random = new Random();
    
        int number = random.nextInt(10) + 1; // generate bounds nextInt((max - min) + 1) + min
        System.out.println("number = " + number);
        return number < 10;
    }
    
    public static void main(String[] args)
    {
        while (test())
            System.out.println("Hello");
    }
}
