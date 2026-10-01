package gui;

import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import logic.GameLogic;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

public class TicTacToeCell extends Pane{
	
	private boolean isDrawn;
	private Color baseColor;
	
	private int xPosition;
	private int yPosition;
	
	private final String oURL;
	private final String xURL;
	
	public TicTacToeCell(int x, int y) {
		super(); // call pane
		// assign oURL , xURL
		this.oURL = "o.png";
		this.xURL = "x.png";
		// set X position and Y Position
		this.setxPosition(x);
		this.setyPosition(y);
		// set pref width and height as 150
		this.setPrefWidth(150); this.setPrefHeight(150);
		// set minimum width & height as 150
		this.setMinWidth(150); this.setMinHeight(150);
		// set baseColor as moccasin
		this.setBaseColor(Color.MOCCASIN);
		// call initializeellColor() to initialize cell color
		initializeCellColor();
		
		this.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				onClickHandler();
			}
		});
	}

	private void onClickHandler() {
		// check if game ended already using "GameLogic.getInstance().isGameEnd()"
		// if game ended , do nothing
		// else check if cell has been drawn , if drawn , do nothing

		// otherwise , check whose turn using "GameLogic.getInstance().isOturn()" and
		// use draw(Image image , Color backgroundColor) method to draw cell
			// if O turn , use oURL to get image of O and AQUA color
			// if X Turn , use xURL to get image of O and YELLOW color
		// after drawing , memorize state of game using "GameLogic.getInstance.drawNumber(xPosition , yPosition)"

		if (GameLogic.getInstance().isGameEnd() == false) {
			// check if cell drawn
			if (this.isDrawn == false) {
				// check whose turn
				if (GameLogic.getInstance().isOturn()) {
					this.draw(new Image(getClass().getClassLoader().getResourceAsStream(oURL)), Color.AQUA);
				}
				else {
					this.draw(new Image(getClass().getClassLoader().getResourceAsStream(xURL)), Color.YELLOW);

				}
				// memorize state
				GameLogic.getInstance().drawNumber(xPosition , yPosition);
			}

		}


	}
	
	private void draw(Image image, Color backgroundColor) {
		BackgroundFill bgFill = new BackgroundFill(backgroundColor, CornerRadii.EMPTY, Insets.EMPTY);
		BackgroundFill[] bgFillA = {bgFill};
		BackgroundSize bgSize = new BackgroundSize(150,150,false,false,false,false);
		BackgroundImage bgImg = new BackgroundImage(image, null, null, null, bgSize);
		BackgroundImage[] bgImgA = {bgImg};
		this.setBackground(new Background(bgFillA,bgImgA));
		this.setDrawn(true);
		
	}
	
	public void initializeCellColor() {
		this.setDrawn(false);
		// Set the Background to be filled with baseColor and set isDraw to false.
		this.setBackground( new Background( new BackgroundFill(baseColor , null , null)));
	}
	
	public boolean isDrawn() {
		return isDrawn;
	}

	public void setDrawn(boolean isDrawn) {
		this.isDrawn = isDrawn;
	}

	public int getxPosition() {
		return xPosition;
	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	public Color getBaseColor() {
		return baseColor;
	}

	public void setBaseColor(Color baseColor) {
		this.baseColor = baseColor;
	}
	
	
}
