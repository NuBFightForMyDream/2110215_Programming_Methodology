package logic.rocks;

import logic.zombies.Zombie;

public class NormalRock {
    // attributes
    protected int damage ;

    // constructors
    public NormalRock(int damage) {
        setDamage(damage);
    }

    // getter - setter methods
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage < 0) this.damage = 0 ;
        else this.damage = damage ;
    }

    // methods
    public int dealDamage(Zombie zombie) {
        // If the zombie’s defense is greater than or equal to the rock’s damage,
        // decrease 0 health from the given zombie.
        //  Otherwise, get the zombie’s defense, subtract it from this
        // rock’s damage, and decrease that much health from the given zombie.
        //  Finally, return the damage dealt after accounting for the zombie’s defense.
        int damageDealt ;
        if (zombie.getDefense() >= this.getDamage()) damageDealt = 0 ;
        else {
            damageDealt = this.getDamage() - zombie.getDefense() ;
            zombie.setHealth( zombie.getHealth() - damageDealt);
        }
        return damageDealt ;
    }

    public String toString() {
        return "Normal Rock (" + getDamage() + ")" ;
    }
}
