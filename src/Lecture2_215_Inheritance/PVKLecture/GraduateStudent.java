package Lecture2_215_Inheritance.PVKLecture;

public class GraduateStudent extends Student {
    // attributes
    private String advisorName ;

    // constructor
    public GraduateStudent(String studentName) {
        super(studentName); // call parent "studentName" -> attribute from parent
        this.advisorName = "No Advisor" ; // default value
    }

    public GraduateStudent(String studentName , String advisorName) {
        super(studentName) ; // set studentName from parent class
        this.advisorName = advisorName ;
    }

    // getter-setter methods
    public String getAdvisorName() {
        return advisorName;
    }
    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName ;
    }

    // another methods
    public void completeCourseGrade() {
        int totalScore = 0 ;
        // loop add score from array
        for (int i = 0 ; i < NUM_OF_TESTS ; i++) {
            totalScore += testScores[i] ;
        }
        // grading session
        if (totalScore / NUM_OF_TESTS > 80) courseGrade = "Pass" ;
        else courseGrade = "Not Pass" ;
    }

    public void printName() {
        System.out.println("GraduateStudent") ;
    }
    public static void printAbbrev() {
        System.out.println("GGGGG") ;
    }
    public String toString() {
        return "Graduate Student name : " + super.toString() + " / [courseGrade = " + courseGrade + "]" ;
    }

}
