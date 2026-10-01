package logic.card;

import logic.player.Player;

public abstract class BaseCard {
    // attributes
    private String name ;
    private int power ;
    private int health ;

    // constructors
    public BaseCard(String name , int power , int health) {
        setName(name);
        setPower(power);
        setHealth(health);
    }

    // getter - setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power < 0) this.power = 0 ;
        else this.power = power ;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) this.health = 0 ;
        else this.health = health;
    }

    // methods
    public abstract void play(Player player) ;
        // This method is called when the card is played in the position for the player.
        // This method will perform action depending on each type of Cards.

    public abstract boolean canPlay(Player player) ;
        // This method returns true if the card can be played according to the rule
        // and returns false when the card is illegal to play.
        // The rules are different for each type of Cards. No need to check if the field is full.

    public int attack(BaseCard target) {
        /*
        This method is called when this card attacks target. It will
        decrease target’s health by it's power but not lower than 0. And return excess damage.
        If the attack does not deal excess damage, return 0.
        E.g., “Power 5 card” attack “Health 2 Card” will return 3
        */
        int damageDealt = this.getPower() - target.getHealth() ;

        if (this.getPower() <= target.getHealth()) {
            target.setHealth( target.getHealth() - this.getPower() );
            return 0 ; // excess damage
        }
        else {
            target.setHealth( 0 );
            return damageDealt ;
        }
    }
}
