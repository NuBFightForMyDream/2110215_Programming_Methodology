package Lecture00_2110215;

public class Lecture00_215_37_SelectionSortAlgorithm {

	public static void main(String[] args) {
		// given random array 
		double[] myArray = {42.1 , 7.53 , -89.44 , 16.15 , -73.43 , 58.21 , 94.62 , -21.27 , 65.32 , -3};

		// before selection sort 
		System.out.println("Array before Seletion Sort : " + printArray(myArray)) ; 
		
		// do selection sort algorithm
		selectionSortAlgorithm(myArray) ; 
		
		// after selection sort 
		System.out.println("Array After Seletion Sort : " + printArray(myArray)) ; 
	}
	
	// Displayed Array : printArray method 
	public static String printArray(double [] arr) {
		String output_string = "{" ; // define initial string
		for (int pos = 0 ; pos < arr.length - 1; pos++) { // loop add element
			output_string += arr[pos] + " , " ;
		}
		return output_string + arr[arr.length - 1] + "}" ; // return output string 
	}

	// decompose to 3 methods : selectionSortAlgorithm , findPosMin , swapElement
	public static void selectionSortAlgorithm(double[] arr) { // array of double -> return nothing (sort in myArray)
		int posNow = 0 , posMin ; 
		while (posNow < arr.length - 1) { // start at 0 , end at before N-1
			// call findPosMin to get pos 
			posMin = findPosMin(arr , posNow) ;
			// swap element with posNow and posMin
			swapElement(arr , posNow , posMin);
			// increment posNow
			posNow++ ; 
		}
		
	}
	
	public static int findPosMin(double [] arr , int startingIndex) { 
		// find index of minimum value , start from startingIndex -> return int 
		int posMin = startingIndex ;
		for (int p = posMin + 1 ; p < arr.length ; p++) {
			// check if next value is less than 
			if (arr[p] < arr[posMin]) {
				// give new value
				posMin = p ; 
			}
		}
		// end loop , return index 
		return posMin ; 
		
	}
	
	public static void swapElement(double[] arr , int pos_i , int pos_j) { // swap element between pos i and j
		// define temporary value 
		double temp_value ; 
		// keep first value in temp_value -> replace first value with new value -> replace second value with temp_value
		temp_value = arr[pos_i] ; 
		arr[pos_i] = arr[pos_j] ; 
		arr[pos_j] = temp_value ; 
		
	}
}
