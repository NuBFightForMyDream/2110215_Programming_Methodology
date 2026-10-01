package Lecture0_215_IntroOOP;

public class Lecture00_215_36_SequentialSearchAlgorithm {

	public static void main(String[] args) {
		
		// define array 
		int [] searchArray = {99,105,86,34,108,25,11,96,111} ; 
		System.out.println("searchArray : " + printArray(searchArray)) ; // call printArray method 
			// (no need to declare type for parameters when calling function)
		
		// call sequential search algorithm 
		System.out.println("86 is found at pos "+sequentialSearchAlgorithm(searchArray , 86)+" ");
		System.out.println("96 is found at pos "+sequentialSearchAlgorithm(searchArray , 96)+" ");
		System.out.println("112 is found at pos "+sequentialSearchAlgorithm(searchArray , 112)+" ");

	}
	
	public static String printArray(int [] arr) {
		String output_string = "{" ; // define initial string
		for (int pos = 0 ; pos < arr.length - 1; pos++) { // loop add element
			output_string += arr[pos] + " , " ;
		}
		return output_string + arr[arr.length - 1] + "}" ; // return output string 
	}

	public static int sequentialSearchAlgorithm(int [] searchArr , int findElement) {
		int pos = 0 , len = searchArr.length ; 
		while (pos != len && searchArr[pos] != findElement) { // while loop , check element
			pos++ ; // when not in cd (found findElement , will break automatically)
		}
		// check if found or not
		if (pos >= len) pos = -1 ; // return as Not Found
		return pos ; // else , return False
	}
}
