package Lecture4_215_Interface.Ex01_Shapable;

public interface Shapeable { // type , not class
    // attributes : must be public static final (known themselves automatically)
    String LABEL = "Shape" ;

    // no constructor from interface

    // method : public abstract automatically
    void draw() ;
    double getArea() ;
}
