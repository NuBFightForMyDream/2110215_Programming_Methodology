package Lecture2_215_Inheritance.PVKLecture;
import java.util.ArrayList ;

public class MySchool {
    // main method
    public static void main(String[] args) {
        // define arraylist
        ArrayList<Student> students = new ArrayList<Student>();

        // add each student
        students.add(new Student()); // new object (call constructor)
        students.add(new CPStudent());
        students.add(new CPStudent()); // can put in arraylist bcz CPStudent is Student
        students.add(new UndergraduateStudent("Nine"));

        // loop each student then print
        for (Student eachStudent : students) {
            // Polymorphism : will call standard class
            System.out.println(eachStudent.toString()); // no need to toString()
        }

        // call hello method (generic method)
        helloStudent( new Student("Pop") ) ;
        helloStudent( new UndergraduateStudent("Dae") ) ;
        helloStudent( new CPStudent() ) ;
    }

    // generic method -> generic for all subclass
    public static void helloStudent(Student eachStudent){
        System.out.println( "Hello " + eachStudent.name ) ;
        // check if eacvhStudent is class of CPStudent
        if (eachStudent instanceof CPStudent) {
            System.out.print("I Love 2110215 Prog Meth Wei");
        }
    }


}
