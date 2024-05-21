package language_basics.static_strong_typing;

import helpers.OutToFile;

public class RuntimeSafety
{
    public static void main(String[] args)
    {
        OutToFile outToFile = new OutToFile("runtime_out");
        String s = "Kitten";
        System.out.println("Error will be thrown in runtime, so this line will print before it will happen");
        System.out.println("s.charAt(s.length()+100) = " + s.charAt(s.length()+100));
    }
}