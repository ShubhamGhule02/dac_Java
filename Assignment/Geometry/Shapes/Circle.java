package Shapes;

public class Circle extends Shape{
    private double Radius;

    public Circle(double radius) {
        this.Radius = radius;
    }

    public double getRadius(){
        return Radius;

    }
    public void setRadius(double radius) {
        this.Radius = radius;
    }

    public double getArea() {
        return Math.PI * Radius * Radius;
    }
}
