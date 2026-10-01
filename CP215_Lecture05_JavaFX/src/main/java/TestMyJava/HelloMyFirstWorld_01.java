package TestMyJava;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class HelloMyFirstWorld_01 extends Application {
    @Override // Must do after extends Application
    public void start(Stage primaryStage) {
        // ----------- Part 1 : Scene Graph ---------
        // add element first -> start at Scene Graph
        Button myButt_01 = new Button("Hello World") ; // 1 button for "Hello World"
        // create pane then add element to pane
        TilePane myTilePane = new TilePane() ;
        myTilePane.getChildren().add(myButt_01) ;

        // Part 2 : background (scene)
        Scene myScene = new Scene(myTilePane , 300 , 250) ; // create scene with pane & size

        // Part 3 : Set element of stage (outest)
        primaryStage.setScene(myScene);
        primaryStage.setTitle("My First Program Hello World");
        primaryStage.show() ; // place stage & scene
    }

    // Don't forget to launch scene via main method
    public static void main(String[] args) {
        launch(args);
    }
}
