package game.piece;

import game.board.Board;
import game.position.Position;

public class Bishop extends Piece {
    // no need more attributes

    // constructors
    public Bishop(boolean isWhite , Position pos , Board board) {
        super(isWhite , pos , board) ;
    }

    // methods
    @Override
    public Object deepCopy() {
        /* Creates a new Bishop object with the same color, position, and
            board. If this bishop had been moved, the copy also updates the
            moved status. Return the new Bishop instance.
         */
        Bishop newBishop = new Bishop(this.isWhite() , this.position , this.board) ;
        // check if bishop moved
        if (this.hadMoved()) {
            // update move -> using setMove
            newBishop.setMoved(true);
        }
        return newBishop ;
    }
}
