package Lecture00_2110215;

public class Lecture00_215_28_MethodInvocationMechanism {
	// define main method (fn)
	public static void main(String[] args) {
		// declare var.
		double x = 6.0 , y = 8.0 , z ;
		z = sqrtN(x,y,2); // calling sqrt2 of value to z
		System.out.println("The value of Z is : " + z);
	}
	
	// declare mathFunction method
	public static double sqrtN(double a , double b , int n) { // return double
		double a_pow_n = Math.pow(a,n); 
		double b_pow_n = Math.pow(b,n);
		return Math.pow(a_pow_n + b_pow_n , 1.0 / n); // division like this got double type
	}
	
	// Be aware of same type parameters & name -> Method Overloading !!! (even if return type same , will cause error)
	
}
