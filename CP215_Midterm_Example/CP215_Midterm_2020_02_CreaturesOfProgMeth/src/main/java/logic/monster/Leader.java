package logic.monster;

import logic.attack.Attack;

public class Leader extends Monster {
    // attributes
    private int maxChargeTurns ;
    private int currentChargeTurns ;
    private boolean isGuard ;

    // constructors
    public Leader(String name , int hp , int def, int sp_def , Attack attack , int chargeTurns) {
        // set fields with respective values
        // 1. Set maxChargeTurns to chargeTurns & currentChargeTurns to 0
        // 2. Set maxChargeTurns before currentChargeTurns
        // 3. Use setter instead of set manually
        super(name , hp , def , sp_def , attack) ;
        setMaxChargeTurns(chargeTurns);
        setCurrentChargeTurns(0);
    }

    // getter - setter
    public int getMaxChargeTurns() {
        return maxChargeTurns;
    }

    public void setMaxChargeTurns(int maxChargeTurns) {
        this.maxChargeTurns = maxChargeTurns;
    }

    public int getCurrentChargeTurns() {
        return currentChargeTurns;
    }

    public void setCurrentChargeTurns(int currentChargeTurns) {
        if (currentChargeTurns < 0) this.currentChargeTurns = 0 ;
        else if (currentChargeTurns > this.maxChargeTurns) this.currentChargeTurns = maxChargeTurns ;
        else this.currentChargeTurns = currentChargeTurns ;
    }

    public boolean isGuard() {
        return this.isGuard ;
    }

    public void setGuard(boolean guard) {
        isGuard = guard;
    }

    // methods
    public int takeDamage(Attack attack) {
        int damageToMonster ;

        // check if isGuard is active
        if (this.isGuard == true) return 0 ;

        else {
            // check if attack comes from leader monster or not
            if ( attack.isLeader() == true ) {
                // reduce the HP with the damage amount calculated from Attack.
                damageToMonster = attack.calculateDamage(this);
                setHp( getHp() - damageToMonster );
            }
            else {
                // reduce only reduce the HP with the half of the damage with formula : Math.ceil(damage * 0.5)
                damageToMonster = (int) Math.ceil( attack.calculateDamage(this) * 0.5); // cast double to integer
                setHp( getHp() - damageToMonster );
            }
        }
        // check final hp of boss (if less than 0 , set isDead as true)
        if (this.hp <= 0) setDead(true); ;

        // return amount of damage
        return damageToMonster ;
    }

    public boolean isReady() {
        if (this.currentChargeTurns >= this.maxChargeTurns) return true ;
        else return false ;
    }
}
