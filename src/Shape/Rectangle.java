package Shape;

public class Rectangle implements Shape{
    String name;
    private double width;
    private double height;
    private String shapeColor;
    private String borderColor;

    public Rectangle(String name, double width, double height, String shapeColor, String borderColor) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.shapeColor= shapeColor;
        this.borderColor = borderColor;
    }

    @Override
    public String getName() {
        return name;
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
