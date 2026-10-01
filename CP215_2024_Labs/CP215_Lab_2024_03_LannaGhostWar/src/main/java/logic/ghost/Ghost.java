package logic.ghost;

//TODO implements here
public abstract class Ghost {
    // attributes
    private int hp ;

    // constructors
    public Ghost(int hp) {
        this.hp = hp ;
    }

    // Getter - setter
    public int getHp() {
        return hp;
    }

    // methods
    public boolean isDestroyed() {
        if (this.hp < 0) return true ;
        else return false ;
    }
    public void decreaseHp(int amount) {
        // Decrease ghost’s hp by the given amount.
        // Note: that hp cannot be a negative integer.
        int currentHp = this.hp - amount ;
        if (currentHp < 0) currentHp = 0 ;
        this.hp = currentHp ;
    }
    public abstract int getLevel() ; // Return a ghost’s level. Each type of ghost has a different level.
    public abstract void attack() ;
        // To attack the player. Each of HighGhost has
        // different ways to damage the player.
}
