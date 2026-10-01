package game.piece;

import game.board.Board;
import game.position.Position;

public class Knight extends Piece {
    // constructors
    public Knight(boolean isWhite , Position pos , Board board) {
        super(isWhite , pos , board) ;
    }

    @Override
    public Object deepCopy() {
        /*
        Creates a new Knight object with the same color, position, and
        board. If this knight had been moved, the copy also updates the
        moved status. Return the new knight instance.
         */

        Knight newKnight = new Knight(this.isWhite() , this.position , this.board) ;
        // check if bishop moved
        if (this.hadMoved()) {
            // update move -> using setMove
            newKnight.setMoved(true);
        }
        return newKnight;
    }


}
