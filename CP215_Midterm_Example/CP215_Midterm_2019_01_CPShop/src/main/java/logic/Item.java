package logic;

public class Item {
    // attributes
    private String name ;
    private int pricePerPiece ;

    // constructors
    public Item(String name , int pricePerPiece) {
        setName(name);
        setPricePerPiece(pricePerPiece);
    }

    // methods
    // getter - setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricePerPiece() {
        return pricePerPiece;
    }

    public void setPricePerPiece(int pricePerPiece) {
        if (pricePerPiece < 1) this.pricePerPiece = 1 ;
        else this.pricePerPiece = pricePerPiece;
    }
}
