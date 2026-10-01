package logic;

import java.util.ArrayList;

public class Region {
    // fields
    private String name ;
    private ArrayList<Player> playerList ;
    private ArrayList<Quest> questList ;

    // constructors
    public Region(String name) {
        // initialize ArrayList for playerList & questList
        playerList = new ArrayList<Player>() ;
        questList = new ArrayList<Quest>() ;
    }

    // getter - setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) this.name = "Nowhere" ;
        else this.name = name ;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    public ArrayList<Quest> getQuestList() {
        return questList;
    }

    public void setQuestList(ArrayList<Quest> questList) {
        this.questList = questList;
    }

    // another methods
    public int getPlayerCount() { return playerList.size() ; }

    public double getRegionRank() { // return average rank of all players in region
        int totalRankScore = 0 ;
        // find total then calculate average rank
        for (Player eachPlayer : playerList) { // use eachPlayer.getRank()
            totalRankScore += eachPlayer.getRank();
        }
        double averageRegionRank = (Math.round(totalRankScore * 100) / 100.0) / getPlayerCount() ;
        return averageRegionRank ;
    }

    public ArrayList<Quest> getAvailableQuests(Player viewer) {

    }
    public void addPlayerToRegion(Player p) { playerList.add(p) ; }
    public void addQuestToRegion(Quest q) { questList.add(q) ; }

}
