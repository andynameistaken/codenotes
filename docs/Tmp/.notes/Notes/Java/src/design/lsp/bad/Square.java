package design.lsp.bad;

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        System.out.println("==== Square begin setWidth() ====");
        super.setWidth(width);
        super.setHeight(width);
        System.out.println("==== Square end setWidth()   ====");
    }

    @Override
    public void setHeight(int height) {
        System.out.println("Square begin setHeight()");
        super.setHeight(height);
        super.setWidth(height);
        System.out.println("Square end setHeight()");
    }
}
