package design.lsp.bad;

public class Rectangle
{
    int width;
    int height;

    public void setWidth(int width) {
        System.out.println("Rectangle.setWidth()");this.width = width;}

    public void setHeight(int height) {
        System.out.println("Rectangle.setHeight()");this.height = height;
    }

    public int area() {return  height * width;}
}
