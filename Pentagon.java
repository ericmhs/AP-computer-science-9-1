
public class Pentagon extends Shape{
    private double side;

    public Pentagon(String color, boolean filled, double side) {
        super(color, filled);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public double calculateArea() {
        return 1/4*(Math.sqrt(5*(5+2*Math.sqrt(5)))*Math.pow(side,2));
    }
    
    @Override
    public double calculatePerimeter() {
        return side * 5;
    }
}
