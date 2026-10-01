package logic.attack;

import logic.monster.Monster;

public class SPAttack extends Attack {

    // constructor
    public SPAttack(int power, String name, boolean isLeader) {
        super(power, name, isLeader);
    }


    // additional methods
    public int calculateDamage(Monster target) {
        // Calculate the damage by subtracting the power with the target’s Defense value.
        int damage = this.power - target.getSpecialDefense() ;
        if (damage < 0) return 0 ;
        else return damage ;
    }
}
