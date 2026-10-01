package monkey;

public class UgabugagaMonkey extends BaseMonkey {
    // attributes
    private static final int DEBUFF = 1 ;
    private static final int HEAL = 10 ;

    // constructor
    public UgabugagaMonkey(int maxHp , int atk , int def) {
        super(maxHp, atk, def);
    }

    @Override
    public void attack(BaseMonkey m) {
        // Attack the given monkey just like BaseMonkey. Then decrease the attacked
        // monkey’s atk and def by DEBUFF.
        super.attack(m);
        m.setAtk( m.getAtk() - DEBUFF );
        m.setDef( m.getDef() - DEBUFF );
    }
    public void heal(BaseMonkey m) {
        // Heal the given monkey by HEAL value without exceeding the maximumHP.
        int newHealth = m.getHp() + HEAL ;
        if (newHealth >= m.getMaxHp()) newHealth = m.getMaxHp() ;
        m.setHp(newHealth); // given new health to new monkey
    }
    public int getDebuff() {
        return DEBUFF ;
    }
    public int getHeal() {
        return HEAL ;
    }
}
