package control_flow.exercises;

public class BitCount
{
    public static int countSetBits(int num)
    {
        int count = 0;
        while (num != 0)
        {
            num &= (num - 1);
            count++;
        }
        return count;
    }


    public static void main(String[] args)
    {
        System.out.println(countSetBits(7));
    }
}
