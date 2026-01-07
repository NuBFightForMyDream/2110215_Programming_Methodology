package Lecture00_215_OOP;

public class StudentScorePrivate_02_Demo {

	// main function
	public static void main(String[] args) {
		// create object from class StudentScoreNormal file
		StudentScorePrivate_02_Class student_1 = new StudentScorePrivate_02_Class() ; 
		StudentScorePrivate_02_Class student_2 = new StudentScorePrivate_02_Class() ; 
			
		// define value for object 
		
		// now we can't change-get data directly , need to call via methods

			// student_1.studentID = "6730084521" ; 
			// student_1.studentScore = 99 ; 
		
			String newStudentID_1 = "6730084421" ; 
			student_1.setStudentID(newStudentID_1);
			
			String newStudentID_2 = "6730084721" ; 
			student_2.setStudentID(newStudentID_2);
			
			int newScore_1 = 54 ; 
			student_1.setStudentScore(newScore_1);
			
			int newScore_2 = 48 ; 
			student_2.setStudentScore(newScore_2);
			
		// output 
		System.out.println("Nisit #1 " + student_1.getStudentID() + " Got Score : " + student_1.getStudentScore());
		System.out.println("Nisit #2 " + student_2.getStudentID() + " Got Score : " + student_2.getStudentScore());
		
	}
}
