package Shape;

import javax.swing.*;

public class InfoShape {
    public static void main(String[] args) {
    Shape triangle = new Triangle("Triangle", 5, 5, 8, "Red", "White");
    Shape circle = new Circle("Circle", 8.5, "Blue", "Black");
    Shape rectangle = new Rectangle("Rectangle",4, 8, "Purple", "Yellow");

    circle.printShapeInfo();
    triangle.printShapeInfo();
    rectangle.printShapeInfo();

}
    }
