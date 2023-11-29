package Shape;

public class Circle implements Shape{
    String name;
    private double radius;
    private String shapeColor;
    private String borderColor;
    double p = 3.14;

    public Circle(String name, double radius, String shapeColor, String borderColor){
        this.name = name;
        this.radius = radius;
        this.shapeColor = shapeColor;
        this.borderColor = borderColor;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    //Формула: S = π · r2 , где S это площадь круга, r – радиус, π – пи.
    public double getArea() {
        return p * radius * radius;
    }

    @Override
    //Формула расчета периметра круга: C = 2 · π · r , где C это периметр, r – радиус, π – число пи.
    public double getPerimeter() {
        return 2 * p * radius;
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
