package Lecture0_215_IntroOOP;

public class Lecture00_215_14_CommandLineArgument {

	public static void main(String[] args) { // String[] args is command line argument
		// args is name of string array Ex ; args[0] for first input -> kept in array
		
		// 1 : create constant named TEMP_CONVERT
		final double TEMP_CONVERT = 1.8 ; 
		
		// 2 : input with using command line argument
		String celsius = args[0] ;
		double celsiusTypeDouble = Double.parseDouble(celsius) ; // convert String to double using Double class 
		
		double fahrenheit ; // define farhenheit
		
		// 3 : calculate fahrenheit
		fahrenheit = (celsiusTypeDouble * TEMP_CONVERT) + 32 ; 
		
		// 4 : print out result
		System.out.println("Fahrenheit Equivalence : " + fahrenheit) ;
		
		// Well , if run program normally , it will causes ERROR !!
		// So , we need to RUN CONFIGURATIONS 
		// choose filename -> Arguments -> input arguments 
		// Then result would shown in console.

	}

}
