package Lecture0_215_IntroOOP;

// import io & Scanner library
import java.io.*;
import java.util.Scanner;

public class Lecture00_215_21_SwitchCondition_TriangleDemo {
	
	public static void main(String[] args)  
	{
		// declare var.
		int number ; 
		String stringToPrint ;
		Scanner rubkar = new Scanner(System.in); // create Scanner
		
		System.out.println("Enter integer from 1 to 4 : ");
		
		// change type from string (input) to int with using Integer.parseInt() , .next() means string input
		number = Integer.parseInt( rubkar.next() ); 
		
		// using Switch statement
		switch(number) {// checking value of "number" (using "break" in each case will be similar to If-Elif-Else)
			case 1 : // if (number == 1)
				stringToPrint = "*";
				break ;
			case 2 : // if (number == 2)
				stringToPrint = "* *";
				break ;
			case 3 : // if (number == 3)
				stringToPrint = "* * *";
				break ;
			case 4 : // if (number == 4)
				stringToPrint = "* * * *";
				break;
			default : // else 
				stringToPrint = "Integer out of range." ;
		}
		
		// print out result
		System.out.println(stringToPrint);
	}
}
