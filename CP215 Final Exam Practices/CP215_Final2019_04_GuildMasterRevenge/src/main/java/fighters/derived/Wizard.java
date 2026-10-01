package fighters.derived;

import fighters.base.Attackable;
import fighters.base.Unit;
import logic.BattleUtils ;

public class Wizard extends Unit implements Attackable {
    // constructors
    public Wizard(int maxHealth , int speed , int power , int location) {
        super("Wizard" , "w" , maxHealth , speed , location , true) ;
        this.setRange(2);
        this.setPower(power);
    }
    // methods
    @Override
    public int attack(Unit e) {
        // case 1 : same team or location out of range
        if ((this.sameTeam(e) == true) || (BattleUtils.validRange(this.getRange() , this.getLocation() , e.getLocation()) != true)) {
            return -1 ;
        }
        else return this.getPower() ;
    }


}
