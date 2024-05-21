package core.objects_java;

public class Scope {
    public static void main(String[] args) {
        {
            int x = 10;
            System.out.println("x = " + x);
            {
                int y = 20;
                System.out.println("y = " + y);
                int z = 30;
                System.out.println("z = " + z);
            }
            // we can declare y again, because scope of last y is in inner block
            int y = 30;
            System.out.println("y = " + y);
            x = 40;
            System.out.println("x = " + x);
//            System.out.println("z = " + z);
            // java: cannot find symbol
            //  symbol:   variable z
            //  location: class core.objects_java.Scope
        }
    }
}
