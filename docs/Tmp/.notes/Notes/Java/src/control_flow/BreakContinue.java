package control_flow;

import helpers.OutToFile;

public class BreakContinue
{
    public static void main(String[] args)
    {
//        new OutToFile("break_continue");
//        for (int i = 0; i < 21; i++)
//        {
//            if (i == 15) break;
//            if (i % 2 == 0) continue;
//            System.out.print(i + " ");
//        }
//        System.out.println();
        for (int i = 0; i < 4; i++)
        {
            if (i == 1)
                continue;
            if (i == 2)
                break;
            int j = 0;
            while (j < 10)
            {
                j++;
                if (j % 2 == 0) continue;
                if (j == 5) break;
                System.out.print(j + " ");
            }
        }
    }
}
