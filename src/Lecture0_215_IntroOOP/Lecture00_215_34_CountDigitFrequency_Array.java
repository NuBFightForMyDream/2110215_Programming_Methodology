package Lecture00_2110215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lecture00_215_34_CountDigitFrequency_Array {



	// main function : read string with BufferReader
	public static void main(String[] args) throws IOException { // main fn , return void (nothing) , if error will throw IOexception
		// BufferReader : readline from string (converted from each byte of char) -> stored in "stdin"
		BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
			
		// readline with stdin (makes code read faster)
		System.out.println("Enter Your Password : ") ; 
		String password = stdin.readLine() ; 
		
		// Instead of defining new variables , using array is better 
		int [] digitFreq = new int[10] ; // create vacant array with 10 elements -> default value = 0 
		
		// for loop , check frequency
		for (int pos = 0 ; pos < password.length() ; pos++) {
			// check char at that pos then add frequency to array 
			char c = password.charAt(pos) ;
			// check condition
			if (c >= '0' && c <= '9') {
				digitFreq[c - '0']++ ; // 'c' - 0 = c (integer) 
			}
		}
		
		// end loop , print result with loop in array 
		for (int j = 0 ; j < digitFreq.length ; j++) { // array.length --> no need to use () 
			System.out.println("Frequency of Number " + j + " is : " + digitFreq[j]) ;
		}
	}

}
