package logic.ghost;

import logic.game.GameController;
import utils.Config;

public class MaBongGhost extends LowGhost{
	//TODO implements here

    // fields
    private int power ;
    private int speed ;

    // constructors
    public MaBongGhost() {
        setPower( Config.MaBongGhostPower );
        setSpeed( Config.MaBongGhostSpeed );
    }
    public MaBongGhost(int power) {
        setPower( power );
        setSpeed( Config.MaBongGhostSpeed );
    }
    public MaBongGhost(int power , int speed) {
        setPower( power );
        setSpeed( speed );
    }

    // Getter - setter
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // methods
    public String toString() {
        return "MaBongGhost [HP: " + this.getHp() + " , " + "Power: " + this.getPower() + " , " + "Speed: " + this.getSpeed() + " ]";
    }
    @Override
    public void attack() {
        // Decrease player’s hp by ghost’s power * ghost’s speed.
        int currentHp = GameController.getInstance().getHp() - (this.getPower() * this.getSpeed());
        if (currentHp < 0) currentHp = 0 ;
        // set health as currentHealth
        GameController.getInstance().setHp( currentHp );
    }
}
