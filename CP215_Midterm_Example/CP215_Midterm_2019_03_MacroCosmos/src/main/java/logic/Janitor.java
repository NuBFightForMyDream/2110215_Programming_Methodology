package logic;

public class Janitor extends Employee {
    // fields
    private String area ;

    // constructors
    public Janitor(String name , int id , String area) {
        super(name , id , 15);
        setArea(area);
    }

    // getter - setter
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    // methods
    @Override
    public int computeSalary() {
        return BackEndAPI.calculateMonthlySalary(this.baseSalary , this.bonus , 30) ;
    }

    @Override
    public String getDescription() {
        return BackEndAPI.getJanitorDescription(this.id , this.name ,this.area , this.bonus);
    }
}
