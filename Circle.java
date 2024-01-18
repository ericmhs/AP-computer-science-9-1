
public class Circle extends Shape{

    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double rad) {
        radius = rad;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * (Math.pow(radius, 2));
    } 
    
    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }
}
