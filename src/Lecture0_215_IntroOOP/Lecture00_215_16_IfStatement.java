package Lecture00_2110215;

// import Scanner class
import java.util.Scanner;
public class Lecture00_215_16_IfStatement {

	public static void main(String[] args) { 
		
		// PART 1 : transforming number to absolute number
		
		// first , create scanner data type for receiving number
		Scanner rubkar = new Scanner(System.in);
		System.out.print("Type your first number : ");
		
		double firstNumber = 0 ; // given first number as 0
		
		// using try-catch structure : try for testing error , if error will come to catch  (catch Exception e)
		try {
			firstNumber = rubkar.nextDouble(); // receive input
		}
		catch (NumberFormatException e) {
			System.out.println("Not a number , Program Terminated."); // for myself
			System.exit(0); // exit program (by myself)
		}
		
		// change number
		if (firstNumber < 0) {
			firstNumber = firstNumber * -1 ; 
		}
		System.out.println("Absolute number : " + firstNumber);
		
		// PART 2 : conditional assignment
		System.out.print("Type your second number : ");
		double secondNumber = rubkar.nextDouble() ; 
		double result = (secondNumber < 0) ? (-1 * secondNumber) : secondNumber ; 
					// LOGIC :  if ... ? True choose ... : False choose ...
		System.out.println("Second Absolute : " + result) ; 
		
	}

}
