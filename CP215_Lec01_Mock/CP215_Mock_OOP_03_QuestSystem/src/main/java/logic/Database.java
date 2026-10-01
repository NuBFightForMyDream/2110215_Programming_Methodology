package logic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Database {
    // fields
    private ArrayList<Player> playerList ;
    private ArrayList<Region> regionList ;

    // constructor
    public Database() {
        // Initialize ArrayList for playerList & regionList
        playerList = new ArrayList<Player>() ;
        regionList = new ArrayList<Region>() ;
    }
    public Database(ArrayList<Player> playerList , ArrayList<Region> regionList) {
        // assign ArrayList for playerList & regionList
        this.playerList = playerList ;
        this.regionList = regionList ;
    }

    // another methods
    public Player addPlayer(String name , Region region) throws Exception {

    }
}
