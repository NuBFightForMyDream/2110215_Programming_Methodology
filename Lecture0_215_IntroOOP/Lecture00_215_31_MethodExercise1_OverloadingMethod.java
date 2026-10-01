package Lecture0_215_IntroOOP;

// import Scanner
import java.util.Scanner ; 

public class Lecture00_215_31_MethodExercise1_OverloadingMethod {
	
	// Problem 1 : Create a java program (OverloadingSum.java) to create three overloading sum methods as follows:
		// • int sum(int a); return a summation from 0 to a
		// • int sum(int a, int b); return a summation from a to b
		// • int sum(int a, int b, int c); return a summation from a to b with c as an increment for each step
		
	// In the main method, user must enter the number of inputs (n) from keyboard. Then, enter inputs from keyboard
	// according to the number of inputs. Finally, compute and print an output using the suitable sum method.

	// MAIN METHOD
	public static void main(String[] args) {
		// input info
		Scanner rubkar = new Scanner(System.in);
		
		System.out.print("Enter numbers of parameters : ");
		int numberOfParameters = rubkar.nextInt() ;
		
		if (numberOfParameters == 1) { // calling sum(a) method
			System.out.print("Enter A : ");
			int a = rubkar.nextInt();
			System.out.println("The result of sum(a) is : " + sum(a));
		}
		
		else if (numberOfParameters == 2) { // calling sum(a,b) method
			System.out.print("Enter A : ");
			int a = rubkar.nextInt();
			
			System.out.print("Enter B : ");
			int b = rubkar.nextInt();
			
			System.out.println("The result of sum(a) is : " + sum(a,b));
		}
		
		else if (numberOfParameters == 3) { // calling sum(a,b,c) method
			System.out.print("Enter A : ");
			int a = rubkar.nextInt();
			
			System.out.print("Enter B : ");
			int b = rubkar.nextInt();
			
			System.out.print("Enter C : ");
			int c = rubkar.nextInt();
			
			System.out.println("The result of sum(a) is : " + sum(a,b,c));
		}
	} // ending main fn
	
	// create 3 method for overloading methods
	public static int sum(int a) {
		// return sum from 0 to a
		int sum_a = 0;
		for (int i = 0 ; i <= a ; i++) {
			sum_a += i ; 
		}
		return sum_a ; // return after for loop
	}
	
	public static int sum(int a , int b) {
		// return summation from a to b
		int sum_ab = 0 ;
		for (int i = a ; i <= b ; i++) {
			sum_ab += i ; 
		}
		return sum_ab ; // return after for loop
	}
	
	public static int sum(int a, int b , int c) {
		// return sum from a to b with c increment each loop
		int sum_abc = 0; 
		for (int i = a ; i <= b ; i += c) { // increment c by step 
			sum_abc += i ;
		}
		return sum_abc ; 
	}
		

} // ending class
