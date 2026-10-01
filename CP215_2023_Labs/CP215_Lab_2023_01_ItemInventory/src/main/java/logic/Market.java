package logic;

import java.util.ArrayList;

public class Market {

	// fields
	ArrayList<Item> allItems;

	// constructors
	public Market() {
		// define empty ArrayList
		setAllItems( new ArrayList<Item>() );
	}

	public Market(ArrayList<Item> items) {
		setAllItems( new ArrayList<Item>() );
		addAllItems(items); // addItem with this method
	}

	// methods
	public String toString() {
		String out = "\n";
		for (int i = 0; i < allItems.size(); i++) {
			out += i + 1;
			out += ". ";
			out += allItems.get(i).toString();
			out += "\n";
		}
		return out;
	}

	public void addAllItems(ArrayList<Item> items) {
		// For each of the items in the given list, if the item already exists in the market, Item
		// will not be added. If there is one more item that has the same name in the list, only the
		// item that comes first in the list will be added. Otherwise, add the item to ArrayList allItems.
		for (Item eachItem : items) {
			if (this.allItems.contains(eachItem) == false) {
				this.allItems.add(eachItem) ;
			}
		}
	}

	// getter setters
	public ArrayList<Item> getAllItems() {
		return allItems;
	}

	public void setAllItems(ArrayList<Item> allItems) {
		this.allItems = allItems;
	}
}
