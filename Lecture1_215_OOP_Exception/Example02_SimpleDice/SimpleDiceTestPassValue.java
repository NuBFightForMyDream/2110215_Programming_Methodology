package Lecture1_215_OOP_Exception.Example02_SimpleDice;

public class SimpleDiceTestPassValue {
    // main function
    public static void main(String[] args) {
        // create object

        int a = 10 ;
        System.out.println("Old A is : " + a) ;
        setDiceFaceToFivePassByValue(5);
        System.out.println("Modified (passByValue) A is : " + a) ; // a didn't change bcz pass from value

        SimpleDice newDice = new SimpleDice(1);
        System.out.println("Score in Dice A : " + newDice.getFaceValue());
        setDiceFaceToFivePassByReference(newDice);
        System.out.println("Modified (passByReference) A is : " + newDice.getFaceValue()) ; // a didn't change bcz pass from value
    }

    // create method by passign value : passByValue , passByReference
    public static void setDiceFaceToFivePassByValue(int a) {
        a = 5 ; // didnt change value
        System.out.println("A in passByValue Method is : " + a) ;
    }
    public static void setDiceFaceToFivePassByReference(SimpleDice dice) {
        dice.setFaceValue(5); // change value from indexing address
        System.out.println("A in passByReference Method is : " + dice.getFaceValue()) ;
    }
}

