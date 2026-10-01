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

//You might need to do something to the following line
public class ControlPane extends VBox {
	// attributes
	private Text drawnNumberText;
	private Text drawCountText;
	private Text bingoText;
	private Button drawButton;
	private Button newRoundButton;
	private NumberGrid numberGrid;

	// constructors
	public ControlPane(NumberGrid numberGrid) {
		// TODO
		// Sets numberGrid field to match the parameter
		this.numberGrid = numberGrid ;
		// Sets the alignment to CENTER.
		this.setAlignment(Pos.CENTER);
		// Sets preferred width to 300.
		this.setPrefWidth(300);
		// Sets spacing to 20.
		this.setSpacing(20);

		// Sets border to a border with border stroke LIGHTGRAY
		// color, stroke style SOLID, corner radii EMPTY, border widths DEFAULT.
		Border border = new Border(new BorderStroke(Color.LIGHTGREY , BorderStrokeStyle.SOLID , CornerRadii.EMPTY , BorderWidths.DEFAULT)) ;
		this.setBorder(border) ;

		// Initializes drawnNumberText and set its font with size 20.
		this.drawnNumberText = new Text(); this.drawnNumberText.setFont(Font.font(20));
		// Initializes drawCountText .
		this.drawCountText = new Text() ;
		// Initializes bingoText with initializeBingoText(). (See below)
		initializeBingoText() ;
		// Initializes drawButton with initializeDrawButton(). (See below)
		initializeDrawButton();
		// Initializes newRoundButton with initializeNewRoundButton(). (See below)
		initializeNewRoundButton();

		// Adds all Text and Button fields to this pane’s children in correct orde
		this.getChildren().addAll(drawnNumberText, drawButton, newRoundButton, bingoText, drawCountText);
		// set drawNumberText's text and drawCountText's text to a beginning of a round texts by using BingoUtil
		BingoUtil.setTextsBeginning(this.drawnNumberText, this.drawCountText) ;
	}


	// methods
	private void initializeBingoText() {
		// TODO
		// Initializes bingoText with text "Bingo!!"
		// Sets font with size 40 and set visible to false.
		this.bingoText = new Text("Bingo!!");
		this.bingoText.setFont(Font.font(40));
		this.bingoText.setVisible(false);

	}

	private void initializeDrawButton() {
		// TODO
		// Initialize drawButton with text "Draw a number"
		this.drawButton = new Button("Draw a number");
		// set button preferred width to 100
		this.drawButton.setPrefWidth(100);
		// set onAction with drawButtonHandler method
		this.drawButton.setOnAction(e -> drawButtonHandler());
	}

	private void initializeNewRoundButton() {
		// TODO
		// Initialize newRoundButton with text "New Round"
		this.newRoundButton = new Button("New Round");
		// set button preferred width to 100
		this.newRoundButton.setPrefWidth(100);
		// set disable to true
		this.newRoundButton.setDisable(true);
		// set onAction to handle with newRoundButtonHandler() method
		this.newRoundButton.setOnAction(e -> newRoundButtonHandler() ) ;
	}
	
	private void drawButtonHandler() {
		// TODO
		// Draws a random int number by using BingoUtil and highlights the drawn number in numberGrid.
		int drawnNum ;
		drawnNum = BingoUtil.drawNumber() ;
		numberGrid.highlightNumber(drawnNum);

		// if numberGrid is bingo , set BingoText to visible , disable drawButton , enable newRoundButton
		if (BingoUtil.isBingo(numberGrid)) { // call isBingo from BingoUtil
			this.bingoText.setVisible(true);
			this.drawButton.setDisable(true);
			this.newRoundButton.setDisable(false); // enable
		}

		// update drawnNumberText's text and drawCountText's text using BingoUtil
		BingoUtil.updateTextsAfterDrawn(drawnNum , drawnNumberText , drawCountText);
	}
	
	private void newRoundButtonHandler() {
		// TODO
		// Assign random numbers to number squares using BingoUtil
		BingoUtil.assignRandomNumbers(getNumberGrid().getNumberSquares());
		// set bingoText to invisible , enable drawButton , disable newRoundButton
		this.bingoText.setVisible(false);
		this.drawButton.setDisable(false); // enable
		this.newRoundButton.setDisable(true);

		// update drawnNumberText's text and drawCountText's text with text beginning using BingoUtil
		BingoUtil.setTextsBeginning(drawnNumberText , drawCountText);
	}

	// getter - setter
	public Text getDrawnNumberText() {
		return drawnNumberText;
	}

	public Text getDrawCountText() {
		return drawCountText;
	}

	public Text getBingoText() {
		return bingoText;
	}

	public Button getDrawButton() {
		return drawButton;
	}

	public Button getNewRoundButton() {
		return newRoundButton;
	}

	public NumberGrid getNumberGrid() {
		return numberGrid;
	}

}
