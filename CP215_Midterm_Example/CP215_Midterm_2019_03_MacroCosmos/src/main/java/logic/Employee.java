package logic;

public abstract class Employee {
    // fields
    protected String name ;
    protected int id ;
    protected int baseSalary ;
    protected int bonus ;

    // constructor
    public Employee(String name , int id , int baseSalary) {
        setName(name);
        setId(id);
        setBaseSalary(baseSalary);
    }

    // methods
    public abstract int computeSalary() ;
    public abstract String getDescription() ;

    // getter - setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary < 0) this.baseSalary = 0 ;
        else this.baseSalary = baseSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        if (bonus < 0) this.bonus = 0 ;
        else this.bonus = bonus ;
    }
}
