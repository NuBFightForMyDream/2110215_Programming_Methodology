package products;

import discount.PercentDiscountable;
import discount.Sellable;
import logic.ShopUtil;

public class PercentDiscountProduct extends BaseProduct implements Sellable , PercentDiscountable {
    // fields
    private double percent ;

    // constructors
    public PercentDiscountProduct(String name, int price , double percent) {
        super(name, price);
        setPercent(percent);
    }

    // methods
    // getter - setter
    public double getPercent() {
        return percent;
    }
    public void setPercent(double percent) {
        if (percent < 0) this.percent = 0 ;
        else if (percent > 100) this.percent = 100 ;
        else this.percent = percent;
    }

    // another methods
    public int calcDiscountPerPiece() {
        // Calculates the discount that will be given per piece. Use
        // ShopUtil’s calculateDiscountUsingPercent for this.
        return ShopUtil.calculateDiscountUsingPercent(this.price , this.percent) ;
    }
    public int calculateDiscount(int quantity) {
        return calcDiscountPerPiece() * quantity ;
    }
    public String toString() {
        return this.getProductName() + " (Price: " + this.getPrice() +", "+ this.getPercent() + "% Off)";
    }
}
