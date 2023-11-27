package Shape;

public class Rectangle implements Shape{
    private double width;
    private double height;
    private String shapeColor;
    private String borderColor;

    public Rectangle(double width, double height, String shapeColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.shapeColor= shapeColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
