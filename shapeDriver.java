public class shapeDriver {

    public static void main (String args[]) {

        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle("red", true, 10);
        shapes[1] = new Rectangle("blue", false, 5, 8);
        shapes[2] = new Triangle("green", true, 3, 4, 5);
        shapes[3] = new Square("purple", true, 3);
        shapes[4] = new Pentagon("pink", false, 2);
        shapes[5] = new House("black", true, 2);
        
        System.out.println();
        for (int i = 0; i < shapes.length; i++){
            System.out.println(shapes[i].calculatePerimeter());
        }

        System.out.println("Areas: ");
        for(Shape s : shapes) {
            System.out.println(s.calculateArea());
        }
    }
}
