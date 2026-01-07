package Lecture0_215_IntroOOP;

public class Lecture00_215_13_IntegerGoRoundExample {

	public static void main(String[] args) {
		// define largest number of integer (see if number goes round)
		int biggestInteger = 2147483647 ;
		// What happen if we add 1 to largest int
		System.out.println("Biggest Integer Value : " + biggestInteger);
		System.out.println("Biggest Integer +1 : " + (biggestInteger + 1) ); // +1 -> over max -> go round to -21xxxx8 (smallest integer)
		System.out.println("Biggest Integer x2 : " + (biggestInteger * 2) ); // go round to -1 ==> -1 * 2 = -2
		
		int smallestInteger = -2147483648 ; 
		System.out.println("Smallest Integer Value : " + smallestInteger);
		System.out.println("Smallest Integer -1 : " + (smallestInteger - 1) ); // -1 -> over min -> go round to 21xxxx7 (biggest integer)
		
		
		// Another example of Overflowing Integers (in exponential form)
		double biggestPower = 1.0e308 ; 
		double biggestPowerSquare = biggestPower * biggestPower ; // cant use ** 2 like in python
		
		System.out.println("biggestPower = " + biggestPower) ;
		System.out.println("biggestPowerSquare = " + (biggestPowerSquare) ) ; // Infinity
		System.out.println("negative of biggestPowerSquare = " + (-biggestPowerSquare) ) ; // -Infinity
		System.out.println("square root of biggestPowerSquare = " + Math.sqrt(biggestPowerSquare) ) ; // Math.sqrt(Infinity) = Infinity
		
		// Another example of Underflowing Integers (in exponential form)
		double smallestPower = -1.0e-323 ; 
		double smallestPowerRoundType1 = smallestPower / 10 * 10 ; // divide 10 is too small -> changed to 0.0
		double smallestPowerRoundType2 = 10 * smallestPower / 10 ; 
		
		System.out.println("smallestPower = " + smallestPower) ; // -9.9e-324
		System.out.println("smallestPowerRoundType1 = " + (smallestPowerRoundType1) ) ; // -0.0
		System.out.println("smallestPowerRoundType2 = " + (smallestPowerRoundType2) ) ; // -9.9e-324

	}

}
