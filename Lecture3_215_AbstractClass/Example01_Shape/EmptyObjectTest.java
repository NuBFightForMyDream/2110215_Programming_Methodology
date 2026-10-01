package Lecture3_215_AbstractClass.Example01_Shape;

public class EmptyObjectTest {
    // main function
    public static void main(String[] args) {
        // define object
        EmptyObject Object01 = new EmptyObject() ;
        System.out.println(Object01.getClass()) ;
        System.out.println(Object01) ; // will call toString() method automatically
    }

}

// define EmptyObject class
class EmptyObject {

}
