package Lecture00_215_OOP;

public class StudentScoreWithConstructor_03_Class {
	// define private attributes -> need to create getter & setter method
	private String studentID ; 
	private int studentScore ; 
	
	// --- Part I : Getter & Setter Methods ---
		
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
	
	// --- Part II : define 3 Constructors
		// Constructor = method that not returns anything , but have same name as class
		// Overloading constructor : different arguments = different method 
	
	// No-argument Constructor
	public StudentScoreWithConstructor_03_Class() {
		setStudentID("000000") ; 
		setStudentScore(0) ; 
	} // Constructor with >1 parameter : must create 
	
	// Detailed Constructor
	public StudentScoreWithConstructor_03_Class(String studentID , int studentScore) {
		setStudentID(studentID) ; 
		setStudentScore(studentScore) ; 
	}
	
	// Copy Constructor
	public StudentScoreWithConstructor_03_Class( StudentScoreWithConstructor_03_Class stdscore) {
		// stdscore = another constructor
		setStudentID( stdscore.getStudentID() ) ; // get value from another constructor then set value
		setStudentScore( stdscore.getStudentScore() ) ; 
	}
	
		// Using constructor are in StudentScoreWithConstructor_Demo
	
	// special method : toString method -> return string for printing constructor
	public String toString() {
		return "(ID : "+getStudentID()+" , Score : "+getStudentScore()+")"; 
	}

}
