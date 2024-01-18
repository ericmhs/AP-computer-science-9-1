
public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double sideOne) {
        side1 = sideOne;
    }

    public void setSide2(double sideTwo) {
        side2 = sideTwo;
    }

    public void setSide3(double sideThree) {
        side3 = sideThree;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
