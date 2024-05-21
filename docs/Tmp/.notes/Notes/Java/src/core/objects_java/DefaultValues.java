package core.objects_java;

public class DefaultValues {
    boolean b;
    char c;
    byte by;
    short s;
    int i;
    long l;
    float f;
    double d;

    public static void main(String[] args) {
        DefaultValues dv = new DefaultValues();
        System.out.println("boolean = " + dv.b);
        // default char value is '\u0000' (null character) which is not printable
        System.out.println("char = " + dv.c);
        System.out.println("byte = " + dv.by);
        System.out.println("short = " + dv.s);
        System.out.println("int = " + dv.i);
        System.out.println("long = " + dv.l);
        System.out.println("float = " + dv.f);
        System.out.println("double = " + dv.d);

        int x;
//        x++; // java: variable x might not have been initialized
    }
}
