package monkey;

public class MuscleMonkey extends BaseMonkey {
    // attributes
    private final int POWER_UP = 4 ;

    // constructors
    public MuscleMonkey(int maxHp , int atk , int def) {
        super(maxHp, atk, def);
    }

    // methods
    public int getPowerUp() {
        return POWER_UP ;
    }

    @Override
    public void attack(BaseMonkey m) {
        // attack 2 times with superclass
        super.attack(m);
        super.attack(m);
    }
    public void buff() {
        // Increase monkey atk and def by POWER_UP
        this.setAtk( getAtk() + POWER_UP );
        this.setDef( getDef() + POWER_UP );
    }
}
