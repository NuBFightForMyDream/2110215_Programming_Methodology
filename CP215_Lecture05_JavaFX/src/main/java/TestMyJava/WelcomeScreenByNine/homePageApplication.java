package TestMyJava.WelcomeScreenByNine;


import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;

/*
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyApplication  extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Read file fxml and draw interface.
            Parent root = FXMLLoader.load(getClass()
                    .getResource("SceneBuilderExample.fxml"));

            primaryStage.setTitle("My Application");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
 */
public class homePageApplication extends Application {
    /* Steps for running applications
    1. extends Application
    2. Start Method
    3. Main Method
     */
    @Override
    public void start(Stage primaryStage) {
        try {
            // Load FXML
            Parent rootScene = FXMLLoader.load(getClass().getResource(
                    "LoginPageChatrphol.fxml"));
            // add scene to stage
            primaryStage.setTitle("Chatrphol's Login Page");
            primaryStage.setScene(new Scene(rootScene));
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
