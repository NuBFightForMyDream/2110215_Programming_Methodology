package Lecture4_215_Interface.Ex01_Shapable;

public class Rectangle implements Shapeable {
    // attributes
    private double width;
    private double height;

    // constructors
    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    // method
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
    public double getArea() {
        return this.height * this.width;
    }
}
