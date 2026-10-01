package Lecture3_215_AbstractClass.Example02_HashCodeWIthEmployee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeFilledTest {
    public static void main(String[] args) {
    	EmployeeFilled e1 = new EmployeeFilled();
        EmployeeFilled e2 = new EmployeeFilled();
        EmployeeFilled e3 = new EmployeeFilled();
 
        e1.setId(100);
        e2.setId(100);
        e3.setId(200);
 
        System.out.println(e1.equals(e2)); // true
        
        Set<EmployeeFilled> employees = new HashSet<EmployeeFilled>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println(employees);  //Prints two objects
    }
}
