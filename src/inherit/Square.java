package inherit;

public class Square extends Shape implements Resizeable, Colorable {

    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        side = side + side * percent / 100;
    }

    // 🔴 BẮT BUỘC – override từ Colorable
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "Square side=" + side + ", " + super.toString();
    }
}
