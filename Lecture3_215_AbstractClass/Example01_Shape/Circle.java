package Lecture3_215_AbstractClass.Example01_Shape;

public class Circle extends Shape {
    // fields
    public double radius ;

    // constructors
    public Circle(double radius , String name) {
        this.radius = radius ;
        this.name = name ;
    }

    // method
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius ;
    }
    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius ;
    }
    public double calculateDiameter() {
        return 2 * this.radius ;
    }

}
