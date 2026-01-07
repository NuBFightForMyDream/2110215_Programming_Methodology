package Lecture00_2110215;

// import Scanner class (for input)
import java.util.Scanner ;
public class Lecture00_215_07_Exercise_Trigonometry {

	public static void main(String[] args) {
		// Exercise : Trigonometry of Triangle
		// Given b as horizontal angle (angle measured from floor)
		// Given a as diagonal length
		// Find : Base length & Height
		
		System.out.println("Calculating Diagonal Length & Horizontal Angle for Base & Height");
		
		// 1 : create new Scanner data type (for input)
		Scanner rubkar = new Scanner(System.in); // create scanner then create var.
		
		System.out.print("Enter Diagonal Length : "); // use print for current line
		double DiagonalLength = rubkar.nextDouble();
		System.out.print("Enter Horizontal Degree : "); // use print for current line
		double thetaDegree = rubkar.nextDouble();
		
		// 2 : calculate using Math class
			// first , we need to transform angle from Radians -> Degree
		double thetaRadians = Math.toRadians(thetaDegree);
			// now we can calculate base length & height
		
		// Note : base length = acos0 , height = asin0
		double baseLength = Math.cos(thetaRadians) * DiagonalLength ;
		double Height = Math.sin(thetaRadians) * DiagonalLength ;
		
		// 3 : print result
		System.out.println("Base length is : " + Math.round(baseLength));
		System.out.println("Height is : " + Math.round(Height));	
	}
}
