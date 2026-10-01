package Lecture0_215_IntroOOP;

public class Lecture00_215_26_Loop_NestedLoopAndExercise {

	public static void main(String[] args) {
		
		// PART 1 : Nested Loop
		
		// declare K , M , N 
		int N = 6 , M = 8 , k = 0 ; // N is outest loop , M is middle loop , K is innest loop
		for (int i = 0 ; i < N ; i++) {
			System.out.println("Loop Round #" + i);
			
			// j < i -> for loop j inside i
			for (int j = 0 ; j < M ; j++) {
				k += 1 ; // K wont reset value
				System.out.println("i : " + i + " -> j = " + j + " -> k = " + k);
			}
			System.out.println("-------------------------"); // for each loop of i
		}
		// print k result
		System.out.println(k); // latest result of k after ending loop
		
		System.out.println("-----------END OF PART 1-----------");
		
		// PART 2 : Exercises
		
		// 2.1 : print possible a,b,c which a^2 + b^2 + c^2 = 200 which all are int starting from 0
		int a,b,c ;
		
		for (a = 0 ; a < 15 ; a++) { // why < 15 => imagine some_num ^ 2 < 200 , so min nb. is 14
			for (b = 0 ; b < 15 ; b++) {
				for (c = 0 ; c < 15 ; c++) {
					// check if a^2 + b^2 + c^2 = 200
					if (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) == 200) {
						// print all possible a,b,c values
						System.out.println("a = " + a + " b = " + b + " c = " + c);
					}
				} // loop c
			}	// loop b
		} // loop a
		
		System.out.println("-----------END OF PART 2.1-----------");
		
		// 2.2 : write code from flowchart
		int x = 0 , y = 0 , z = 0 ; 
		int n = 5 , v = 0; 
		
		while (x <= n) {
			v = 0 ; 
			while (y <= x) {
				y += 1 ;
			}
			x += 1 ; 
			// do A
			z += y ; 
		}
		// print value of all var.
		System.out.println("X = " + x + " Y = " + y + " Z = " + z + " N = " + n + " V = " + v);
		
	}

}
