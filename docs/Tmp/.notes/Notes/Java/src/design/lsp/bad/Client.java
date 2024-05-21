package design.lsp.bad;

public class Client
{
    public static void main(String[] args)
    {
        Square square = new Square();
        clientMethod(square);
    }
    public static void clientMethod(Rectangle rectangle)
    {
        rectangle.setHeight(5);
        rectangle.setWidth(3);
        System.out.println("rectangle.area() = " + rectangle.area());
        assert (rectangle.area() == 15) : "Outcome is not 15";
    }
}
