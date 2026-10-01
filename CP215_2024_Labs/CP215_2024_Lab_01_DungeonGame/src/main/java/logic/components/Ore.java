package logic.components;

public class Ore {
    // fields
    private String name ;
    private int cost ;

    // constructors
    public Ore(String name , int cost) {
        setName(name) ;
        setCost(cost) ;
    }
    // Getter - Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost < 1) this.cost = 1 ;
        else this.cost = cost ;
    }
    // Another methods
    public boolean equals(Object obj) {
        // check null and Ore class
        if (obj.getClass() == null) return false ;
        if (obj.getClass() != Ore.class) return false;

        // below = Ore class
        return ( (this.cost == ((Ore) obj).getCost()) && (this.name == ((Ore) obj).getName()) ) ;
    }
}
