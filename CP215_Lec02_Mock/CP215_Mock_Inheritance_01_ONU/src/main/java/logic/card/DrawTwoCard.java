package logic.card;
import logic.game.CardColor;
import logic.game.CardSymbol;
import logic.game.GameLogic;

public class DrawTwoCard extends BaseCard {
    // constructors
    public DrawTwoCard(CardColor color) {
        super(color);
        setSymbol(CardSymbol.DRAW);
    }

    // methods
    @Override
    public void play() {
        // set top card
        GameLogic.getInstance().setTopCard(this) ;
        // draw 2 cards
        GameLogic.getInstance().draw(2) ; // draw 2 cards

    }
    @Override
    public boolean ruleCheck() {
        // check if top of discard pile has same color as this card
        BaseCard topCard = GameLogic.getInstance().getTopCard() ;

        if ( topCard.getColor().equals(this.getColor()) ) return true ;
        else return false ;
    }
}
