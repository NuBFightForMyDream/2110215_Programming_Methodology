package Lecture00_2110215;

public class Lecture00_215_09_CompoundAssignmentExercise {

	public static void main(String[] args) {
		// declare var.
		int x = 1 ; 
		x = x + 1 ;
		System.out.println(x) ; // x = 1+1 = 2
		
		// Part 1 : ++x and x++
		x += 1 ; 
		System.out.println(x) ; // x = 2 + 1 = 3 
		// NOTE : ++x , x++ are incremented by 1 !!!
		
		System.out.println(++x);
		// preincrement : add x then print 
		// so it shows 4 as result
		System.out.println(x++); 
		// postincrement : print then add x
		// so it shows 4 as result (x changed to 5)
		System.out.println(x); // 5 from latest result
		
		// Part 2 
		int y = x++ + 0 ; // x changed to 6 (but using 5 in y) -> y = 5 + 0 = 5
		System.out.println(x + "," + y) ; // 6,5 (x changed to 6)
		
		// Part 3 
		double z = ++x + 0.0 ; // x added to 7 (used as 7) + 0.0 -> 7.0 (changed to double type)
		System.out.println(x + "," + z); // 7 , 7.0
		
		// Part 4
		String s = x + "1" + z ; // s = 7 + "1" + 7.0 -> string concatenation = "717.0"
		System.out.println(s);
		System.out.println(x + "," + y + "," + z) ;  // x = 7 , y = 5 , z = 7.0 , s = "717.0"
			// dont use char for string concatenation (cuz it will change to decimal nb.)
		
		// Part 5
		x /= (x - 7) ; // x /= (7 - 7) -> x /= 0 -> error from dividing 0
		System.out.println(s) ; // runtime exception
		
	}

}
