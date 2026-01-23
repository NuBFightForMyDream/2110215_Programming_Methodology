package Lecture1_215_OOP_Exception.Example01_TransportSimulation;

public class TransportSim {
    // define new objects in main function
    public static void main(String[] args) {
        Car CarA = new Car() ; // no param
        Car CarB = new Car() ;

        CarA.setSpeed(100);
        CarB.setSpeed(-100) ;

        System.out.println("Car A Speed : " + CarA.getSpeed());
        System.out.println("Car B Speed : " + CarB.getSpeed()) ;
    }
}
