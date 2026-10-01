package fighters.derived;

import fighters.base.Attackable;
import fighters.base.Guardable;
import fighters.base.Unit;
import logic.BattleUtils;

public class Guildmaster extends Unit implements Attackable , Guardable {
    // This class is a unit that can do both melee attacks and can raise a guard (but
    // never does so), and is controlled by a simple AI.

    // constructors
    public Guildmaster(int maxHealth , int speed , int power , int defense , int location) {
        super("Guildmaster" , "G" , maxHealth , speed , location , false) ;
        this.setRange(1);
        this.setPower(power);
        this.setDefense(defense);
    }

    // methods
    public boolean move(int spaces) {
        return super.move(-1) ;
    }

    @Override
    public int attack(Unit e) {
        // check if same team or location out of range
        if (this.sameTeam(e) == true || BattleUtils.validRange(this.getRange() , this.getLocation() , e.getLocation()) == false) {
            return -1 ;
        }
        else return (BattleUtils.calculateDamage(this.power , e)) ;
    }

    @Override
    public void guard() {
        // do nothing from Gay-I
    }
}
