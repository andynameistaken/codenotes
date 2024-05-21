package control_flow;

//import helpers.OutToFile;

public class EnhancedSwitch12
{
    public static String getMonthTemperature(int month)
    {
        return switch (month) // returning value
                {
                    case 12, 1, 2 -> "Cold"; // no break needed
                    case 3, 4, 5 -> "It can be warm";
                    case 6, 7, 8 -> "Hot";
                    case 9, 10, 11 -> "It can be cold";
                    default -> "There is no such month number as: " + month;
                };
    }


}
