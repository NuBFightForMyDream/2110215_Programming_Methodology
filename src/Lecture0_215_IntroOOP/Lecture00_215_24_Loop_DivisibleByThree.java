package Lecture0_215_IntroOOP;

import java.util.Scanner;

public class Lecture00_215_24_Loop_DivisibleByThree {

	public static void main(String[] args) {
		// Key : find number divided by 3 between 1 to 50
		
		// PART 1 : while loop
		System.out.println("3-Divided number between 1 to 50 (While Loop) : ");
		
		int i = 0 ; 
		while (i <= 50) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
			i++ ; // still add value of i whether divided by 3 or not
		}
		
		// PART 2 : do while
		System.out.println("3-Divided number between 1 to 50 (Do-While Loop) : ");
		
		int j = 0 ; 
		do {
			if (j % 3 == 0) {
				System.out.println(j);
			}
			j++ ; // still add value of j whether divided by 3 or not
		} while (j <= 50) ; // dont forget ; after while ...
		
		// PART 3 : for loop
		System.out.println("3-Divided number between 1 to 50 (For Loop) : ");
		for (int k = 0 ; k <= 50 ; k++) {
			if (k % 3 == 0) {
				System.out.println(k);
			}
		}
		
	// End program
	System.out.println("End program !!!");
	}

}
