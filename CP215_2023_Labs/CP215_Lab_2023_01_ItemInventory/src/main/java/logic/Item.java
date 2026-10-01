package logic;

import exception.NameBlankException;

import javax.naming.Name;

public class Item {
	// attributes
	private String itemName;
	private int price;

	// constructor
	public Item(String itemName) throws NameBlankException {
		setItemName(itemName);
		setPrice(0);
		
	}

	public Item(String itemName, int price) throws NameBlankException{
		setItemName(itemName);
		setPrice(price);
	}

	// methods
	public boolean equals(Item other) {
		// The method checks if this card is the same as the parameter item.
		// Return true if itemName of two items are the same, regardless of their price. (not caring price)
		if (this.itemName == other.itemName) {
			return true ;
		}
		return false;
	}

	public String toString() {
		// Return the string in the pattern : {itemName} ${price}
		return this.itemName + " $" + this.price ;
	}

	// getter & setter
	public String getItemName() {
		return this.itemName ;
	}

	public void setItemName(String itemName) throws NameBlankException {
		// This method sets the item’s name, if this method is called with blank string as a
		// parameter, it throws a NameBlankException.
        if (itemName.isBlank() == false) this.itemName = itemName ;
		else throw new NameBlankException() ;
    }

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		if (price < 0) this.price = 0 ;
		else this.price = price ;
	}

}
