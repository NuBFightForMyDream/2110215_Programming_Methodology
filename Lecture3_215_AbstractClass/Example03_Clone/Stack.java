package Lecture3_215_AbstractClass.Example03_Clone;

import java.util.Vector; // use vector class

public class Stack implements Cloneable { // in Interface (Lecture 4)
    // Step 1 : Must implement Cloneable to use super.clone()
    private Vector items ;

    // Step 2 : Must define clone Method (which return Object)
    protected Object clone() {
        try {
            // clone stack
            Stack s = (Stack) super.clone() ; // cast from Object (from clone method) to Stack
            // clone vector
            s.items = (Vector) items.clone() ; // cast from Object (from clone method) to Vector
            // return clone
            return s ;
        }
        // Step 3 : Must catch Error
        catch (CloneNotSupportedException e) {
            throw new InternalError() ;
        }
    }
}
