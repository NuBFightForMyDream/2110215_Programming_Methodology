package logic;

public class ItemCounter {
    // attributes
    private Item item ;
    private int amount ;

    // constructors
    public ItemCounter(Item item) {
        setItem(item);
        setAmount(1) ;
    }
    public ItemCounter(Item item , int count) {
        setItem(item);
        // check if amount less than 1
        if (this.amount < 1) setAmount(1);
        else setAmount(amount);
    }
    // getter - setter methods
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 0) this.amount = 0 ;
        else this.amount = amount ;
    }

    // another methods
    @Override
    public String toString() {
        return this.getItem() + " x" + this.getAmount() ;
    }
}
