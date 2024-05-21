package control_flow;

import helpers.OutToFile;

public class LabelLoops
{
    public static void main(String[] args)
    {
        new OutToFile("labels");
        int i = 0;
        outer:
        while (true)
        {
            inner:
            for (; i < 20; i++)
            {
                System.out.println("i = " + i);
                if (i == 4)
                {
                    System.out.println("continue");
                    continue;
                }
                if (i == 5)
                {
                    System.out.println("break");
                    i++;
                    break;
                }
                if (i == 7)
                {
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                if (i == 8)
                {
                    System.out.println("break outer");
                    break outer;
                }
                for (int j = 0; j < 7; j++)
                {
                    if (j == 5)
                    {
                        System.out.println("continue inner");
                        continue inner;
                    }

                }
            }
        }
    }
}
