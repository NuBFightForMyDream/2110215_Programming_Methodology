package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NoteApplicationFromScratch extends Application{

    /* Must Do 3 Steps
        1. Extends Application
        2. Start method
        3. Launch program in main method
    */

    @Override
    public void start(Stage primaryStage) {
        // -------- Zone 1 : Add Every Element --------

        // Layer 1 : define pane (main pane)
        VBox mainPane = new VBox() ;
        // set padding
        mainPane.setPadding( new Insets(10,5,10,5) ); // Top Right Bottom Left
        // set vertical spacing
        mainPane.setSpacing(8);

        // Layer 3.1 : topSection has topicPane & datePane
            VBox topSection = new VBox() ;
            topSection.setSpacing(3);

                HBox topicPane = new HBox() ;

                Label topicMessageLabel = new Label("Topic : ");
                topicMessageLabel.setAlignment(Pos.CENTER_LEFT);

                TextField topicTextField = new TextField() ;
                topicTextField.setPrefWidth(200);

                HBox datePane = new HBox() ;
                Label dateMessageLabel = new Label("Date : ");
                dateMessageLabel.setAlignment(Pos.CENTER_LEFT);

                DatePicker datePicker = new DatePicker() ;
                topicTextField.setPrefWidth(150);

                // -- Add Element to Parent Node --
                topicPane.getChildren().addAll(topicMessageLabel , topicTextField); // 4 -> 3
                datePane.getChildren().addAll(dateMessageLabel , datePicker) ; // 4 -> 3
                topSection.getChildren().addAll(topicPane , datePane) ; // 3 -> 2

        // Layer 3.2 : middleSection has TextArea
            TextArea middleSection = new TextArea() ;
            // -- Add Element to Parent Node -- (No Need)

        // Layer 3.3 : bottomSection has okButton & clearButton
            HBox bottomSection = new HBox() ;
            bottomSection.setAlignment(Pos.CENTER_RIGHT);

                Button okButton = new Button("OK") ;
                okButton.setPrefWidth(60);
                // okButton.setAlignment(Pos.CENTER_RIGHT);

                Button clearButton = new Button("Clear") ;
                clearButton.setPrefWidth(60);
                // clearButton.setAlignment(Pos.CENTER_RIGHT);

            bottomSection.setSpacing(3);

                // -- Add Element to Parent Node --
                bottomSection.getChildren().addAll(okButton , clearButton);

        // -------- Zone 2 : EventHandler Method on okButton & clearButton --------
        okButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String result =
                        "Topic : " + topicTextField.getText() + "\n"
                                + "Date : " + datePicker.getValue() + "\n"
                                + "Description : " + middleSection.getText();
                Alert alert = new Alert(Alert.AlertType.INFORMATION, result);
                alert.show();
            }
        });

        clearButton.setOnAction(e -> {
            topicTextField.clear();
            datePicker.getEditor().clear();
            middleSection.clear(); // lambda
        });

        // ------- Zone 3 : Define Scene & Add Element to Stage ------
        mainPane.getChildren().addAll(topSection , middleSection , bottomSection);

        Scene mainScene = new Scene(mainPane , 270 , 300) ; // Scene with Pane 270x300

        primaryStage.setTitle("MyNote") ;
        primaryStage.setScene(mainScene) ;
        primaryStage.show() ;
    }


    public static void main(String args[]) {
        launch(args);
    }
}
