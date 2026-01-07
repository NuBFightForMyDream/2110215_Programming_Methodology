package Lecture0_215_IntroOOP;
import java.util.Scanner;

public class Lecture00_215_17_IfElseStatementExample {

	public static void main(String[] args) {
		// Program for comparing number (If-Else Statement)
		
		// 1 : declare 2 numbers by input (create Scanner object first)
		Scanner rubkar = new Scanner(System.in);
		double firstNumber = 0 , secondNumber = 0 ;
		
		// 2 : we're using try-catch structure for each number (print -> try -> catch)
		System.out.print("Type First Number : ");
		try {
			// try receiving input (no need to declare again cuz we declare before , just assign new value to this var.)
			firstNumber = rubkar.nextDouble();
		}
		catch (NumberFormatException e){
			// catch error with my error status & quit program
			System.out.println("Not a number , Program Terminated X_X");
			System.exit(0); // normal termination
		}
		
		System.out.print("Type Second Number : ");
		try {
			// try receiving input (no need to declare again cuz we declare before , just assign new value to this var.)
			secondNumber = rubkar.nextDouble();
		}
		catch (NumberFormatException e){
			// catch error with my error status & quit program
			System.out.println("Not a number , Program Terminated X_X");
			System.exit(0); // normal termination
		}
		
		// 3 : check if which number are larger
		if (firstNumber > secondNumber) {
			System.out.println("First Number (" + firstNumber + ") is greater than Second Number (" + secondNumber + ")" );
		}
		else if (firstNumber < secondNumber) {
			System.out.println("First Number (" + firstNumber + ") is less than Second Number (" + secondNumber + ")" );
		}
		else {
			System.out.println("First Number (" + firstNumber + ") is equal to Second Number (" + secondNumber + ")" ); // beware of near enough too
		}
		
	}

}
