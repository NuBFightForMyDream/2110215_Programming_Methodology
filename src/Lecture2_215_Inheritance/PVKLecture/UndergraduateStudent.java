package Lecture2_215_Inheritance.PVKLecture;

public class UndergraduateStudent extends Student {
    // constructor
    public UndergraduateStudent(String studentName) {
        super(studentName) ; // set student name (from parent) to "studentName" (parameter)
        // "name" attribute is from parent
    }

    public void completeCourseGrade() {
        int totalScore = 0 ;
        // loop add score from array
        for (int i = 0 ; i < NUM_OF_TESTS ; i++) {
            totalScore += testScores[i] ;
        }
        // grading session
        if (totalScore / NUM_OF_TESTS > 70) courseGrade = "Pass" ;
        else courseGrade = "Not Pass" ;
    }

    @Override // same method , but different result
    public void printName() {
        System.out.println("UndergraduateStudent") ;
    }
    @Override
    public String toString() {
        return "Undergraduate Student name : " + super.toString() + " / [ courseGrade = " + courseGrade + "]" ;
    }
    public static void printAbbrev() {
        System.out.println("UUUUU");
    }
}
