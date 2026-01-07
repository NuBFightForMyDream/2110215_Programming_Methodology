package Lecture0_215_IntroOOP;

public class Lecture00_215_11_TypeConversionExercise {

	public static void main(String[] args) {
		// declare variable
		String a = (3 / 4) + "5" ; 
		System.out.println("a = " + a) ; // a = (0.75) + "5" = "0.755" X WRONG
		// False , because int / int returns int , so a = 0 (3/4) + "5" = "05"
		// if want 0.75 -> define 3.0 / 4 (double / int = double)
		
		String b = (int) 3 / 4 + "5" ; // 3 will change to int ==> 3/4 + "5" = 0 + "5" = "05"
		System.out.println("b = " + b);
		
		String c = 4 / (int) 4.0 + "5" ; // will get 4 / ((int)4) + "5" ==> 1 (int) + "5" = "15" 
		System.out.println("c = " + c);
		
		boolean d = 2 == 3 && true ; // do 2 == 3 first -> false && (and) true = false
		System.out.println("d = " + d);
		
		boolean e = 3 == 3 && true ; // do 3 == 3 first -> true && true = true
		System.out.println("e = " + e);
		
		int f = 6 / 2 * 3 ; // 6 / 2 = 3 (int) -> 3 * 3 = 9
		System.out.println("f = " + f);
		
		double g = 6.0 / 2 / 3 ; // g = (3.0 (double)) * 3 = 1.0 (double)
		// well , we can store int -> BUT we need to cast double to int (make sure to lose precision)
		// int g2 = (int)(g) ; --> double is more recommended
		System.out.println("g = " + g);
		
		double h = 6 / 2.0 * 3 ; // h = (6 / 2.0) * 3 = 3.0 (double) * 3 = 9.0 (double)
		System.out.println("h = " + h);
		
		double i = 18 / 4 * 9.0 ; // i = (18 / 4) * 9.0 = (4 (int / int = int) ) * 9.0 = 36.0 (double) 
		System.out.println("i = " + i);
		
		double j = 6.0 / 4 * (float) 4 ; // j = (6.0 / 4) * (float) 4 = 1.5 (double) * 4.0 (float) = 6.0 (double)
		System.out.println("j = " + j);
		
		byte k = (byte) -31 ; // byte stores -128 to 127 (fking small) -> return -31 (jnt) -> can store in int/double/byte
		System.out.println("k = " + k);
		
		int l = (byte) 133 ; // byte over 128 -> using approximation of binary digits -> get -123 as result -> store in byte/int/double
		System.out.println("l = " + l);
		
		double m = 9F - 1.0 + 4 ; // 9F = 9 floating point = 9.0 (we can cast to float
		System.out.println("m = " + m); // m = 9.0 - 1.0 + 4 = 8.0 + 4 = 12.0 (double)
		
		boolean n = 4 - 5.0 == 7 - 8 ; // do from rightmost to leftmost : (4 - 5.0) = -1.0 (double) == (7 - 8 = -1 (int) )
		System.out.println("n = " + n); // -1.0 == -1 -> return true (compiler assume as near precision)
		
	}
}
