package inherit;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== TEST SHAPE =====");
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("red", false);
        System.out.println(shape2);


        System.out.println("\n===== TEST CIRCLE =====");
        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());

        Circle circle2 = new Circle(3.5);
        System.out.println(circle2);

        Circle circle3 = new Circle(3.5, "indigo", false);
        System.out.println(circle3);


        System.out.println("\n===== TEST RECTANGLE =====");
        Rectangle rect1 = new Rectangle();
        System.out.println(rect1);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(2.3, 5.8);
        System.out.println(rect2);

        Rectangle rect3 = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rect3);


        System.out.println("\n===== TEST SQUARE =====");
        Square square1 = new Square();
        System.out.println(square1);
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());

        Square square2 = new Square(2.3);
        System.out.println(square2);

        Square square3 = new Square(5.8, "yellow", true);
        System.out.println(square3);


        System.out.println("\n===== TEST POLYMORPHISM =====");
        Shape[] shapes = new Shape[4];
        shapes[0] = new Shape("black", true);
        shapes[1] = new Circle(2.5, "blue", false);
        shapes[2] = new Rectangle(3, 4, "green", true);
        shapes[3] = new Square(6, "purple", true);

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}
