package logic.components;

public class Food {
    // fields
    private String name ;
    private int price ;
    private int energy ;

    // constructors
    public Food(String name , int price , int energy) {
        // initiate value first
        setName(name) ;
        setPrice(price) ;
        setEnergy(energy) ;
    }

    // Getter - setter methods

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
        else this.price = price;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (energy < 1) this.energy = 1 ;
        else this.energy = energy ;
    }
    // another methods
    public boolean equals(Food o) {
        // check if same name , price and energy
        if ( (this.getName() == o.getName()) && (this.getEnergy() == o.getEnergy()) && (this.getPrice() == o.getPrice()) ) {
            return true ;
        }
        else return false ;
    }
}
