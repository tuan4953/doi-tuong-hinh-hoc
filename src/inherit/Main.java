package inherit;

public class Main {
    public static void main(String[] args) {


        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(3);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());

            if (shape instanceof Resizeable) {
                ((Resizeable) shape).resize(20);
                System.out.println("After resize: " + shape.getArea());
            }

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }

            System.out.println("-------------");
        }
}}
