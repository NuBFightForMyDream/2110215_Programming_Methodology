package TestMyJava;

// import library
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainWindowReDo_02 extends Application {
    @Override
    public void start(Stage primaryStage) {
        // flow pane
        FlowPane myPane = new FlowPane() ;
        myPane.setPadding( new Insets(5) );
            // border frame from window for all direction = 5
        myPane.setHgap(5); myPane.setVgap(5);

        // define each button for each component
        Button exitButton = new Button("Exit");
        exitButton.setPrefWidth(70);
        Button showButton = new Button("Show");
        showButton.setPrefWidth(70);
        TextField textField = new TextField("This is a text field");
        textField.setPrefWidth(250);

        // addChildren will get ArrayList then add all element
        myPane.getChildren().addAll(showButton ,textField , exitButton) ;

        // define scene
        Scene myScene = new Scene(myPane , 410 ,200 ) ; // width 410 * height 200

        // set Title & Scene to primaryStage
        primaryStage.setTitle("Main Window Redo By Nine #2 CP");
        primaryStage.setScene(myScene);
        primaryStage.show();
    }

    // main function to launch program
    public static void main(String[] args) {
        launch(args);
    }
}
