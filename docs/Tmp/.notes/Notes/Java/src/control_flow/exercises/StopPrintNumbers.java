package control_flow.exercises;

import java.util.Random;

public class StopPrintNumbers
{
    public static void stopPrintNumbers(int val, int max)
    {
        if (val <= max)
        {
            Random random = new Random();
            int random_val = random.nextInt(max + 1);
            System.out.println("randomly selected int: " + random_val);
            while (random_val != val)
            {
                random_val = random.nextInt(max + 1);
                System.out.println("randomly selected int: " + random_val);
            }
            System.out.println("Oh! randomly selected int: " + random_val  + " is equal to val: " + val);
        } else
        {
            System.out.println("Are you for real ?");
        }
    }

    public static void main(String[] args)
    {
        stopPrintNumbers(11, 10);
    }
}
