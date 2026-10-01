package logic.card;

import logic.game.CardColor;
import logic.game.CardSymbol;
import logic.game.GameLogic;

public class NumberCard extends BaseCard {
    // constructors
    public NumberCard(CardColor color , CardSymbol symbol) {
        // call parent constructor using super(... attribute is same as parent ... )
        super(color) ;
        setSymbol(symbol);
    }

    // methods

    @Override // Override method : same method but different action
    public void play() {
        // Use method setTopCard in class GameLogic to set this card to the top of the discard pile.
        GameLogic.getInstance().setTopCard(this) ;
    }
    @Override
    public boolean ruleCheck() {
        // return true if card has same color and same symbol
        BaseCard topCard = GameLogic.getInstance().getTopCard() ; // getTopCard return BaseCard

        if ( topCard.getSymbol().equals(this.getSymbol()) || topCard.getColor().equals(this.getColor()) ) return true ;
        else return false ;
    }
}
