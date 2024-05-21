package control_flow;

public class SwitchBreak
{

    public static void main(String[] args)
    {
        int number = 1;
        switch (number)
        {
            case 1:
                number += 1; // statement
                break;
        }

         number = switch (number)
                 {
                     case 1:
                         yield number + 1; // expression
                     default: yield 0; // default value is required when switch returns value
                 };
    }
}
