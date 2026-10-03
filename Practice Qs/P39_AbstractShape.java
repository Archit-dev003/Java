abstract class Shape
{
    private String color;

    Shape(String color)
    {
        this.color = color;
    }

    abstract void calculateArea();

    public void displayColor()
    {
        System.out.println("The color of shape is : "+color);
    }
}

class Circle extends Shape
{
    private double radius;

    Circle(String color, double radius)
    {
        super(color);
        this.radius = radius;
    }

    static double pi = 3.14;
    @Override
    void calculateArea() {
        double area;
        area = 2*pi*(radius*radius);
        System.out.println("The Area of circle is : "+area);
    }
}

public class P39_AbstractShape {

    public static void main(String[] args) {
        Shape S = new Circle("Blue", 10);
        S.calculateArea();
        S.displayColor();
    }
}