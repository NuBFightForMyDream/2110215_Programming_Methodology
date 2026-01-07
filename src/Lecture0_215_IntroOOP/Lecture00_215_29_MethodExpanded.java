package Lecture00_2110215;

public class Lecture00_215_29_MethodExpanded {

	public static void main(String[] args) {
		
		// declare var
		double x1 , x2 , x3 , x4 , y ; // y as latest result of all sum
		
		// Loop #1 
		x1 = 1.5;
		y = 0 ; 
		for (int i = 1 ; i <= 3 ; i++) {
			y += i * Math.pow(x1, i);
		}
		System.out.println("Value of Y for 1st loop : " + y);
		
		// Loop #2 -> reset y 
		x2 = 2.5;
		y = 0 ; 
		for (int i = 1 ; i <= 3 ; i++) {
			y += i * Math.pow(x2, i);
		}
		System.out.println("Value of Y for 2nd loop : " + y);
		
		// Loop #3 -> reset y 
		x3 = 3.5;
		y = 0 ; 
		for (int i = 1 ; i <= 3 ; i++) {
			y += i * Math.pow(x3, i);
		}
		System.out.println("Value of Y for 3nd loop : " + y);
		
		// Loop #4 -> reset y 
		x4 = 4.5;
		y = 0 ; 
		for (int i = 1 ; i <= 3 ; i++) {
			y += i * Math.pow(x4, i);
		}
		System.out.println("Value of Y for 4nd loop : " + y);
		
		System.out.println("---------REDUCED LOOP AS METHOD------");
		
		// declare var.
		double x5 , x6 , x7 , x8 ;
		x5 = 1.5 ; x6 = 2.5 ; x7 = 3.5 ; x8 = 4.5 ; 
		
		System.out.println("Value of Y for 5th loop : " + Function(x5,3));
		System.out.println("Value of Y for 6th loop : " + Function(x6,3));
		System.out.println("Value of Y for 7th loop : " + Function(x7,3));
		System.out.println("Value of Y for 8th loop : " + Function(x8,3));
		
	} // end of main fn

		// We can see that code is too long and same pattern
		// So , We can derive method as Function and we'll replace new x value
		public static double Function(double x , int N) {
			// define total_sum
			double total_sum = 0 ;
			// for loop
			for (int i = 1 ; i <= N ; i++) {
				total_sum += i * Math.pow(x,i);
			}
			// return value
			return total_sum ; // double
		}
}	
