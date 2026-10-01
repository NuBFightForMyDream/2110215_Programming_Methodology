package logic.card;

import logic.player.Player;

public class RobotCard extends BaseCard {
    // fields
    private int energyCost ;

    // constructors
    public RobotCard(String name , int power , int health , int energyCost) {
        super(name , power , health);
        setEnergyCost(energyCost);
    }


    // getter - setter
    public int getEnergyCost() {
        return energyCost;
    }
    public void setEnergyCost(int energyCost) {
        if (energyCost < 0) this.energyCost = 0 ;
        else this.energyCost = energyCost;
    }

    // methods
    @Override
    public void play(Player player) {
        // Subtract player energy by this card’s energy cost.
        // Player’s energy cannot be negative.
        player.setEnergy( player.getEnergy() - this.getEnergyCost() ) ;
    }
    @Override
    public boolean canPlay(Player player) {
        // Return true if player have enough energy to play this
        // card. Otherwise, return false.
        if ( player.getEnergy() >= this.getEnergyCost() ) return true ;
        else return false ;
    }
}
