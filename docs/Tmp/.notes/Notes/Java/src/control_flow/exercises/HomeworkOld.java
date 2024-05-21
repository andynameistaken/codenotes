package control_flow.exercises;

import java.util.Random;

public class HomeworkOld
{
    public static void printEvenWhileLoop(int start, int range)
    {

        if (start % 2 == 0)
        {
            while (start < range)
            {
                System.out.println(start);
                start += 2;
            }
        }
    }

    public static void printEvenForLoop(int start, int range)
    {
        if (start % 2 == 0)
        {
            for (; start < range; start += 2)
            {
                System.out.println(start);
            }
        }
    }
    public static void drawTriangle(int size)
    {
        for (int i = 0; i < size; i++)
        {

            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawInvertedTriangle(int size)
    {
        for (int i = 0; i < size ; i++)
        {
            for (int j = size - i ; j > 0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void stopPrintNumbers(int val, int max)
    {
        if (val < max)
        {
            Random random = new Random();
            int random_val = random.nextInt(max + 1);
            // int boundedRandomValue = ThreadLocalRandom.current().nextInt(0, 100);
            System.out.println("randomly selected int: " + random_val);
            while (random_val != val)
            {
                random_val = random.nextInt(max + 1);
                System.out.println("randomly selected int: " + random_val);
            }
            System.out.println("Oh! randomly selected int: " + random_val + " is equal to val: " + val);
            System.out.println("End of the loop");
        }
        else
        {
            System.out.printf("Are you for real?",
                    val, max);
        }
    }
    public static void main(String[] args)
    {
        drawTriangle(5);
//        drawInvertedTriangle(5);
        stopPrintNumbers(5, 11);
        printEvenForLoop(0, 5);
        printEvenWhileLoop(0,5);
    }
}
