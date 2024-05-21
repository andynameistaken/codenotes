import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Test
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("c2. = " + Circle.testObject);

        int x = 1;
        int y = x;
        x++;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
    

}
  

class Circle {
    static Object testObject = new Object();
    public static void testprint() {
        System.out.println("testObject = " + testObject);
    }
}
