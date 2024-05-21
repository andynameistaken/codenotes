package core.objects_java;

public class ParamRefNewObj {
    public static void main(String[] args) {
        Color c1 = new Color();
        System.out.println("c1:");
        c1.setColor(1,2,3);
        c1.printColor();

        Color c2 = new Color();
        c2.setColor(9, 9, 9);
        System.out.println("c2:");
        c2.printColor();


    }

}

class Color {
    int red;
    int green;
    int blue;

    public void setColor(int r, int g, int b) {
        if ( (r > 0 && g > 0 && b > 0)
                && (r < 256 && g < 256 && b < 256) ) {
            red = r;
            green = g;
            blue = b;
        } else {
            System.out.println("Invalid color values");
        }
    }
    public void printColor() {
        System.out.println("Color: "
                + red + ", "
                + green + ", "
                + blue);
    }
}
