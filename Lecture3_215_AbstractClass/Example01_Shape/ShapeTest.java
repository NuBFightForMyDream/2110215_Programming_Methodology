package Lecture3_215_AbstractClass.Example01_Shape;

public class ShapeTest {
    // main method
    public static void main(String[] args) {
        // abstract class , can't initiate object by themselves
        // Shape sh = new Shape() ; // will error

        // define parent class via children class
        Shape shape1 = new Circle(2.5d , "Circle A") ; // shape1 is Shape (not circle)
        System.out.println(shape1) ;

        // change Circle to Rectangle
        Shape shape2 = new Rectangle(4.5d , 6.2d , "Square A") ;
        System.out.println(shape2) ;

        // result is on runtime (after compile time) , not on compile time
    }
}
