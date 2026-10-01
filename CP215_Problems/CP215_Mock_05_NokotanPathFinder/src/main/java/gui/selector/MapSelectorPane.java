package gui.selector;

import io.MapParser;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import logic.Map;

public class MapSelectorPane extends VBox {
    private static final String[] fileList = {"01.txt", "02.txt", "03.txt", "04.txt", "05.txt"};
    private static MapSelectorPane instance;

    private MapSelectorPane() {
        // TODO: Complete the remaining code of the constructor
        /*
        Constructor which initializes new MapSelectorPane.
        • First, initialize the superclass by calling superclass’ constructor.
        • Set the preferred width and height to 400 and 600 pixels
        respectively.
        • Set the alignment of the pane to Pos.TOP_CENTER.
        • Set the spacing of the pane to 10 pixels.
        • Set the background color of the pane to
        Color.web("#EEF7FF"). See class CellPane for examples.
        • Set the padding of the pane at top and bottom for 10 pixels.
        Other parameters for the Insets(top,right,bottom,left) are 0.
        • For each map, add a new MapButtonPane(map) to the
        children of this MapSelectorPane.
         */
        super(); // call VBox
        this.setPrefWidth(400); this.setPrefHeight(600);
        this.setAlignment( Pos.TOP_CENTER );
        this.setSpacing(10);
        BackgroundFill backgroundFill = new BackgroundFill(Color.web("#EEF7FF") , null , null);
            // set background with backgroundFill
        this.setBackground( new Background(backgroundFill) );
        this.setPadding( new Insets(10,0,10,0) ); // top bottom 10 , other 0

        for (String file: fileList) {
            Map map = MapParser.readFile("maps/" + file);
            if (map == null) {
                continue;
            }
            // TODO: Add new MapButtonPane for each map here
            this.getChildren().add( new MapButtonPane(map) ) ;
        }
    }

    public static MapSelectorPane getInstance() {
        if (instance == null) {
            instance = new MapSelectorPane();
        }
        return instance;
    }
}
