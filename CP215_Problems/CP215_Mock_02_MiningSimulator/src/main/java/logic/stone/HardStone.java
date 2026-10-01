package logic.stone;

import utils.GameUtilities;

public class HardStone extends Stone {
    // fields
    protected int durability ;

    // constructors
    public HardStone(int posX , int posY , int durability) {
        super(posX , posY);
        setDurability(durability);
    }

    // getter - setter methods
    public int getDurability() {
        return durability;
    }
    public void setDurability(int durability) {
        if (durability < 0) this.durability = 0 ;
        else if (durability > 5) this.durability = 5 ;
        else this.durability = durability;
    }

    // methods
    public void dig(int digPower) {
        // Decrease durability by dig power.
        // But if the durability is less than or equal to 0, then this stone is destroyed.
        int currentDurability = getDurability() - digPower ;

        if (currentDurability <= 0) GameUtilities.removeStone(this); // destroyed
        else setDurability(currentDurability);
    }
}
