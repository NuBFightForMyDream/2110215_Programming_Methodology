package logic;

public class Station {
    // attributes / fields
    private String name ; // The name of the station
    private int number ; // internal ID of the station

    // constructor
    public Station(String name , int number) {
        if (number <= 0) this.number = 0 ;
        else this.number = number ;
        this.name = name ;
    }

    // getter - setter method
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public void setName(String Name) {
        this.name = Name ;
    }
    public void setNumber(int number) {
        this.number = number ;
    }
}
