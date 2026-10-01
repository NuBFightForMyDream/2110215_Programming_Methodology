package logic;

import java.util.ArrayList;

public class Database {
	// attributes
	private static ArrayList<Employee> employees;

	// constructors
	public Database() {
		employees = new ArrayList<Employee>();
	}

	// methods
	public Employee getEmployeeById(int id) {
		for(Employee e: employees) {
			if(e.getId()==id) {
				return e;
			}
		}
		return null;
	}
	
	public Employee getEmployeeByIndex(int index) {
		return employees.get(index);
	}
	
	public boolean addEmployee(Employee e) {
		if(getEmployeeById(e.getId())==null) {
		employees.add(e);
		return true;
		}
		return false;
	}
	
	
	public boolean removeEmployeeById(int id) {
		Employee e = getEmployeeById(id);
		if(e!=null) {
			employees.remove(e);
			return true;
		}
		return false;
	}
	
	public ArrayList<String> getAllEmployeeDescriptions() {
		// This method returns an ArrayList containing the description of all employees.
		// define new ArrayList of EmployeeDescription
		ArrayList<String> employeeDescription = new ArrayList<String>() ;
		for (Employee eachEmployee : employees) {
			employeeDescription.add( eachEmployee.getDescription() ) ;
		}
		return employeeDescription ;
	}
	
	public int calculateAllSalary() {
		int totalAllSalary = 0 ;
		for (int pos = 0 ; pos < employees.size() ; pos++) {
			totalAllSalary += employees.get(pos).computeSalary() ;
		}
		return totalAllSalary ;
	}
	
	public int getTotalEmployeeCount() {
		return employees.size();
	}
}
