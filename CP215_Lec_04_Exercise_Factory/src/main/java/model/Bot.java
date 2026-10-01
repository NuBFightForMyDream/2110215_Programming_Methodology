package model;

public abstract class Bot implements Worker {
    // fields
    public static int material = 20 ;
    public static int finishedProduct = 0 ;

    // constructors
    @Override
    public abstract void work() ;
}
