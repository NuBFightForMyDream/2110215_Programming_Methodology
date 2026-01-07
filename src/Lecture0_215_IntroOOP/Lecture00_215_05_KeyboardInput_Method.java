package Lecture00_2110215;

// we need to import Scanner library first
import java.util.Scanner;

public class Lecture00_215_05_KeyboardInput_Method {

	public static void main(String[] args) {
		// we create new data types (Scanner) 
			// with this cmd : Scanner var_name = new Scanner(system.in)
		Scanner rubkar = new Scanner(System.in); // reference , pointer
		
		// next , we will add some constant for calculating temp
		System.out.println("Welcome to Degree Calculator , Please Fill Type of calculation");
		System.out.println("Type 1 for Calculating Celsius -> Fahrenheit");
		System.out.println("Type 2 for Calculating Fahrenheit -> Celsius");
		
		// create constant for calculating
		final double C2F_MULTIPLIER = 1.800 ;
		final double F2C_MULTIPLIER = 0.555 ;
		final double TEMP_CONSTANT = 32 ; 
		
		// now we check type for calculation 9input first)
		int type_calculation = rubkar.nextInt();
		
		if (type_calculation == 1) { // Celsius -> Fahrenheit
			// define fahrenheit & input
			System.out.println("Enter Celsius : ");
			double celsius = rubkar.nextDouble();
			double fahrenheit = (celsius * C2F_MULTIPLIER) + TEMP_CONSTANT ;
			System.out.println("Celsius : " + celsius + " -> " + "Fahrenheit : " + fahrenheit);	
		}
		
		else if (type_calculation == 2) { // Fahrenheit -> Celsius
			// define celsius & input
			System.out.println("Enter Fahrenheit : ");
			double fahrenheit = rubkar.nextDouble();
			double celsius = F2C_MULTIPLIER * (fahrenheit - TEMP_CONSTANT) ;
			System.out.println("Fahrenheit : " + fahrenheit + " -> " + "Celsius : " + celsius);	
		}
	}
}
