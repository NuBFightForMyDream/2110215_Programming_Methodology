package Lecture0_215_IntroOOP;

public class Lecture00_215_10_TypeConversion {

	public static void main(String[] args) {
		// declare var
		int i,j,k ;
		double d1 = 0.5 , d2 = 0.5 , d3 , d4 ; 
		
		// PART 1 : Casting double -> integer
		
		// converting (casting) float to int by this cmd : (int)(var.) 
		i = (int)(d1 + 8.735f) ; // f is for floating point (writing it will promote float to double)
			// so we convert (int)(double + double) = int
			// (int)(0.5 + 8.735f) = (int)(9.235) = 9 ==> i = 9 
		j = (int)(d1 + d2) ; // j = (int)(1.0) = 1
		// what if we separate casting
		k = (int)d1 + (int)d2 ; // k = (int)(0.5) + (int)(0.5) = 0 + 0 = 0
		
		// check out result
		System.out.println("i : " + i); // i = 9
		System.out.println("j : " + j); // j = 1
		System.out.println("k : " + k); // k = 0
		
		// PART 1.5 : integer convertion after subtraction
		d3 = i - j ; // 9 - 1 = 8.0 (double) bcz d3 stores double
		d4 = i - k ; // 9 - 0 = 9.0 (double) bcz d4 stores double // even if using (int)d4 -> will always show double format
		System.out.println(d3 + " , " + d4); // 8.0 , 9.0
		
		// PART 2 : short casting
		short s1 ; // SHORT is integer with lower range than int (2^-15 to 2^15)
		s1 = (short)2000 ; // 2000
		System.out.println(s1);
		
		short s2;
		s2 = (short)327674 ; // return -6
		System.out.println(s2); // lowest-16 bits transformation (read for more details)
		// short is approximation from binary digits
	}

}
