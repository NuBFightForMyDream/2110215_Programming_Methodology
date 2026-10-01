package TestMyJava;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox; // เปลี่ยนจาก StackPane เป็น VBox
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Pos; // สำหรับจัดวางกึ่งกลาง

public class MyFirstProgramWithJavaFX_00 extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox myPane = new VBox(15);
        myPane.setAlignment(Pos.CENTER);

        Label myLabel = new Label("JavaFX with CSS Style");
        Button myButt = new Button("Dancing Ceremony");
        Button myHole = new Button("Testing!!!!");

        myPane.getChildren().addAll(myLabel, myButt, myHole);

        Scene myScene = new Scene(myPane, 400, 300);

        // --- ส่วนที่เพิ่ม CSS ---
        // วิธีที่ 1: ถ้าไฟล์ css อยู่ในโฟลเดอร์เดียวกับ class นี้
        // myScene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        // วิธีที่ 2: ถ้าไฟล์ css อยู่ในโฟลเดอร์ resources (แนะนำสำหรับ Gradle/Maven)
        myScene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        // -----------------------

        primaryStage.setTitle("Chatrphol CSS Style");
        primaryStage.setScene(myScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}