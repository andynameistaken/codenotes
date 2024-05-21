package core.objects_java;

public class PassByValPrimitive {
    public static void main(String[] args) {

        double price = 100;
        applyTenPctDisc(price);
        System.out.println("price = " + price);
    }

    public static void applyTenPctDisc(double x) {
        x = x * 0.9;
    }
}
