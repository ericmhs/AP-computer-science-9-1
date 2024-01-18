
/**
 * Write a description of class Shape here.
 *
 * @author Eric Shen
 * @version Jan 11, 2024
 */
public class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setColor(String col) {
        color = col;
    }

    public void setFilled(boolean fil) {
        filled = fil;
    }

    public double calculateArea() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Is filled? " + filled);
    }
}
