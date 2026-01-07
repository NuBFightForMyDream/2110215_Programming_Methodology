package Lecture0_215_IntroOOP;

public class Lecture00_215_35_NullDemo {

	public static void main(String[] args) {
		// define array of String
		String [] stringArray = new String[5] ; // array of String with size 5 
		// for loop , print each index
		for (int i = 0 ; i < stringArray.length ; i++) {
			System.out.println("stringArray["+i+"] = " + stringArray[i]) ; 
		}
		// check first element
		if (stringArray[0] == null) {
			System.out.println("Yes , first element is null");
		}
		else {
			System.out.println("It length is " + stringArray[0].length()) ; // NullPointerException
		}

	}

}
