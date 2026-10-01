package logic.utility;

import logic.card.BaseCard;
import logic.game.GameLogic;

import java.util.ArrayList;

public class GameLogicUtility {
    public static boolean drawRule() {
        // This method check all cards from ArrayList<BaseCard> hand from GameLogic as follows
        //• Return false, if there is any legal card to play in hand.
        //• Return true, if there is no legal card in hand.
        // You can get the hand of the player by using GameLogic.getInstance().getHand().
        ArrayList<BaseCard> cardsInHand = GameLogic.getInstance().getHand();
        for (BaseCard eachCardInHand : cardsInHand) {
            if (eachCardInHand.ruleCheck() == true) { // if found card legal to play , return false
                return false;
            }
        }
        return true; // if none of legal card in hand
    }
}
