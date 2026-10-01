package logic.ghost;

import logic.game.GameController;
import utils.Config;

public class GaGhost extends LowGhost{
	//TODO implements here

	// fields
    private int energy ;

    // constructors
    public GaGhost() {
        // set energy (normal , not by super)
        setEnergy(Config.GaGhostEnergy);
    }
    public GaGhost(int energy) {
        setEnergy(energy);
    }

    // getter - setter
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // method
    @Override
    public void attack() {
        // Decrease player’s hp by ghost’s energy.
        // Hint : You can set player’s hp by using setter in GameController.getInstance()
        int currentPlayerHp = GameController.getInstance().getHp() - this.energy ;
        if (currentPlayerHp < 0) currentPlayerHp = 0 ;

        // set value of hp
        GameController.getInstance().setHp( currentPlayerHp );
    }
    public String toString() {
        // Returns "GaGhost [HP: ${hp} , Energy: ${energy} ]”
        return "GaGhost [HP: " + this.getHp() + " , " + "Energy: " + this.getEnergy() + " ]" ;
    }
}
