package Lecture2_215_Inheritance.PVKLecture;

public class ClassCreation {
    public static void main(String[] args) { 
        C c1 = new C(5) ; // create object from class C
    }
}

class A { 
    A() { // constructor
        System.out.println("Class A"); 
    }
}

class B extends A {
    B(int val) { // constructor
        // super() ; -> call parent's (A) constructor
        // java automatically call super() [A]
        System.out.println("Class B , value of class B : " + val);
    }
}

class C extends B {
    C(int val) { // constructor
        super(3) ; // call B
        System.out.println("Class C , value of class C : " + val) ;
    }
}

// java just create super() but we need to create parameter by myself
