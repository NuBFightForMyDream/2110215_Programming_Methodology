package Lecture0_215_IntroOOP.ExerciseAndPastPapers;

public class ExampleLabTutorial_AirCraft {
    // define attributes
    private int currentSpeed ; // private = data are in this class only (can still be accessed)
    private int maxSpeed ;

    // constructors
    public ExampleLabTutorial_AirCraft() { // no-arg const.
        this.currentSpeed = 0 ; this.maxSpeed = 100 ;
    }
    public ExampleLabTutorial_AirCraft( int curSpd , int maxSpd ) {
        // need to call getter-setter methods for strange val
        this.setCurrentSpeed( curSpd );
        this.setMaxSpeed( maxSpd );

    }

    // getter - setter method
    public int getCurrentSpeed() {
        return currentSpeed ;
    }
    public int getMaxSpeed() {
        return maxSpeed ;
    }
    public void setCurrentSpeed(int currSpd) {
        if (currSpd < 0) currentSpeed = 0 ;
        else if (currSpd >= maxSpeed) currentSpeed = maxSpeed ;
        else currentSpeed = currSpd ;
    }
    public void setMaxSpeed(int maxSpd) {
        if (maxSpd < 50) maxSpeed = 50 ;
        else maxSpeed = maxSpd ;
        // set currentSpeed
        setCurrentSpeed( getCurrentSpeed() );
    }

    // another methods
    public String toString() {
        return "Aircraft : Speed " + currentSpeed + " , Max Speed : " + maxSpeed ;
    }
    public boolean equalSpeed(ExampleLabTutorial_AirCraft anotherAircraft) {
        return (this.currentSpeed == anotherAircraft.currentSpeed) &&
                (this.maxSpeed == anotherAircraft.maxSpeed) ;
    }

}
