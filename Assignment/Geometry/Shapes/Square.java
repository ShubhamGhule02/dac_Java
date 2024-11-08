package Shapes;
public class Square extends Shape{
    
    private double Length;

    public Square(double length) {
        this.Length = length;
    }
    
    public double getSquare(){
        return Length;
    }

    public void setSquare(double length) {
        this.Length = length;    
    }

    public double getArea() {
        return Length * Length;
    }
}
