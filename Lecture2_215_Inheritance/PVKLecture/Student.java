package Lecture2_215_Inheritance.PVKLecture;
import java.util.Arrays ;

public class Student {
    // fields
    protected final static int NUM_OF_TESTS = 3 ;

    protected String name ;
    protected int[] testScores ;
    protected String courseGrade ; // S/U

    // constructor
    public Student() {  // empty constructor
        this("No Name") ; // call detailed constructor
    }
    public Student(String studentName) { // deatailed constructors
        name = studentName ;
        testScores = new int[NUM_OF_TESTS] ;
        courseGrade = "****" ;
    }

    // getter - setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name ;
    }
    public int getTestScore(int testNumber) {
        return (testNumber <= NUM_OF_TESTS) ? testScores[testNumber - 1] : testScores[0] ;
        // check if testNumber <= NUM_OF_TESTS --> yes , get want index ; otherwise get first element
    }
    public void setTestScore(int testNumber , int testScore) {
        testScores[testNumber - 1] = testScore ;
    }
    public String getCourseGrade() {
        return courseGrade;
    }
    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade ;
    }

    // another methods
    public void printName() {
        System.out.println("Student") ;
    }
    public static void printAbbrev() {
        System.out.println("AAAAA") ;
    }
    public String toString() {
        return "[Student name : " + this.name + " having score result as : " + Arrays.toString(testScores) + "]" ;
    }

}
