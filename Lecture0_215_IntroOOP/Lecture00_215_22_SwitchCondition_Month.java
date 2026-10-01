package Lecture0_215_IntroOOP;

import java.util.Scanner ; 
import java.io.*;
import java.lang.Math;

public class Lecture00_215_22_SwitchCondition_Month {
	// we'll write 2 method : convertMonth & main methods
	
	// 1st function : convertMonth -> convert monthNumber (int) to monthName (String)
	public static void convertMonth(int monthNumber) { // parameter = monthNumber (int)
		// calling convertMonth(monthNumber) will return monthName (String) as result
		
		// 1 : define initial var. : monthName (str) using switch(monthNumber)
		String monthName = "" ;
		// 2 : using switch structure (similar as If-Else structure)
		switch(monthNumber) { // check value of monthNumber
			case 1 : // if (monthNumber == 1)
				monthName = "January" ; // replace new value to monthName]
				break ; 
			case 2 : // if (monthNumber == 2)
				monthName = "February" ; 
				break ; 
			case 3 : // if (monthNumber == 3)
				monthName = "March" ; 
				break ; 
			case 4 : // if (monthNumber == 4)
				monthName = "April" ; 
				break ; 
			case 5 : // if (monthNumber == 5)
				monthName = "May" ; 
				break ; 
			case 6 : // if (monthNumber == 6)
				monthName = "June" ; 
				break ; 
			case 7 : // if (monthNumber == 7)
				monthName = "July" ; 
				break ; 
			case 8 : // if (monthNumber == 8)
				monthName = "August" ; 
				break ; 
			case 9 : // if (monthNumber == 9)
				monthName = "September" ; 
				break ; 
			case 10 : // if (monthNumber == 10)
				monthName = "October" ;
				break ; 
			case 11 : // if (monthNumber == 11)
				monthName = "November" ;
				break ; 
			case 12 : // if (monthNumber == 12)
				monthName = "December" ;
				break ; 
			// else , using default
			default : 
				System.out.println("Incorrect input , Maybe you input wrong format."); // show output msg
				return ; // return output result (didnt change result in monthName)
			}
		// 3 : end switch structure , print output
		System.out.println("The month " + monthNumber + " is transformed to " + monthName) ; // for case 1-12 only
	}
	
	// 2nd fn : main fn -> calling convertMonth fn
	public static void main(String[] args) { // having args array as parameter
	
		// 1 : define monthNumber & Scanner for input
		int monthNumber ; 
		
		// 2 : create Scanner & replace to monthNumber with input value
		System.out.print("Hello , This program converts monthNumber to monthName . Please enter monthNumber : ");
		
		Scanner rubkar = new Scanner(System.in);
		monthNumber = rubkar.nextInt(); 
	
		// 3 : calling convertMonth function
		convertMonth(monthNumber);
	}
}
