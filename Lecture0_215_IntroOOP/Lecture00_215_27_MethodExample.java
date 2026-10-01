package Lecture0_215_IntroOOP;

public class Lecture00_215_27_MethodExample {
	// 1st method : sum of N * X^N 
	
	// 1st we create method name NxPowerN , which have parameter of x (double) , N (int) [argument list]
	// which is static method (public) , returning Y (double) as result
	
	public static double NxPowerN(double x , int N) { // public static returning_type name(parameters)
		// initialize var. 9only Y , cuz we already initialize in X)
		double Y = 0 ; // Y is sum of N * x^N
		
		for (int i = 1 ; i <= N ; i++) {
			// sum x^N to Y
			Y += i * Math.pow(x , i);
		}
		// after sum , return result (y) as N * x^N (y = double)
		return Y; // if not return anything , returning "void" type
	}
	
	// Note : Method signature => NxPowerN(double , int) shouldn't be named in other methods (will get confused)
	
	// 2nd method : another method returning different types
	public static boolean isOdd(int number) {
		// parameter number (int) -> return boolean 
		return (number % 2 != 0) ? true : false ; // if (n % 2 != 0) yes return true , no return false
	}
	
	public static int unicodeOf(char character) {
		// parameter = character (char) -> return int (value of char)
		return (int)character ; 
	}
	
	public static // we can write like this (indent)
		String whichStringIsLonger(String s1 , String s2) { // parameter s1 (str) , s2 (str0
			// return s1 or s2 (str) as result
			return ( (s1.length() > s2.length()) ? s1 : s2 ) ; // if ...cond... yes s1 , no s2
		}
	
	// 3nd : factorial fn
	public static int nFactorial(int n) { // n is parameter & local var.
		// declare var.
		int nFactorial = 1 ; // 0! = 1 
		for (int i = 1 ; i <= n ; i++) { // start i = 1 to n!
			nFactorial *= i ; 
		}
		// after for loop , return value
		return nFactorial ;// int
	}
	
	// 4nd fn : method return void fn (print msg)
	public static void printGreetings(String name) {
		System.out.println("Hello , " + name);
		System.out.println("Welcome to 2110215 Programming Methodology !!");
	}
	
	// main fn : call all functions
	public static void main(String[] args) { // parameter = args array[] contains String
		System.out.println("First Function : NxPowerN (x = 5.0 , N = 3) : ");
		System.out.println("The value is : " + NxPowerN(5.0 , 3) );
		
		System.out.println("Second Function : isOdd (number = 10) : ");
		System.out.println("The value is : " + isOdd(10) );
		
		System.out.println("Third Function : unicodeOf (char = 'E') : ");
		System.out.println("The value is : " + unicodeOf('E') );
		
		System.out.println("Fourth Function : whichStringIsLonger (s1 = 'CP51' , s2 = 'Intania') : ");
		System.out.println("The value is : " + whichStringIsLonger("CP51" , "Intania") );
		
		System.out.println("Fifth Function : nFactorial (n = 8) : ");
		System.out.println("The value is : " + nFactorial(8) );
		
		System.out.println("Sixth Function : printGreetings (name = 'Chatrphol') : ");
		printGreetings("Chatrphol"); // call fn -> print msg (returns void)
		
	}
	
	// NOTE : variable declared in method & parameter is "Local Variable"
}

