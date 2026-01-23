package Lecture1_215_OOP_Exception.Example01_TransportSimulation;

public class Car {
    // define attributes
    private int speed ;
    private int acceleration; // do encapsulation by making attributes "private"
    // bu tneed to do getter-setter methods

    // getter-setter methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) this.speed = 0 ;
        else this.speed = speed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        if (acceleration < 0) this.acceleration = 0 ;
        else this.acceleration = acceleration ;
    }
}
