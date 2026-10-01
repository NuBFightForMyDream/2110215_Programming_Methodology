package game.piece;

import game.board.Board;
import game.position.Position;
import game.util.Movement;

import java.util.Set;

public abstract class Piece {
    // attributes
    protected boolean white ;
    protected boolean moved ;
    protected Position position ;
    protected Board board ;

    // constructors
    public Piece(boolean white , Position position , Board board)  {
        setWhite(white);
        setPosition(position);
        setBoard(board);
        // Then, call “board.placePiece(Piece, Position)” to place the piece on the board.
        board.placePiece(this , position) ;
    }

    // getter - setter
    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public boolean isMoved() {
        return moved;
    }

    public void setMoved(boolean moved) {
        this.moved = moved;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    // methods
    public Set<Position> getLegalMove() {
    /*
        method to return a set of legal moves for this piece.
            Note: Set is used to prevent duplication of Positions.
    This method returns a different set, depending on the actual type of piece that calls this method.
    However, this method can be implemented here because we make use of polymorphism in class Movement.
    To implement this method:
        • Create a Movement object, with the same position and board as this.
        • Call getMovePositions(this) on the Movement object. This method updates the Movement object’s possible move positions.
        • Return the result from calling getMoves() on the Movement object.
     */
        // define Movement
        Movement newObjMovement = new Movement(this.position , this.board) ;
        newObjMovement.getMovePositions(this);
        return newObjMovement.getMoves() ;
    }

    public abstract Object deepCopy() ;
    /*
    Create a deep copy of the piece and return it. This method
    returns a different object depending on the actual object that it copies.
    The method is too generic to be implemented here. But we need all Pieces to have this method.
     */

    public String toString() {
        // return “classname” + (“position”)
        // Hint: you can get the subclass name by using method “getClass().getSimpleName()”
        return this.getClass().getSimpleName() + "(" + this.getPosition() + ")" ;
    }

    public void moveHandle(Position to) {
        // Move the piece to a given position.
        // This method calls hadMoved() to update the moved status and then sets the field position to the given position.
        hadMoved() ;
        setPosition(to);
    }

    public boolean hadMoved() {
        // This method updates the moved field to true.
        setMoved(true);
        return true ;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piece newPiece = (Piece) o;
        // check if two pieces equals
        return this.white == newPiece.white &&
                this.moved == newPiece.moved &&
                this.position.equals(newPiece.position) &&
                this.board.equals(newPiece.board);
        }
}

