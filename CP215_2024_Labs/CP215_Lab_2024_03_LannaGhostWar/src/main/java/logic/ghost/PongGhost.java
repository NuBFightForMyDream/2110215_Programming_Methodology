package logic.ghost;

import logic.game.GameController;
import utils.Config;

public class PongGhost extends HighGhost{
	//TODO implements here

    // attributes
    private int power ;

    // constructors
    public PongGhost() {
        setPower(Config.PongGhostPower);
    }
    public PongGhost(int power) {
        setPower(power);
    }

    // Getter - setter
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    // methods
    public int getLevel() {
        return Config.PongGhostLevel ;
    }
    public String toString() {
        return "PongGhost [HP: " + this.getHp() + " , " + "Power: " + this.getPower() + " ]" ;
    }
    @Override
    public void attack() {
        /*
        Decrease player’s hp by ghost’s power
        Hint: You can set player’s hp by using setter in GameController.getInstance() .
        */
    }
    @Override
    public void damage() {
        /*
        ● For each ghost in ghosts list, if that ghost is
        LowGhost, then increase ghost’s hp by
        PongGhost’s power.
        > Hint:
            1. You can get Game’s ghosts list by using getter in GameController.getInstance().getGhosts()
            2. You can increase ghost’s hp by using decreaseHp(int amount). (use negative amount)
        */

    }
}
