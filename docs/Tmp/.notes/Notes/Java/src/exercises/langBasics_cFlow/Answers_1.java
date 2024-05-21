package exercises.langBasics_cFlow;

public class Answers_1
{
    public static void printEven(int num, int range)
    {
        for (int i = 0; i < range + 1 ; i += 2)
        {
            System.out.println(i);
        }
    }

    public static int printFactorial(int num)
    {
        int result = 1;
        if (num == 0)
            return result;
        for (int i = 1; i < num + 1; i++)
        {
            result *= i;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args)
    {
//        printEven(0, 10);
//        printFactorial(4);

    }
}
