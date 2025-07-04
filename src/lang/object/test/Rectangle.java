package lang.object.test;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width,int height){
        this.width = width;
        this.height = height;

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        Rectangle rectangle = (Rectangle) obj;
        boolean result = (width == rectangle.width && height == rectangle.height);
        return result;
    }
}
