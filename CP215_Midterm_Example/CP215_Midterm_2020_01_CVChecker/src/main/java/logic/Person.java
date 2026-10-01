package logic;

public class Person {
    // attributes
    private String name ;
    private int ID ;

    // constructors
    public Person(String name , int ID) {
        setName(name); setID(ID) ;
    }

    // getter - setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if (ID < 1) this.ID = 1 ;
        else this.ID = ID ;
    }
}
