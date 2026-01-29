package Lecture2_215_Inheritance.PVKLecture;

public class MyUniversity {
    public static void main(String[] args) {
        // define CPStudent
        CPStudent stu_1 = new CPStudent();
        stu_1.name = "Chatrphol" ;
        System.out.println( stu_1.getName() );
        stu_1.setCPIndivProject("Peerapon Indiv");
        System.out.println( stu_1 );

        // Topic 1 ; automatic casting -> cast fron child to parent
        Student stu_2 = new Student() ; // now stu_2 is Student
        stu_2.setName("Chatrphol"); // setName is from parent
            // stu_2.IndivProject = "AI" ; --> Error Bcz we new as CPStudent but cast as Student
            // so , stu_2 is Student (have CPIndivProject , but blind)
        System.out.println( stu_2.toString() ); // from children\
        // properties & method is from CPStudent

        // Topic 2 : explicit casting -> cast from parent to child (need to cast by myself)
        CPStudent stu_3 = (CPStudent) stu_2 ;
        stu_3.CPIndivProject = "AI" ; // now stu_3 is CPStudent , so stu_3 can use Indiv

        // Note : Be careful of automatic casting -> Shouldn't Do
        /*
            Student stu_4 = new UndergraduateStudent("Ming"); // cast vhild to parent using casting
            CPStudent stu_5 = (CPStudent) stu_4 ; // cast wrong , error when compile bcz from UnderGrad doesn't have CPIndiv
            stu_5.CPIndivProject = "Game" ;
                // we tried to cast stu_4 (was Student which created from UnderGrad) as CP , but original was Student
                // so stu_5 doesn't have CPIndiv
         */

        // Topic 3 :
    }
}
