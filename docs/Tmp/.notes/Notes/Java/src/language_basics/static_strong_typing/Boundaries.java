package language_basics.static_strong_typing;

import helpers.OutToFile;
import java.util.Arrays;

public class Boundaries
{
    public static void main(String[] args)
    {
        // helper object
        OutToFile outToFile = new OutToFile("safety_out");

        // An array with 5 elements
        int[] int_array = {0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(int_array));
        // change last element
        int_array[4] = 8;
        System.out.println(Arrays.toString(int_array));
        // change 5th element which is out of bounds of this array
        int_array[5] = 16;
    }
}
