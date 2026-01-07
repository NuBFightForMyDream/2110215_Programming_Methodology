package Lecture00_2110215;

// import library
import java.io.*;

public class Lecture00_215_33_CountDigitFrequency_NoArray {
	
	// main function : read string with BufferReader
	public static void main(String[] args) throws IOException { // main fn , return void (nothing) , if error will throw IOexception
		// BufferReader : readline from string (converted from each byte of char) -> stored in "stdin"
		BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
		
		// readline with stdin (makes code read faster)
		System.out.println("Enter Your Password : ") ; 
		String password = stdin.readLine() ; 
		
		// define variables for storing digit frequency 
		int freq_0 = 0 , freq_1 = 0 , freq_2 = 0 , freq_3 = 0 , freq_4 = 0 , freq_5 = 0 ;
		int freq_6 = 0 , freq_7 = 0 , freq_8 = 0 , freq_9 = 0 ;
		
		// for loop check digit 
		for (int i = 0 ; i < password.length() ; i++) {
			// define each char 
			char c = password.charAt(i) ; 
			// check if in condition 0 to 9 
			if (c >= '0' && c <= '9') {
				switch(c) { // check case of c from 0 to 9 
					case '0' : freq_0++ ; break;
					case '1' : freq_1++ ; break;
					case '2' : freq_2++ ; break;
					case '3' : freq_3++ ; break;
					case '4' : freq_4++ ; break;
					case '5' : freq_5++ ; break;
					case '6' : freq_6++ ; break;
					case '7' : freq_7++ ; break;
					case '8' : freq_8++ ; break;
					case '9' : freq_9++ ; break;
					default : // else , do nothing
				}	
			}
		}
		
		// end loop , print out result
		System.out.println("Frequency of 0 : " + freq_0) ; 
		System.out.println("Frequency of 1 : " + freq_1) ; 	
		System.out.println("Frequency of 2 : " + freq_2) ; 	
		System.out.println("Frequency of 3 : " + freq_3) ; 
		System.out.println("Frequency of 4 : " + freq_4) ; 
		System.out.println("Frequency of 5 : " + freq_5) ; 	
		System.out.println("Frequency of 6 : " + freq_6) ; 	
		System.out.println("Frequency of 7 : " + freq_7) ; 
		System.out.println("Frequency of 8 : " + freq_8) ; 
		System.out.println("Frequency of 9 : " + freq_9) ; 	
	}
	
	// Code too long , using array is better
}
