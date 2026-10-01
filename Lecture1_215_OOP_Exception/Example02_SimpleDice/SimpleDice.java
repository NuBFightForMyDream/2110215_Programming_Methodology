package Lecture1_215_OOP_Exception.Example02_SimpleDice;

public class SimpleDice {
    // define attributes
    static int countDice = 0 ; // can be seen in all class
    final static int MAX_POINT_ON_DICE = 6 ; // static = belong to "Class" -> every object share this varibles
    private int faceValue ; // need to call getter-setter method instead

    // define constructors
    public SimpleDice() { // default constructor
        this.faceValue = 1 ;
    }
    public SimpleDice(int faceVal) {
        this.faceValue = faceVal ;
    }

    // getter - setter methods

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        if (faceValue <= 0) this.faceValue = 1 ;
        else if (faceValue > MAX_POINT_ON_DICE) this.faceValue = MAX_POINT_ON_DICE ;
        else this.faceValue = faceValue;
    }

    // define methods
    public int rollDice() {
        // random dice value
        int rolledFaceDice = (int) (Math.random() * MAX_POINT_ON_DICE) + 1; // face start at 1
        // change dice face
        // this.faceValue = rolledFaceDice ;
        // return value back
        return faceValue;
    }

    // toString() method -> can't print object directly
    public String toString() {
        return "The Face of Dice is : " + this.getFaceValue() ;
    }

    public boolean equals(Object o) {
        // define anotherDice
        SimpleDice anotherDice = (SimpleDice) o ; // more detail in "Inheritance"
            // casting o to same Class
        if (this.faceValue == anotherDice.faceValue) return true ;
        else return false ;
    }
}

