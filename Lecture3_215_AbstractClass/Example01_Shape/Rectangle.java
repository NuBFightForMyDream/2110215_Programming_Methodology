package Lecture3_215_AbstractClass.Example01_Shape;

public class Rectangle extends Shape {
    // fields
    public double width ;
    public double height ;

    // constructors
    public Rectangle(double w , double h , String n) {
        this.width = w ;
        this.height = h ;
        this.name = n ;
    }

    // methods
    @Override
    public double calculatePerimeter() {
        return 2 * (this.width + height) ;
    }
    @Override
    public double calculateArea() {
        return this.width * this.height ;
    }
}
