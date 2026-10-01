package Lecture3_215_AbstractClass.Example01_Shape;

public abstract class Shape {
    // abstarct class = parent class with empty (just a template)
    // child class must have written by themselves

    // fields
    String name ;

    // methods
    abstract double calculatePerimeter() ; // empty method
    abstract double calculateArea() ;

    public String getName() {
        return this.name ;
    }
    public String toString() {
        return this.getName() + "\n\tPerimeter = " + calculatePerimeter() ;
    }

}
