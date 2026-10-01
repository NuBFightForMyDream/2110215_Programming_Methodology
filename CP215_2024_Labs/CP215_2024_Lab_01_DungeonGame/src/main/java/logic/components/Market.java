package logic.components;

import java.util.ArrayList;

public class Market {
    // fields
    String name ;
    ArrayList<Food> foods ;
    ArrayList<Potion> potions ;

    // constructors
    public Market(String name) {
        setName(name) ;
        // initialize new ArrayList
        this.foods = new ArrayList<Food>() ;
        this.potions = new ArrayList<Potion>() ;
    }

    // Getter - Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<Food> foods) {
        this.foods = foods;
    }

    public ArrayList<Potion> getPotions() {
        return potions;
    }

    public void setPotions(ArrayList<Potion> potions) {
        this.potions = potions;
    }
}
