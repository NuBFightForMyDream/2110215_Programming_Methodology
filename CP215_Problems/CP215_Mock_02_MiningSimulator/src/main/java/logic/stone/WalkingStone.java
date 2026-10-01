package logic.stone;

import logic.game.GameManager;

public class WalkingStone extends Stone {
    // constructors
    public WalkingStone(int posX , int posY) {
        super(posX , posY) ;
    }

    // methods
    public void dig(int digPower) {
        // Dig this stone. Moreover, if the dig power is more than 1, then add
        // score 1 to the game manager
        GameManager.digStone(this) ;
        if (digPower > 1) {
            GameManager.
    }


}
