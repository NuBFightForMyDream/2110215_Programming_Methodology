package fighters.derived;

import fighters.base.Guardable;
import fighters.base.Unit;

public class Tank extends Unit implements Guardable {
    // no fields

    // constructors
    public Tank(int maxHealth , int speed , int defense , int location) {
        super("Tank" , "t" , maxHealth , speed , location , true) ;
        this.setDefense(defense);
    }

    @Override
    public void guard() {
        setOnGuard(true);
    }

    public boolean move(int spaces) {
        /*
        When the tank moves, he is no longer on guard. Set onGuard
        as false, then call the move function from Unit.
         */
        setOnGuard(false);
        return super.move(spaces) ; // call superclass (Unit) to move
    }

}
