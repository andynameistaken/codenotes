package control_flow;

import helpers.OutToFile;

public class Seasons
{
    public static void main(String[] args)
    {
        new OutToFile("regular_switch");
        for (int month = 0; month < 13 ; month++)
        {
            switch (month)
            {
                case 12:
                case 1:
                case 2:
                    System.out.println("Cold"); break;
                case 3:
                case 4:
                case 5:
                    System.out.println("It can be warm"); break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Hot"); break;
                case 9:
                case 10:
                case 11:
                    System.out.println("It can be cold"); break;
                default:
                    System.out.println("There is no such month number as: " + month);
            }
        }


    }
}
