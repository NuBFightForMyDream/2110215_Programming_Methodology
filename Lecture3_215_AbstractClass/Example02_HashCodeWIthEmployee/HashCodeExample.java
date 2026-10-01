package Lecture3_215_AbstractClass.Example02_HashCodeWIthEmployee;

import java.util.HashSet ;
import java.util.Set;

public class HashCodeExample {
    // main function
    public static void main(String[] args) {
        // define HashSet (like set in Python)
        Set<Integer> hash = new HashSet<Integer>() ; // set of inetger

        // add members
        hash.add(1) ; hash.add(1);
        hash.add(2) ; hash.add(2) ; hash.add(2) ;
        System.out.println(hash) ; // [1,2]
    }
}
