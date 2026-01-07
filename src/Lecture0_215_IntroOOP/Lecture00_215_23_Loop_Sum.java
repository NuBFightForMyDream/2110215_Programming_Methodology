package Lecture00_2110215;

public class Lecture00_215_23_Loop_Sum {

	public static void main(String[] args) {
		// PART 1 : while loop
		int i = 1;
		int sumWhileLoop = 0;

		while (i <= 100000) {
			sumWhileLoop = sumWhileLoop + i; // same meaning as sum += i
			i++; // same meaning as i += 1
		}
		// result will be 1+2+...+100000
		System.out.println("Sum of While loop : " + sumWhileLoop);

		// PART 2 : do while
		int j = 1;
		int sumDoWhile = 0;

		do {
			sumDoWhile += j; // do at least 1 time
			j++;
		} while (j <= 100000);

		// result will be 1+2+...+100000
		System.out.println("Sum of Do While loop : " + sumDoWhile);

		// PART 3 : for loop
		int k = 1;
		int sumForLoop = 0;

		for (k = 1; k <= 100000; k++) { // format : initialize data ; loop condition ; update var.
			sumForLoop += k;
		}

		// result will be 1+2+...+100000
		System.out.println("Sum of For loop : " + sumForLoop);

	}

}
