package Lecture0_215_IntroOOP;

public class Lecture00_215_06_MathCalculation {
	// NOTE : Math class is static method -> no need to create data type
	public static void main(String[] args) {
		// declare a,b,c
		double a = 3.2 , b = 4.5 , c = 8.99 ; 
		// check each value
		System.out.println("Addition A+B = " + (a+b));
		System.out.println("Absolute |A|+|B| = " + (Math.abs(a) + Math.abs(b)) );
		System.out.println("Round |A|,|B| = " + Math.round(a) + " , " + Math.round(b));
		System.out.println("Ceiling |B|,|C| = " + Math.ceil(b) + " , " + Math.ceil(c));
		System.out.println("Flooring |B|,|C| = " + Math.floor(b) + " , " + Math.floor(c));
		System.out.println("Exponential A (e^A) = " + Math.exp(a) );
		
		System.out.println("Max of A and B = " + Math.max(a,b) ) ; 
		System.out.println("Min of B and C = " + Math.min(b,c) ) ;
		System.out.println("Power of 2^c = " + Math.pow(2,c)); // Math.pow(base,exponent)
		
	}

}
