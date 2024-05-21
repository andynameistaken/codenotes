package core.objects_java.aliasing;

/**
 * Alias
 */
public class Alias {

    private int val;

    public void setVal(int v) {
        val = v;
    }

    public int getVal() {
        return val;
    }

    public static void main(String[] args) {
        Alias a = new Alias();
        a.setVal(10);
        Alias b = a;
        System.out.println("a.getVal(): "+ a.getVal());
        System.out.println("b.getVal(): " + b.getVal());
        b.setVal(20);
        System.out.println("a.getVal(): "+ a.getVal());
        System.out.println("b.getVal(): " + b.getVal());
    }
}

