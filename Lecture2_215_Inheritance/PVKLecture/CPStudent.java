package Lecture2_215_Inheritance.PVKLecture;

public class CPStudent extends Student {
    // fields
    String CPIndivProject ;

    // constructor
    public CPStudent() {
        this.name = "CP" ; // class (child) can use attribute from superclass (parent)
    }

    // getter - setter method
    public String getCPIndivProject() {
        return CPIndivProject;
    }

    public void setCPIndivProject(String CPIndivProject) {
        this.CPIndivProject = CPIndivProject;
    }

    // another method
    @Override // same method with parent but inside is different
    public String toString() {
        return "CP Student name : " + this.getName() + " doing this indiv study project : " + this.getCPIndivProject() ;
    }
}
