package Shape;

public class Triangle implements Shape{
    String name;
    private double sideA;
    private double sideB;
    private double sideC;
    private String shapeColor;
    private String borderColor;

    public Triangle(String name, double sideA, double sideB, double sideC, String shapeColor, String borderColor){
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.shapeColor = shapeColor;
        this.borderColor = borderColor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        double a = getPerimeter() / 2;
        return Math.sqrt(a * (a - sideA) * (a - sideB) * (a - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
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
