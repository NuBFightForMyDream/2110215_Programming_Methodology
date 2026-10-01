package logic.card;
import logic.game.CardColor ;
import logic.game.CardSymbol;

public class BaseCard {
    // fields
    private CardColor color ;
    private CardSymbol symbol ;

    // constructors
    public BaseCard(CardColor color) {
        this.color = color ;
    }

    // getter - setter methods
    public CardColor getColor() {
        return color;
    }

    public void setColor(CardColor color) {
        this.color = color;
    }

    public CardSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(CardSymbol symbol) {
        this.symbol = symbol;
    }

    // amother methods
    public void play() {
        // child class will have themselves method (override)
        // do nothing
    }
    public boolean ruleCheck() {
        // child class will have themselves method (override)
        return true ;

    }
}
