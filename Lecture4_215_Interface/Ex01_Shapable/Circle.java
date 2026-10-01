package Lecture4_215_Interface.Ex01_Shapable;

public class Circle implements Shapeable {
    private double radius;
    public Circle(double r) {
        this.radius = r;
    }
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
