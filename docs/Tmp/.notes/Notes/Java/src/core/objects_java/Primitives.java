package core.objects_java;

public class Primitives {
    public static void main(String[] args) {
        // java: integer number too large
//        long l = 1234567891011;
        // fine
        long l = 1234567891011L;

        // java: incompatible types: possible lossy conversion from double to float
//        float f = 1.23456789;
        // fine
        float f = 1.23456789F;


        // floating-point nunbers are not precise
        System.out.println(2.0 - 1.1);

    }
}
