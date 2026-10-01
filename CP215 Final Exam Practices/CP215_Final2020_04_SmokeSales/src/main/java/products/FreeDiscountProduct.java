package products;

import discount.FreeDiscountable;
import discount.Sellable;
import logic.ShopUtil;

public class FreeDiscountProduct extends BaseProduct implements Sellable , FreeDiscountable {
    // fields
    private int promoQuantity ;
    private int freeQuantity;

    // constructor
    public FreeDiscountProduct(String name, int price , int promoQ , int freeQ) {
        super(name, price);
        setPromoQuantity(promoQ);
        setFreeQuantity(freeQ);
    }

    // methods

    // getter setter
    public int getPromoQuantity() {
        return promoQuantity;
    }
    public void setPromoQuantity(int promoQuantity) {
        if (promoQuantity < 1) this.promoQuantity = 1 ;
        else this.promoQuantity = promoQuantity;
    }
    public int getFreeQuantity() {
        return freeQuantity;
    }
    public void setFreeQuantity(int freeQuantity) {
        if (freeQuantity < 1) this.freeQuantity = 1 ;
        else this.freeQuantity = freeQuantity;
    }

    // another methods
    public int calcFreeDiscountPieces(int totalQuantityBought) {
        return ShopUtil.calculateFreeDiscountPieces(getFreeQuantity() , getPromoQuantity() ,totalQuantityBought);
    }
    public int calculateDiscount(int quantity) {
        // call calcFreeDiscountPieces method
        return calcFreeDiscountPieces(quantity) * price ;
    }
    public String toString() {
        return this.getProductName() + " (Price: " + this.getPrice() + ", Buy " + this.getPromoQuantity() + " Get " + this.getFreeQuantity() + " Free)";
    }
}
