package Lecture00_215_OOP;

public class Employee_06 {
	
	// Main Function 
	public static void main(String[] args) {
		// Test Methods
		Employee_06 employee_01 = new Employee_06("Chatrphol" , 9000 , 1234) ;
		Employee_06 employee_02 = new Employee_06("Jakepaul" ,  8500 , 5678) ;
		
		// print value
		System.out.println(employee_01) ;
		System.out.println(employee_02) ;
		
		// Change some salary 
		employee_01.probateEmployee(500) ;  // 8500
		employee_02.promoteEmployee(500) ;  // 9000
		
		// CHeck if employee_01 has more salary than employee_02 
		System.out.println("Is Employee 01 has higher salary then Employee 02 : " + employee_01.hasHigherSalary(employee_02)) ; 
		
	}
	
	// ---- Background Zone ----
	// define attributes
	public static String companyName = "ISE Chula" ; // static = all objects share this value together
	private int salary ; 
	public int employeeID ;
	public String employeeName ; 
	
	// create constructor
	public Employee_06() { // no-argument constructure
		// set name , ID , salary to "Nameless , 1 , 15000" 
		this("Nameless" , 1 , 15000) ; // call detailed constructor
	}
	
	public Employee_06(String employeeName , int salary , int employeeID) { // detailed const.
		// set value 
		this.employeeName = employeeName ; 
		this.employeeID = employeeID ; 
		this.salary = salary ;
	}
	
	public Employee_06(Employee_06 employeeInfoConstructor) { // copy constructor 
		// pass value by calling getter-setter method 
		this( employeeInfoConstructor.employeeName , 
				employeeInfoConstructor.getSalary() , 
				employeeInfoConstructor.employeeID) ; 
	}
	
	// create getter-setter method
	public int getSalary(){ 
		return salary ; // return int
	}
	public boolean setSalary(int salary) { // return boolean if operation success 
		if (salary > 0) { // can use this.getSalary() (calling method) 
			this.salary = salary ; 
			return true ; // operation success
		}
		else {
			return false ; // operation failed
		}
	}
	
	// another method 
	public String toString() { // no need to return salary (private attribute)
		return "Name : " + this.employeeName + " , ID : " + this.employeeID + " , Company : " + companyName ; 
	}
	
	public boolean hasHigherSalary( Employee_06 anotherEmployee ) {
		return (this.getSalary() > anotherEmployee.getSalary()) ; 
	}
	
	public void promoteEmployee( int promoteSalary ) {
		this.setSalary(this.getSalary() + promoteSalary) ; 
	}
	
	public void probateEmployee( int probateSalary ) {
		this.setSalary(this.getSalary() - probateSalary) ; 
	}
}
