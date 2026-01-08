package Lecture0_215_IntroOOP.ExerciseAndPastPapers;

public class ExampleLabTutorial_Carrier {
    // define attributes
    private ExampleLabTutorial_AirCraft[] aircraftStorage; // define array of AirCraft objects (not calling new obj)

    // constructors
    public ExampleLabTutorial_Carrier() { // no-arg const
        // change pointer to array of 5 (created new)
        this.aircraftStorage = new ExampleLabTutorial_AirCraft[5];
    }

    public ExampleLabTutorial_Carrier(ExampleLabTutorial_AirCraft[] airCraftArray) { // param = Array of Aircraft
        // set airCraftArray to this.Carrier -> change original array
        this.aircraftStorage = airCraftArray;
        // set each plane currentSpeed to 0 -> using for loop to set value
        for (int pos = 0; pos < this.aircraftStorage.length; pos++) {
            if (this.aircraftStorage[pos] != null) { // check if not null (max store is 5 but no need to store 5 planes)
                this.aircraftStorage[pos].setCurrentSpeed(0);// this.aircraftStorage[i] = each airCraft -> set curr speed = 0
            }
        }
    }

    // another methods
    public ExampleLabTutorial_AirCraft[] getAllCrafts() { // return Array of AirCrafts
        return this.aircraftStorage;
    }

    public boolean planeLand(ExampleLabTutorial_AirCraft plane) {
        // loop until find vacant slot (null)
        for (int pos = 0 ; pos < this.aircraftStorage.length ; pos++) {
            if (this.aircraftStorage[pos] == null) {
                // store planes
                this.aircraftStorage[pos] = plane; // this.aircraftStorage[pos] = each plane slot
                this.aircraftStorage[pos].setCurrentSpeed(0); // set plane currentSpeed to 0
                return true;
            }
        }
        // if not return true , return false
        return false ;
    }

    public boolean planeTakeOff(ExampleLabTutorial_AirCraft plane) {
        // loop until find plane (for taking it off)
        for (int pos = 0 ; pos < this.aircraftStorage.length ; pos++) {
            if (this.aircraftStorage[pos] == plane) {
                // take off plane -> set that pos to null
                this.aircraftStorage[pos] = null ;
                // set currentSpeed on plane to 10 then return true
                plane.setCurrentSpeed(10);
                return true ;
            }
        }
        return false ;
    }

    public String toString() {
        String output_text = "\"" ;
        for (int pos = 0 ; pos < this.aircraftStorage.length ; pos++) {
            if (this.aircraftStorage[pos] != null) {
                output_text += this.aircraftStorage[pos].toString() + '\n';
            }
        }
        return output_text + "\"" ;
    }
}
