package Lecture0_215_IntroOOP.IntroClassObjects;

public class StudentScorePrivate_02_Class {
	// define variables
	private String studentID ; // private -> outside can't see variables inside
	private int studentScore ; 
	
	// solved by creating getter - setter method 
	
	// Getter-Accessors : read values of private data 
	public String getStudentID() { // no attributes
		return studentID ; // String
	}
	public int getStudentScore() { // no attributes
		return studentScore ; // int 
	}
	
	// Setter-Mutators : Change values in private data 
	public void setStudentID(String newStudentID) {
		// refer to "this" (like self in Python) 
		this.studentID = newStudentID ;  
	}
	
	public void setStudentScore(int newStudentScore) {
		// refer to "this" (like self in Python) 
		if (studentScore < 0) studentScore = 0 ; 
		this.studentScore = newStudentScore ;  
		
	}
	// studentScoreHiding --> same as studentScorePrivate
}
