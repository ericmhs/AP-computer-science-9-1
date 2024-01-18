
public class Square extends Rectangle {
    private double side;
    
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }
    
    @Override
    public void setLength(double l) {
        super.setLength(l);
        super.setWidth(l);
        this.side = l;
    }
    
    @Override
    public void setWidth(double w) {
        super.setWidth(w);
        super.setLength(w);
        this.side = w;
    }
    
    @Override
    public double calculateArea() {
        return side * side;
    }
    
    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}
