
public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double len) {
        length = len;
    }

    public void setWidth(double wid) {
        width = wid;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return (length + width) * 2;
    }
}
