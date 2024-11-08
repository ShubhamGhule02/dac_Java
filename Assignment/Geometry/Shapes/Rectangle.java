package Shapes;
public class Rectangle extends Shape{
    
    private double Length;
    private double Breath;

    public Rectangle(double length, double breath){
        this.Length = length;
        this.Breath = breath;
    }

    public double getLength(){
        return Length;
        
    }
    public void setLength(double Length){
        this.Length = Length;
    }

    public double getBreath(){
        return Breath;
        
    }
    public void setBreath(double Breath){
        this.Breath = Breath;
    }

    public double getArea(){
        return Length * Breath;
    }
}
