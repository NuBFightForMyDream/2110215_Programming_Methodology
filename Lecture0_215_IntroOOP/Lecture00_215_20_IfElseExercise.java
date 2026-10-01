package Lecture0_215_IntroOOP;

// import Scanner
import java.util.Scanner ; 

public class Lecture00_215_20_IfElseExercise {

	public static void main(String[] args) { // def ...

		// create Scanner (inside main fn)
		Scanner rubkar = new Scanner(System.in);
		
		// PART 1 : Math Function 
		// given f(x) as below
			// f(x) = - (x^2) 	: -10 <= x <= -5
			// f(x) =     0   	:  -5 <  x <=  0
			// f(x) = + (x^2) 	:   0 <  x <=  5
			// f(x) =     0 	:   5 <  x <= 10
		    // f(x) = + (x^3)	:   x < -10 or x 10 < x
		
		System.out.print("Enter X : ");
		// using try-catch structure (define value first)
		double x = 0 ; 
		try {
			x = rubkar.nextDouble() ; // assign value from input
		}
		catch (NumberFormatException e) {
			System.out.println("Oops , Wrong Number Format . Maybe you should enter x again !!");
		}
		
		double fx ;
		
		if ((-10 <= x) && (x <= -5)) { 
			fx = - (x * x); // - Math.pow(x , 2)
			System.out.println("Value of f(x) is : " + fx);
		}
		
		else if ((-5 < x) && (x <= 0)) {
			fx = 0;
			System.out.println("Value of f(x) is : " + fx);
		}
		
		else if ((0 < x) && (x <= 5)) {
			fx = + (x * x); // + Math.pow(x,2)
			System.out.println("Value of f(x) is : " + fx);
		}
		
		else if ((5 < x) && (x <= 10)) {
			fx = 0;
			System.out.println("Value of f(x) is : " + fx);
		}
		
		else if ((x < -10) || (10 < x)) {
			fx = + (x * x * x); // + Math.pow(x,3)
			System.out.println("Value of f(x) is : " + fx);
		}
		
		// PART 2 : Phone Bill
		// given phone fees as below depending on usage time
		// total fees will be charged like tax ladder
		
		// first 200 minutes : 200 baht
		// 201 - 500 minutes : 0.50 baht per minute
		// 501 - 1000 minutes : 1.00 baht per minute
		// 1000+ minutes : 2.00 baht per minute
		
		System.out.print("Enter minutes on your phone call : ");
		
		// try-catch structure (define first)
		int minute = 0 ;
		double phoneBill = 0; 
		
		try { // assign new value from input
			minute = rubkar.nextInt() ;
		}
		catch (NumberFormatException e){
			System.out.println("Oops , Wrong Number Format . Maybe you should enter minute again !!");
		}
		
		if (minute <= 200) {
			phoneBill = 200 ;
		}
		
		else if ((201 <= minute) && (minute <= 500)) {
			phoneBill = 200 + (minute - 200) * 0.5 ;
		}
		
		else if ((501 <= minute) && (minute <= 1000)) {
			phoneBill = 200 + (300 * 0.5) + (minute - 500) * 1.0 ;
		}
		
		else if (minute > 1000) {
			phoneBill = 200 + (300 * 0.5) + (500 * 1.0) + (minute - 1000) * 2.0 ;
		}
		
		// print phoneBill
		System.out.println("Total Phone Bill is : " + phoneBill);
		
		// VKJ's Solution
			// 1 : create interval 1000> , 500-1000 , 200-500 , <200
			// 2 : use if statement 3 times (check  1001 -> 501 -> 201) -> set time back to 1000/500/200
			// 3 : calculate sum of interval*rate
	}

}
