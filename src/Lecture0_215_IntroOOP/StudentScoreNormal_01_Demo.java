package Lecture00_215_OOP;

public class StudentScoreNormal_01_Demo {
	// main function
	public static void main(String[] args) {
		// create object from class StudentScoreNormal file
		StudentScoreNormal_01_Class student_1 = new StudentScoreNormal_01_Class() ; 
		StudentScoreNormal_01_Class student_2 = new StudentScoreNormal_01_Class() ; 
		
		// define value for object 
		student_1.studentID = "6730084521" ; 
		student_1.studentScore = 99 ; 
		
		student_2.studentID = "6730084621" ; 
		student_2.studentScore = 52 ; 
		
		// output 
		System.out.println("Nisit #1 " + student_1.studentID + " Got Score : " + student_1.studentScore);
		System.out.println("Nisit #2 " + student_2.studentID + " Got Score : " + student_2.studentScore);
	}
}
