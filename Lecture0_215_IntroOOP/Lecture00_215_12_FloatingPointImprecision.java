package Lecture0_215_IntroOOP;

public class Lecture00_215_12_FloatingPointImprecision {

	public static void main(String[] args) {
		// define d as starting value (double) , increment as incrementing value (double) 
		double d = 0.0 ; 
		double increment = 0.1 ; 
		// so , we'll increment d by 0.1 each round
		System.out.println("Stating Value of D is : " + d);
		
		d += increment ; 
		System.out.println("d + 1 increments \t= " + d) ; // \t = tabs // 0.1
		
		d += increment ; 
		System.out.println("d + 2 increments \t= " + d) ; // \t = tabs // 0.2
		
		d += increment ; 
		System.out.println("d + 3 increments \t= " + d) ; // \t = tabs // 0.30000000000000004
		
		d += increment ; 
		System.out.println("d + 4 increments \t= " + d) ; // \t = tabs // 0.4
		
		d += increment ; 
		System.out.println("d + 5 increments \t= " + d) ; // \t = tabs // 0.5
		
		d += increment ; 
		System.out.println("d + 6 increments \t= " + d) ; // \t = tabs // 0.6
		
		d += increment ; 
		System.out.println("d + 7 increments \t= " + d) ; // \t = tabs // 0.7
		
		d += increment ; 
		System.out.println("d + 8 increments \t= " + d) ; // \t = tabs // 0.7999999999999999
		
		d += increment ; 
		System.out.println("d + 9 increments \t= " + d) ; // \t = tabs // 0.8999999999999999

		d += increment ; 
		System.out.println("d + 10 increments \t= " + d) ; // \t = tabs // 0.9999999999999999
		
		// SO , double has limit precision
		// BTW , we can check if it's near enough to real value -> assume as equal
		boolean isNearEnough = ( Math.abs(d - 1.0) < 1e-6 ) ;
		System.out.println(isNearEnough) ; // true
		
	}

}
