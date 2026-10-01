package monkey;

import logic.game.GameSystem;

public class MommyMonkey extends BaseMonkey {
    // attributes
        // no need
    // constructors
    public MommyMonkey(int maxHp , int atk , int def) {
        super(maxHp, atk, def);
    }
    // methods
    @Override
    public void attack(BaseMonkey m) {
        // Do nothing
    }

    public void birth() {
        /*
        Initialize BaseMonkey by calling default
        constructor then add it to the monkey
        container in the game system.
         */

        // create new object of newBorn
        BaseMonkey newbornMonkey = new BaseMonkey() ; // call no-detail constructor
        // add to contanier (must call getInstance)
        GameSystem.getInstance().getMonkeyContainer().add( newbornMonkey ) ;
    }

}
