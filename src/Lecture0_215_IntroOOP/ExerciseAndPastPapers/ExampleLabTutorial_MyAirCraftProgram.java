package Lecture0_215_IntroOOP.ExerciseAndPastPapers;

public class ExampleLabTutorial_MyAirCraftProgram {
    // this class is to test all methods

    public static void main(String[] args) {
        // define ship_1 & ship_2
        ExampleLabTutorial_Carrier ship_1 = new ExampleLabTutorial_Carrier() ;
        ExampleLabTutorial_Carrier ship_2 = new ExampleLabTutorial_Carrier() ;

        // define plane
        ExampleLabTutorial_AirCraft jaguar = new ExampleLabTutorial_AirCraft();
        ExampleLabTutorial_AirCraft bear = new ExampleLabTutorial_AirCraft();
        ExampleLabTutorial_AirCraft eagle = new ExampleLabTutorial_AirCraft(50,100);

        // fill airCraft in ship_2
        ship_2.planeLand( jaguar ) ;
        ship_2.planeLand( bear ) ;

        System.out.println("--- Status before changing state ---") ;
        System.out.println("Ship 1 ==> " + ship_1.toString()) ;
        System.out.println("Ship 2 ==> " + ship_2.toString()) ;


        // first state
        ship_2.planeTakeOff( jaguar ) ;
        ship_2.planeTakeOff( bear ) ;
        jaguar.setCurrentSpeed(105);
        bear.setCurrentSpeed(90);
        System.out.println("--- Status After changing 1st state ---") ;
        System.out.println("Ship 1 ==> " + ship_1.toString()) ;
        System.out.println("Ship 2 ==> " + ship_2.toString()) ;

        // second state
        ship_1.planeLand( jaguar ) ;
        ship_1.planeLand( bear ) ;
        ship_2.planeLand( eagle ) ;
        System.out.println("--- Status After changing 2nd state ---") ;
        System.out.println("Ship 1 ==> " + ship_1.toString()) ;
        System.out.println("Ship 2 ==> " + ship_2.toString()) ;

    }

}
