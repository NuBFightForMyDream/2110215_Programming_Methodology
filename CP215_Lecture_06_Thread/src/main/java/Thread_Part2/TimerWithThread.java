package Thread_Part2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TimerWithThread extends Application {
	
	private Canvas canvas;
	private int currentTime;
	private Thread timerThread;
	
	public static void main(String[] args) {
		launch(args); // calling start() method
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		this.canvas = new Canvas(150, 150);
		root.getChildren().add(canvas);
	
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Timer");
		primaryStage.setResizable(false);
		primaryStage.sizeToScene();
		primaryStage.show();
		
		this.currentTime = 0;
		GraphicsContext gc = canvas.getGraphicsContext2D();
		this.timerThread = new Thread(() -> {
			while(true){
				try {
					Thread.sleep(1000);
					currentTime++;
					drawCurrentTimeString(gc); // call method below to show time
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Stop Timer Thread");
					break;
				}
			}
		});
		this.timerThread.start();
	}
	
	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		// stop the timewatch by exit application
		this.timerThread.interrupt(); // interrupt timerThread
	}
	
	public void drawCurrentTimeString(GraphicsContext gc){
		// changing with GraphicsContext , is allowed to change without extend new Thread
		gc.setFill(Color.BLACK);
		gc.setFont(new Font(40));
		gc.clearRect(0, 0, this.canvas.getWidth(), this.canvas.getHeight());
		gc.fillText("" + this.currentTime, this.canvas.getWidth() / 2, this.canvas.getWidth() / 2 + 10);
	}
	
	
}
