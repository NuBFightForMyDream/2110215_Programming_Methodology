package gui;

import javafx.scene.layout.GridPane;
import logic.GameSystem;
import logic.Map;

import java.util.ArrayList;
import java.util.List;

public class GamePane extends GridPane {
    private static final int GAME_SIZE = 620;
    private static GamePane instance;
    private List<List<CellPane>> gridCellPane;
    private double tileSize;

    private GamePane() {
        super();
        this.setPrefWidth(GAME_SIZE);
        this.setPrefHeight(GAME_SIZE);
    }

    public static GamePane getInstance() {
        if (instance == null) {
            instance = new GamePane();
        }
        return instance;
    }

    public void initTiles() {
        // TODO: Complete the remaining code for this method
        // Reset the map and initialize all tiles again by

        // 1 • Remove all children from the grid pane. (Already Provided)
        this.getChildren().clear();
        Map map = GameSystem.getInstance().getCurrentMap(); // update this cleared map as current map

        // 2 • Calculate each tile size. (Already Provided)
        this.tileSize = GAME_SIZE / (Math.max(map.getWidth(), map.getHeight()) * 1.0);

        // 3 • Initialize 2-dimensional list for gridCellPane. (Already Provided)
        this.gridCellPane = new ArrayList<List<CellPane>>();

        /*
        • Add new cell panes with width and height equal to
            tileSize into each grid slot. The size of the grid is the width
            and the height of the map.
        • Also, add each created cell pane into gridCellPane.

        Hint 1: Observe a class Map to retrieve information of the
            map (e.g. map width, map height, …)
        Hint 2: To add objects into 2-dimensional list, first, you must
            add 1-dimensional arraylist for each new row. For example, if
            the list is a 2-dimensional list, then:
                for (int i = 0; i < n; i++) {
                    list.add(new ArrayList<CellPane>());
                    ...
                }
         */
        for (int i = 0 ; i < map.getHeight() ; i++) { // height = row = i
            // create new list for each row
            this.gridCellPane.add(new ArrayList<CellPane>());
            for (int j = 0; j < map.getWidth(); j++) { // width = column = j
                // Add new cell panes with width and height equal to tileSize into each grid slot.
                CellPane eachCellPane = new CellPane(tileSize , tileSize , i , j);
                    // width = height = tileSize , row i column j
                // add cell to GamePane (to show)
                this.add(eachCellPane , j , i) ;
                // add cell to gridCellPane (store)
                this.gridCellPane.get(i).add(eachCellPane);
            }
        }
    }

    public CellPane getCellPane(int row,int col){
        return this.gridCellPane.get(row).get(col);
    }

}
