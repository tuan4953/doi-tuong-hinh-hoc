package inherit;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Area before resize: " + rectangle.getArea());

        Random random = new Random();
        double percent = 1 + random.nextInt(100);

        rectangle.resize(percent);

        System.out.println("Resize percent: " + percent + "%");
        System.out.println("Area after resize: " + rectangle.getArea());
}}
