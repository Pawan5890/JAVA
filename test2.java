abstract class Shape{
    String color;
    abstract double area();
    public abstract String toString();
    public Shape(String color){
        System.out.println("Shape constructor called");
        this.color = color;
    }
}
class Circle extends Shape{
    double radius;
    public Circle(String color, double radius){
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString() {
        return "Circle color is " + color + " and area is : " + area();
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(String color, double length, double width){
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    } 
    @Override
    public String toString() {
        return "Rectangle color is " + color + " and area is : " + area();
    }
}
public class test2 {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 2.5);
        System.out.println(s1.toString());
        Shape s2 = new Rectangle("Blue", 4.0, 5.0);
        System.out.println(s2.toString());
    }
}      
