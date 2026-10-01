package Lecture0_215_IntroOOP;

public class Lecture00_215_15_CommandLineArgumentExercise {

	public static void main(String[] args) {
		// Exercise : Trigonometry of Triangle
		// Given b as horizontal angle (angle measured from floor)
		// Given a as diagonal length
		// Find : Base length & Height

		// Well , if run program normally , it will causes ERROR !!
		// So , we need to RUN CONFIGURATIONS 
		// choose filename -> Arguments -> input arguments 
		// Then result would shown in console.
		
		// 1 : input with command line arguments
		String diagonalLength_in = args[0] ;
		String thetaDegree_in = args[1] ; 
		
			// change to double type
		double diagonalLength = Double.parseDouble(diagonalLength_in); // we can put args[0] inside parseDouble too !!
		double thetaDegree = Double.parseDouble(thetaDegree_in);
		
		// 2 : calculate height & base
		double thetaRadians = Math.toRadians(thetaDegree);
		
		double base = diagonalLength * Math.cos(thetaRadians);
		double height = diagonalLength * Math.sin(thetaRadians);
		
		// 3 : print result
		System.out.println("Base : " + base);
		System.out.println("Height : " + height);
		
	}

}
