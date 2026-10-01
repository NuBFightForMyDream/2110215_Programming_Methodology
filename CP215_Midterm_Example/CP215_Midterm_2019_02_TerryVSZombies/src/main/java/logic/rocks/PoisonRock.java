package logic.rocks;

import logic.zombies.Zombie;

public class PoisonRock extends NormalRock {
    // attributes
    private int damageOverTime ;

    // constructors
    public PoisonRock(int damage , int damageOverTime) {
        super(damage) ; // call super for set damage
        setDamageOverTime(damageOverTime);
    }

    // getter - setter
    public int getDamageOverTime() {
        return damageOverTime;
    }

    public void setDamageOverTime(int damageOverTime) {
        if (damageOverTime < 0) this.damageOverTime = 0 ;
        else this.damageOverTime = damageOverTime;
    }

    // methods
    public String toString() {
        return "Poison Rock (" + this.getDamage() + ", DoT = " + this.getDamageOverTime() + ")" ;
    }

    public int dealDamage(Zombie zombie) {
        // Adds this rock’s damageOverTime to the zombie’s decay,
        // then deal the damage and return the damage value like in NormalRock.
        // (Note: Do not use damageOverTime to reduce the zombie’s health here.)
        zombie.setDecay( zombie.getDecay() + damageOverTime );
        // calculate damage (but don't reduce health)
        int damageDealt = this.getDamage() - zombie.getDefense() ; // damageOverTime doesn't affect
        return damageDealt ;
    }
}
