package gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class NumberSquare extends HBox {
	
	private int number;
	private boolean isDrawn;
	private Text numberText;

	public NumberSquare() {
		BingoUtil.initializeNumberSquare(this);
		this.setAlignment(Pos.CENTER);
		this.setBorder(new Border(new BorderStroke(Color.GOLD, BorderStrokeStyle.SOLID,
				CornerRadii.EMPTY, new BorderWidths(1, 0, 0, 1))));
		this.numberText = new Text(); this.numberText.setFont(Font.font(20));

	}

	public void setupNumber(int number) {
		// TODO
		// this.getChildren().clear() ;
		this.number = number ;
		this.isDrawn = false ;
		this.numberText.setText(Integer.toString(number)); // change to String then cover with Text then create new obj

		BackgroundFill backgroundFill = new BackgroundFill(Color.WHITE , null , null);
		Background backGround = new Background(backgroundFill) ;

		// set background fill
		this.setBackground(backGround);
	}	
	
	public void highlight() {
		// TODO
		BackgroundFill backgroundFill = new BackgroundFill(Color.ORANGE , null , null);
		Background backGround = new Background(backgroundFill) ;
		// set background
		this.setBackground(backGround);

		// set isDrawn to true
		this.isDrawn = true ;

	}
	
	public int getNumber() {
		return number;
	}	

	public boolean isDrawn() {
		return isDrawn;
	}

	public void setNumberText(Text numberText) {
		this.numberText = numberText;
	}
}
