package logic.components;

public class Potion {
    // fields
    private String name ;
    private int price ;
    private Status increasingStatus ;

    // constructors
    public Potion(String name , int price , Status increasingStatus) {
        setName(name);
        setPrice(price);
        setIncreasingStatus(increasingStatus);
    }

    // getter - setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 1) this.price = 1 ;
        else this.price = price ;
    }

    public Status getIncreasingStatus() {
        return increasingStatus;
    }

    public void setIncreasingStatus(Status increasingStatus) {
        this.increasingStatus = increasingStatus;
    }

    // another methods
    public boolean equals(Object o) {
        if (o.getClass() == null) return false ;
        if (o.getClass() == Potion.class) return false ;

        return (this.name == ((Potion)o).getName() ) &&
                ( this.price == ((Potion)o).getPrice() ) &&
                ( this.increasingStatus == ((Potion)o).getIncreasingStatus() ) ;
    }
}
