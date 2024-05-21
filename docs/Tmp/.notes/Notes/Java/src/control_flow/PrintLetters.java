package control_flow;

import helpers.OutToFile;

public class PrintLetters
{
    public static void main(String[] args)
    {
        new OutToFile("print_letters");
        
        String animal = "Big Dog";
        for (int i = 0; i < animal.length(); i++)
        {
            System.out.print("-" + animal.charAt(i) + "-");
        }
    }
}
