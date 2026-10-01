package logic.stone;

import utils.GameUtilities;

import java.util.ArrayList;

public class Dynamite extends Stone {
    // fields
        // no need

    // constructors
    public Dynamite(int posX , int posY) {
        super(posX, posY);
    }

    // getter - setter
    public void destroy() {
        /*
        Destroy this stone.
        After that, destroy all the stones around (posX, posY).
        Hint: can get adjacency stones by calling
        GameUtilities.getAdjacentStones(posX, posY)
         */
        GameUtilities.removeStone(this);

        // get arraylist of stone around then renove each block
        ArrayList<Stone> stoneAround = GameUtilities.getAdjacentStones(this.posX , this.posY) ;
        for (Stone eachStone : stoneAround) {
            GameUtilities.removeStone(eachStone);
        }
    }

    // methods


}
