package logic.card;

import logic.player.Player;

import javax.smartcardio.Card;

public class MageCard extends BaseCard {
    // fields
    private Element mageType ;

    // constructor
    public MageCard(String name , int power , int health , Element mageType) {
        super(name , power , health) ;
        setMageType(mageType);
    }

    // getter - setter
    public Element getMageType() {
        return mageType;
    }

    public void setMageType(Element mageType) {
        this.mageType = mageType;
    }

    // methods
    @Override
    public void play(Player player) {
        // Increase this card’s attack power by number of orb card
        // with the same element on player’s field.

        // loop then count for same element
        int countCardSameElement = 0 ;
        for (BaseCard eachBaseCard : player.getField()) { // get field from player the get each card
            if ( (eachBaseCard instanceof OrbCard) &&
                    ((OrbCard) eachBaseCard).getOrbType() == this.mageType ) countCardSameElement++ ;
            // cast BaseCard to OrbCard then get orb type with getter
        }

        // add value with counted value
        this.setPower( this.getPower() + countCardSameElement );
    }
    @Override
    public boolean canPlay(Player player) {
        // Return true if player have orb card with the same
        // element on player’s field. Otherwise, return false.

        // loop then count for same element
        for (BaseCard eachBaseCard : player.getField()) { // get field from player the get each card
            if ( (eachBaseCard instanceof OrbCard) &&
                    ((OrbCard) eachBaseCard).getOrbType() == this.mageType ) return true ;
            // cast BaseCard to OrbCard then get orb type with getter
        }
        return false ; // if not found
    }
}
