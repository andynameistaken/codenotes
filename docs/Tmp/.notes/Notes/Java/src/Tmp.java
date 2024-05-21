public class Tmp
{
    public static void main(String[] args)
    {
        boolean answer =o(input("Y/n").strip().lower());

        label1:
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Outer Loop, i: " + i);
            for (int j = 0; j < 10; j++)
            {
                System.out.println("Inner Loop, j: " + j);
                if (j == 5)
                {
                    System.out.println("j == 5, continue label1");
                    continue label1;
                }
            }
        }
    }
}
