package logic;

public class Fighter extends Piece {
    // attributes
    private boolean promoted ;
    private PositionList promotedMovePositions ;

    // constructors
    public Fighter(int initialPositionX , int initialPositionY , boolean reverse , String name) {
        // set info with super()
        super(initialPositionX , initialPositionY , reverse , name) ;

    }
}
