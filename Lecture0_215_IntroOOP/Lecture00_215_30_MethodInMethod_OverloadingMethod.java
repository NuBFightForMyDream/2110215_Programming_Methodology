package Lecture0_215_IntroOOP;

public class Lecture00_215_30_MethodInMethod_OverloadingMethod {

	public static void main(String[] args) {
		// call HFunction then show result
		System.out.println("H Function Value : " + HFunction(125.5 , 100.0 , 86.67 , 13.8) );
		
		System.out.println("Checking similar char between s1 & s2 : " + hasSimilarChar("CP","PC"));
	
		System.out.println("------------------------------------------------------------------------");
		
		// calling Overloading Method
		KFunction(1,1);
		KFunction(1.0 , 1.0);
		KFunction(1 , 1.0) ; // another parameter will be transformed to double (value changed)
		KFunction(1.0 , 1); // another parameter will be transformed to double (value changed)
	
	} // ending main fn
	
	// defining HFunction & GFunction method
	public static double HFunction(double a , double b , double c , double d) {
		// call GFunction
		double numerator = GFunction(a) ; 
		double denominator = GFunction(a) + GFunction(b) + GFunction(c) + GFunction(d) ; 
		// return result
		return numerator / denominator ; // return double
	}
	
	public static double GFunction(double d) {
		// return result
		return Math.exp(-d / 2);
	}
	
	public static boolean hasSimilarChar(String s1 , String s2) {
		// define boolean to check if s1 is similar to s2
		boolean similarChar = false ; 
		// nested for loop : check each char 
		for (int i = 0 ; i < s1.length() && !similarChar ; i++) { // check if not similarChar status
			for (int j = 0 ; j < s2.length(); j++) {
				// check if same char by indexing -> .charAt()
				if (s1.charAt(i) == s2.charAt(j)) {
					similarChar = true ; // change status to true
					break;
				}
			}
		} // ending outest loop
		return similarChar ;
	}
	
	// define 2 methods for checking overloading method (same name , but different type of parameters)
	public static void KFunction(int a , int b) { // not turning result
		System.out.println("K(" + a + "," + b + ") was called (int , int) ");
	}
	
	public static void KFunction(double a , double b) {
		System.out.println("K(" + a + "," + b + ") was called (double , double) ");
	}

}
