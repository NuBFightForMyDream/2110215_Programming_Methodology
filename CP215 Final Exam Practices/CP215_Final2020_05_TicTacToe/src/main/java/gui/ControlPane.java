package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import logic.GameLogic;

public class ControlPane extends VBox{
	
	private Text gameText;
	private Button newGameButton;
	private TicTacToePane ticTacToePane;
	
	public ControlPane(TicTacToePane ticTacToePane) {
		super();
		// Sets ticTacToePane field to match the parameter
		this.ticTacToePane = ticTacToePane;

		// set the alignment to CENTER.
		this.setAlignment(Pos.CENTER);
		// set preferred width to 300.
		this.setPrefWidth(300);
		// set spacing to 20.
		this.setSpacing(20);
		// call initializeGameText() to initialize gameText.
		initializeGameText();
		// call initializeNewGameButton() to initialize newGameButton.
		initializeNewGameButton();
		// add gameText and newGameButton field to this pane’s children in correct order.
		this.getChildren().addAll(gameText , newGameButton) ;
	}
	
	private void initializeGameText() {
		// Initializes gameText with text "O Turn"
		// set gameText font with size 35
		this.gameText = new Text("O Turn") ;
		this.gameText.setFont(Font.font(35));
	}
	
	public void updateGameText(String text) {
		// set gameText with text "text"
		this.gameText.setText(text);
		
	}
	
	private void initializeNewGameButton() {
		// initialize newGameButton with text "New Game".
		//- set the button preferred width to 100.
		//- set onAction to handle with newGameButtonHandler() method. (See below)
		this.newGameButton = new Button("New Game") ;
		this.newGameButton.setPrefWidth(100);
		this.newGameButton.setOnAction(e -> newGameButtonHandler()) ;
	}
	
	private void newGameButtonHandler() {
		// This method is the handler method for newGameButton.
		// Does the following:
		//- resetting game state using
		// GameLogic.getInstance().newGame() method
		//- set gameText text to “O Turn”
		//- resetting all cells in ticTacToePane by using
		//initializeCellColor()

		// reset game
		GameLogic.getInstance().newGame();
		this.gameText.setText("O Turn");
		// loop each cell
		for (TicTacToeCell eachCell : this.ticTacToePane.getAllCells()) {
			eachCell.initializeCellColor()
		}
		
	}
}
