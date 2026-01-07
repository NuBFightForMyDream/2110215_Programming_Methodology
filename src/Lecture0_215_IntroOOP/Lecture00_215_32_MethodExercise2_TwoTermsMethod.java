package Lecture00_2110215;

// import Scanner ;
import java.util.Scanner;

public class Lecture00_215_32_MethodExercise2_TwoTermsMethod {
	// define 5 methods (main & another functions)

	// 1st method : main method (call all functions)
	public static void main(String[] args) {
		System.out.print("Enter 5 inputs (a, x, b, r, n): ");
		// receive input & create Scanner
		Scanner rubkar = new Scanner(System.in);
		int a = rubkar.nextInt();
		int x = rubkar.nextInt();
		int b = rubkar.nextInt();
		int r = rubkar.nextInt();
		int n = rubkar.nextInt();
		
		// call calculateY & printInputsAndOutputs method (calculated be4)
		int y = calculateY(a,x,b,r,n) ; 
		printInputsAndOutputs(a,x,b,r,n,y);
		
	}
	// 2nd method : axPlusB method
	public static int axPlusB(int a , int x , int b) {
		return (a * x) + b ; 
	}
	
	// 3rd method : sumSquaredI
	public static int sumSquaredI(int n) { // i started from 1 to n
		int total_sumsquare = 0 ; 
		for (int i = 1 ; i <= n ; i++) {
			total_sumsquare += Math.pow(i,2);
		}
		return total_sumsquare ; // return after finish loop
	}
	
	// 4th method : calculateY
	public static int calculateY(int a , int x , int b , int r , int n) { // y = (ax + b)*(r^2) + (sigma_i^2)*r
		// declare result first
		int Y = axPlusB(a,x,b) * r * r + sumSquaredI(n) * r ; // avoid using Math.pow cuz it returns double
		// return result after finishing loop
		return Y ;
	}
	
	// 5th method : printInputsAndOutputs
	public static void printInputsAndOutputs(int a , int x , int b , int r , int n , int y) {
		// input result
		System.out.println("Inputs (a,x,b,r,n) = " + a + "," + x + "," + b + "," + r + "," + n);
		// output result -> call calculateY method
		System.out.println("Output (y) = " + y); // y were calculated in calculateY function
	}
}
