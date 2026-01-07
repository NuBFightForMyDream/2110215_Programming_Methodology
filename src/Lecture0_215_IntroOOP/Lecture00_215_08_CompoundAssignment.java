package Lecture00_2110215;

public class Lecture00_215_08_CompoundAssignment {
	
	public static void main(String[] args) {
		// declare var.
		int firstVar = 3 , secondVar = 4 ;
		double thirdVar = 6.78;
		
		// compound assignment
		firstVar += 10 ; // firstVar = 3 + 10 = 13 ==> firstVar = 13
		secondVar *= firstVar ; // secondVar = secondVar (4) * 13 = 52
		
		// string compound assignment
		String firstString = "Hello " ;
		firstString += "CP52!!" ; // "Hello " + "CP52!!" = "Hello CP52!!"
		
		// complex expression 
		int x = 3 , y = 4 ; 
		x *= (x + y) ; // multiply with x + y then assign to x (x got new value)
		System.out.println("New X value is : " + x); // x = 7 * (3+4) = 7 * 7 = 49
		
		// right associative (more than 1 assignment)
		int x2 , y2 ;
		x2 = y2 = 10 ; // do Rightmost -> Leftmost : y2 = 10 -> x2 = y2(10)
		System.out.println(x2 + " , " + y2); // 10 , 10 as result
		
		// more complicated right associative
		int x3,y3 ;
		y3 = 5 * (x3 = 4) ; // do inside parenthesis first -> y3 = 5 * (4) = 20
		System.out.println("Y3 is : " + y3);
		// CAUTION : BE AWARE OF FORGOTTING () Ex : y3 = 5 * x3 = 4 -> will do 5*x3 then = 4 (which will cause error)
		
		// more and more challenges compound assignment
		int x4 = 3 , y4 = 5 ; 
		int xf = x4 += y4 *= 7 ; // do rightmost to leftmost
		// xf = x4 += (y4 *= 7) ==> xf = x4 += (5 *= 7) ==> xf = x4 += 35
		// xf = (3 += 35) ==> xf = 38
		System.out.println("Final Value of X : " + xf);
		
	}
}
