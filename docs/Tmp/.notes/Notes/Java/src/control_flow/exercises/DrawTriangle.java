package control_flow.exercises;

import java.time.Duration;
import java.time.Instant;

public class DrawTriangle
{
    public static void drawBuildPrintTriangle(int size)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < size; i++)
        {
            stringBuilder.append('*');
            System.out.println(stringBuilder);
        }
    }
    public static void drawUglierTriangle(int size)
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

    public static void drawFastTriangle(int size)
    {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(); // bad variable names
        for (int i = 0; i < size; i++)
        {
            sb2.append("*");
            sb.append(sb2).append(System.lineSeparator());
        }
        System.out.print(sb);
    }

//    public static void drawInvertedTriangle(int size)
//    {
//        for (int i = size; i != 0; i--)
//        {
//            for (int j = 0; j < i; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    public static void drawInvertedTriangle(int size)
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = size - i; j > 0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
//        Instant start = Instant.now();
//        drawFastTriangle(5);
//        Instant end = Instant.now();
//        System.out.println(Duration.between(start, end));
//
//        Instant start2= Instant.now();
//        drawBuildPrintTriangle(5);
//        Instant end2  = Instant.now();
//        System.out.println(Duration.between(start2, end2));
        drawInvertedTriangle(-1);

    }
}
