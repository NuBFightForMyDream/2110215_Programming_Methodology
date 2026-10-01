package monkey;

import logic.game.GameSystem;

import java.util.ArrayList;

public class Ape extends BaseMonkey {
    // attributes
        // no need
    // constructors
    public Ape(int maxHp , int atk , int def) {
        super(maxHp, atk, def);
    }
    // methods
    public void attack(BaseMonkey m) {
        super.attack(m);
    }

    public void attackAOE() {
        // Attack all monkeys in game
        ArrayList<BaseMonkey> allMonkeys = GameSystem.getInstance().getMonkeyContainer() ;
        for (BaseMonkey eachMonkey : allMonkeys) {
            super.attack(eachMonkey) ;
        }
    }
}
