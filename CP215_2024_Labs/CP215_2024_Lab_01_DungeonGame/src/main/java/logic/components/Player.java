package logic.components;

import exception.BadStatusException;

import java.util.ArrayList;

public class Player {
    // attributes
    private String name ;
    private Status status ;
    private int energy ;
    private int money ;
    private ArrayList<Food> foods ;
    private ArrayList<Potion> potions ;
    private ArrayList<Ore> ores ;

    // 2 constructors
    public Player(String name , Status status) {
        // try-catch exception on Hp
        if (status.getHp() < 0) {
            try { status.setHp(1); }
            catch (BadStatusException e) {}
        }
        // set another value
        setEnergy(10); setMoney(100);
        setFoods( new ArrayList<Food>() );
        setPotions( new ArrayList<Potion>() );
        setOres( new ArrayList<Ore>() );

    }
    public Player(String name , Status status , int energy , int money) {
        // try-catch exception on Hp
        if (status.getHp() < 0) {
            try { status.setHp(1); }
            catch (BadStatusException e) {}
        }
        // set another value
        setEnergy(energy); setMoney(money);
        setFoods( new ArrayList<Food>() );
        setPotions( new ArrayList<Potion>() );
        setOres( new ArrayList<Ore>() );
    }

    // getter - setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
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

    public ArrayList<Ore> getOres() {
        return ores;
    }

    public void setOres(ArrayList<Ore> ores) {
        this.ores = ores;
    }

    // another methods
    public boolean buyOre(Ore ore) {
        if (this.money >= ore.getCost()) {
            // decrease money by ore's cost
            setMoney( getMoney() - ore.getCost() );
            // add ore to ores
            ores.add(ore);
            // return True
            return true ;
        }
        else return false ;
    }
    public void drinkPotion(int index) {
        // Increase the player’s status equals to potion’s increasingStatus and remove potion from potions.
        // Note : index is a position of the potion to be drunk from potions ArrayList. If index indicates
        // position outside the ArrayList, your code must do nothing.

    }
}
