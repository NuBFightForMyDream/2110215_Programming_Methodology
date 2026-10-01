package logic.components;

import exception.BadStatusException;

public class Monster {
    // fields
    String name ;
    Status status ;
    Food food ;
    Potion potion ;

    // constructor -> skipped
    public Monster(String name , Status status) {
        // try catch exception on Hp
        if (status.getHp() < 1) {
            try { status.setHp(1); } // deal with exception inside constructor only
            catch (BadStatusException e) {}
        }
        ;

        // set status with setter methods
        this.setName(name); this.setStatus(status);
        this.setFood(null); this.setPotion(null);
    }

    // Getter-Setter methods
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

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Potion getPotion() {
        return potion;
    }

    public void setPotion(Potion potion) {
        this.potion = potion;
    }

    // another methods
    public void attack(Player player) {
        int damage = this.a
    }
    public void magicAttack(Player player) {

    }
}
