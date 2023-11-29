package Shape;

public interface Shape {
    double getArea();
    double getPerimeter();
    String getShapeColor();
    String getBorderColor();

    default void printShapeInfo(){
        System.out.println("Perimeter: " + getPerimeter()+ ", " + "Area: " + getArea() + ", "+
                "ShapeColor: " + getShapeColor() + ", "+ "BorderColor: " + getBorderColor());
    }
}
