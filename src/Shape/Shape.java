package Shape;

public interface Shape {
    String getName();
    double getArea();
    double getPerimeter();
    String getShapeColor();
    String getBorderColor();

    default void printShapeInfo(){
        System.out.println("Name: " + getName() + ", "+ "Perimeter: " + getPerimeter()+ ", " + "Area: " +
                getArea() + ", "+ "ShapeColor: " + getShapeColor() + ", "+ "BorderColor: " + getBorderColor());
    }
}
