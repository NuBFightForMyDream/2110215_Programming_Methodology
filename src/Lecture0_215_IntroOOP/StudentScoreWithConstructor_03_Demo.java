package Lecture00_215_OOP;

public class StudentScoreWithConstructor_03_Demo {

	// main method 
	public static void main(String[] args) {
		// create 3 constructors
		
		// No-Argument Constructor
		StudentScoreWithConstructor_03_Class student_1 = new StudentScoreWithConstructor_03_Class() ;
		// Detailed Constructor
		StudentScoreWithConstructor_03_Class student_2 = new StudentScoreWithConstructor_03_Class("6730084521",10) ;
		// Copy Constructor
		StudentScoreWithConstructor_03_Class student_3 = new StudentScoreWithConstructor_03_Class(student_2) ;
		
		// change value by setID in 3rd constructor
		student_3.setStudentID("6730084621");
		
		// print then check result
		System.out.println(
				"Student #1 ID : "+student_1.getStudentID()+" got score "+student_1.getStudentScore()+" points!");
		System.out.println(
				"Student #2 ID : "+student_2.getStudentID()+" got score "+student_2.getStudentScore()+" points!");
		System.out.println(
				"Student #3 ID : "+student_3.getStudentID()+" got score "+student_3.getStudentScore()+" points!");

		
		// print with toString method
		System.out.println("----------------------------") ; 
		
		System.out.println(student_1) ; 
		System.out.println(student_2) ;
		System.out.println(student_3) ;
	}
		

}
