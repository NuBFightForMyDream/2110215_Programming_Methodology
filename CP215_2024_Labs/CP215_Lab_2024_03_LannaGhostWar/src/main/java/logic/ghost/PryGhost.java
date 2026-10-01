package logic.ghost;

import logic.game.GameController;
import utils.Config;

public class PryGhost extends LowGhost{
	// attributes
	private int power;
	private int ppt; // part per trillion
	//TODO implements here

	// constructors
	public PryGhost() {
		setPower(Config.PryGhostPower);
		setPpt(0);
	}
	public PryGhost(int power) {
		setPower(power);
		setPpt(0);
	}
	public PryGhost(int power , int ppt) {
		setPower(power);
		setPpt(ppt);
	}

	// Getter - setter
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getPpt() {
		return ppt;
	}

	public void setPpt(int ppt) {
		this.ppt = ppt;
	}

	// methods
	public String toString() {
		return "PryGhost [HP: " + this.getHp() + " , " + "Power: " + this.getPower() + " , " + "PPT: " + this.getPpt() + " ]";
	}
	@Override
	public void attack() {
		// Decrease player’s hp by ghost’s power * ghost’s speed.
		int currentHp = GameController.getInstance().getHp() - (this.getPower() - this.getPpt());
		if (currentHp < 0) currentHp = 0 ;
		// set health as currentHealth
		GameController.getInstance().setHp( currentHp );
	}
}
