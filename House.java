
public class House extends Shape{
    private Square base;
    private Triangle roof;
    
    public House(String color, boolean filled, double side) {
        super(color, filled);
        this.base = new Square(color, filled, side);
        this.roof = new Triangle(color, filled, side, side, side);
    }
    
    public double getSide() {
        return base.getSide();
    }
    
    public void setSide(double side) {
        base.setLength(side);
        
        roof.setSide1(side);
        roof.setSide2(side);
        roof.setSide3(side);
    }
    
    @Override
    public double calculateArea() {
        return base.calculateArea() + roof.calculateArea();
    }
    
    @Override
    public double calculatePerimeter() {
        return base.calculatePerimeter() + roof.calculatePerimeter();
    }
}