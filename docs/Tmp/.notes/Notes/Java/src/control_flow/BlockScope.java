package control_flow;

import helpers.OutToFile;

public class BlockScope
{
    public static void main(String[] args)
    {
        new OutToFile("block_scope");
        int a = 1;
        System.out.println("inside main(): a = " + a);
        {
            int x = 2;
            System.out.println("inside block with x declared and initialized: x = " + x);
            // int a will print here because it is in outer scope so it is not
            System.out.println("inside block with x declared and initialized: a = " + a);
            {
                int y = 3;
                System.out.println("Nested block: y = " + y);
                System.out.println("a = " + a);
                System.out.println("x = " + x);
//                int a = 5; variable a is already defined
            }
        }
//        System.out.println(x); Not possible - out of scope
        System.out.println("after block: a = " + a);
    
    }
}
