package Main;
import Shapes.*;

public class Program {
    
    public static void main(String[] args) {
        
        Shape s= new Square(15);
        s.getArea();
        System.out.println("Area of the square: " + s.getArea());
        Shape s1= new Circle(15);
        s1.getArea();
        System.out.println("Area of the Circle: " + s1.getArea());
        Shape s2= new Rectangle(15, 20);
        s2.getArea();
        System.out.println("Area of the Rectangle: " + s2.getArea());
        
    }
}
