package control_flow.exercises;

public class Homework
{
    public static void printEvenWhileLoop(int start, int range)
    {
        if (start % 2 == 0)
        {
            while (start < range)
            {
                System.out.println("start = " + start);
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
                System.out.println("start = " + start);
            }
        }
    }
    
    public static void drawUglierTriangle(int size)
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawFasterTrinagle(int size)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size ; i++)
        {
//            *\n**\n***\n
            stringBuilder.append('*');



            System.out.println(stringBuilder);

        }
    }

    public static void main(String[] args)
    {
//        printEvenWhileLoop(0, 11);
//        printEvenForLoop(0, 11);
//        printEvenForLoop(1, 11);
//        printEvenForLoop(6, 4);

//        drawUglierTriangle(5);
        drawFasterTrinagle(3);
    }
}
