package Lecture0_215_IntroOOP;

public class Lecture00_215_38_ArrayExercise {
	
	// 1st function : countFreunecyCharInArray(arr_a , c) : count frequency of c in array a (arr_a) 
	public static int countFrequencyCharInArray(char[] arr_a , char c) {
		// define freq_c
		int freq_c = 0 ; 
		// loop in array , count
		for (int pos = 0 ; pos < arr_a.length ; pos++) {
			if (arr_a[pos] == c) {
				freq_c += 1 ; 
			}
		}
		// end loop , return freq_c
		return freq_c ; 
	}
	
	// 2nd function : checkIfMemberInArray(arr_b , x) : check if member x in arr_b
	public static boolean checkIfMemberInArray(int x , int[] arr_b) {
		// define pos & checker 
		int pos = 0 ; boolean foundElement = false ; 
		
		// check if array is null
		if (arr_b == null) return false ; 
		
		// do loop
		while ( (pos < arr_b.length) && (arr_b[pos] != x) ) {
			// still not found 
			pos++;
		}
		// check if found or not 
		if (pos < arr_b.length) {
			if (arr_b[pos] == x) foundElement = true ; 
		}
		return foundElement ; 
	}
	
	// 3rd method : isPalinDrome(arr_c) : check if arr_c is palindrome (null is counted as palindrome)
	public static boolean isPalinDrome(int[] arr_c) {
		// check if null or 1 element > counted as palidrome
		if (arr_c == null || arr_c.length == 1) return true ; 
		// else , check element half 
		int left = 0 , right = arr_c.length - 1 ; 
		while (left <= right) {
			if (arr_c[left] != arr_c[right]) return false ; 
			left++ ; right-- ; // left move righthand , right move lefthand
		}
		// if end loop and not false , return true
		return true ; 
	}
	
	// we'll test all code with JUnit instead
	
}
