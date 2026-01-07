package Lecture00_215_OOP;

public class StudentScoreWithAnotherMethod_04_Demo {
	// main function 
	public static void main(String[] args) {
		
		// define object by create constructor
		StudentScoreWithAnotherMethod_04_Class student_1 = new StudentScoreWithAnotherMethod_04_Class("6730084421" , 100);
		StudentScoreWithAnotherMethod_04_Class student_2 = new StudentScoreWithAnotherMethod_04_Class("6730084621" , 70);
		
		// manage score
		student_1.penalizeStudentByPercent(25);
		student_2.receiveBonusScore(10);

		// output display
		System.out.println( student_1 + " VS " + student_2 ) ; 
		
		// check comparison 
		if( student_1.hasHigherScoreThan(student_2) ) {
			// print student_1 has more score than student_2
			System.out.println(
					student_1.getStudentID() + " is having better behavior than " + student_2.getStudentID()
				) ; 
		}
		
		else {
			// print student_2 has more score than student_1
			System.out.println(
					student_1.getStudentID() + " is having worse behavior than " + student_2.getStudentID()
				) ; 
		}
		
	}
}
