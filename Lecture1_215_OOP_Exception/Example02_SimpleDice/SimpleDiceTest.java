package Lecture1_215_OOP_Exception.Example02_SimpleDice;
import java.util.Scanner ; // or .*

public class SimpleDiceTest {
    public static void main(String[] args) {
        // create new objects from class
        SimpleDice DiceA = new SimpleDice(5);
        SimpleDice DiceB = new SimpleDice(3);
        SimpleDice DiceC = new SimpleDice(); // call default value (set as 1)
        // calling method to test
        System.out.println("Dice A Face Value : " + DiceA.getFaceValue());
        System.out.println("Dice B Face Value : " + DiceB.getFaceValue());
        System.out.println("Dice C Face Value : " + DiceC.getFaceValue());

        // after rolling the dices
        DiceA.rollDice() ; DiceB.rollDice() ; DiceC.rollDice() ;

        // calling method to test
        System.out.println("----- After Rolling All Dices -----") ;
        System.out.println("Dice A Face Value : " + DiceA.getFaceValue());
        System.out.println("Dice B Face Value : " + DiceB.getFaceValue());
        System.out.println("Dice C Face Value : " + DiceC.getFaceValue());

        // test static variables
        System.out.println("Count Dice : " + SimpleDice.countDice) ; // can't call countDice individually , call via class or object
        System.out.println("Count Dice : " + DiceB.countDice) ;
        DiceB.countDice = 1 ;
        System.out.println("Count Dice B & Count All Dice : " + DiceB.countDice + " " + SimpleDice.countDice); // changed for all objects

        // Input value
        // Scanner rubkar = new Scanner(System.in) ; // can be used by importing Scanner
            // java.lang is default => no need to import

        // print value from method
        DiceC.setFaceValue(1000);
        System.out.println("Dice After Set New Value : " + DiceC.getFaceValue());
        System.out.println( DiceB ) ;

        // check if two dice is same
            // but if using == will include checking same address , so defining equals method instead
        DiceA.setFaceValue(3);
        System.out.println( DiceA.equals(DiceB) ) ; // true
        System.out.println( DiceA == DiceB ) ; // false from different address
    }
}
