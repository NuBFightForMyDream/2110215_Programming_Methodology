package logic;

public class OfficeWorker extends Employee {
    // fields
    private String department ;

    // constructor
    public OfficeWorker(String name , int id , String department) {
        super(name , id , 30) ;
        setDepartment(department);
    }

    // methods
    @Override
    public int computeSalary() {
        // work 30$ per hour , 20 days per month
        return BackEndAPI.calculateMonthlySalary(this.baseSalary , this.bonus , 20) ;
    }

    @Override
    public String getDescription() {
        return BackEndAPI.getOfficeWorkerDescription(this.id , this.name , this.department , this.bonus);
    }

    // getter - setter
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}
