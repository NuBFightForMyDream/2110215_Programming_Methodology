package monkey;

public class BaseMonkey {
    // attributes
    private int maxHp ;
    private int hp ;
    private int atk ;
    private int def ;

    // constructors
    public BaseMonkey() {
        setMaxHp(30); setHp(maxHp);
        setAtk(20);
        setDef(5);
    }
    public BaseMonkey(int maxHp , int atk , int def) {
        setMaxHp(maxHp); setHp(maxHp);
        setAtk(atk);
        setDef(def);
    }

    // methods
    public void attack(BaseMonkey m) {
        /*
            This monkey attacks the given monkey, then
            the enemy would be dealt damage equal to
            this monkey’s atk power subtracted by
            enemy’s def . The damage dealt is the HP
            change. The damage value cannot be below 0.
         */
        int damageDealt = this.getAtk() - m.getDef() ;
        if (damageDealt < 0) damageDealt = 0 ;

        m.setHp( m.getHp() - damageDealt ); // enemy deal dmg to given monkey
    }

    public String getType() {
        return this.getClass().getSimpleName() ;
    }

    public String toString() {
        // return String in this form : <Monkey’s Type> hp=<hp>, atk=<atk>, def=<def>
        return this.getType() + " hp=" + this.getHp() + ", atk=" + this.getAtk() + ", def=" + this.getDef() ;
    }

    // Getter - setter
    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        if (maxHp < 0) this.maxHp = 0;
        else this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) this.hp = 0 ;
        else this.hp = hp ;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        if (atk < 0) this.atk = 0 ;
        else this.atk = atk ;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        if (def < 0) this.def = 0 ;
        else this.def = def ;
    }
}
