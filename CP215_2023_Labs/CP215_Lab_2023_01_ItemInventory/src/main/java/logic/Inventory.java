package logic;

import java.util.ArrayList;

public class Inventory {
	
	//fields
	private String playerName;
	private int money;
	private ArrayList<ItemCounter> items;
	
	//constructors
	public Inventory(String playerName) {
		setPlayerName(playerName);
		setMoney(0);
	}
	
	public Inventory(String playerName, int money) {
		setPlayerName(playerName);
		setMoney(money);
	}
	
	public Inventory(String playerName, int money, ArrayList<ItemCounter> items) {
		setPlayerName(playerName);
		setMoney(money);
		setItems(items);
	}
	
	// methods
	public String toString() {
		if (items.size() == 0) {
			return "EMPTY INVENTORY";
		}
		String out = "\n";
		for (int i=0; i<items.size(); i++) {
			out += i+1;
			out += ". ";
			out += items.get(i).toString();
			out += "\n";
		}
		return out;
	}
	public boolean existsInInventory(Item item) {
		// This method checks if the given item exists in the inventory. The item exists in the
		// inventory if there is an ItemCounter with a count of 1 or greater in ArrayList items.

		// loop each item then check amount
		for (ItemCounter eachItem : items) {
			if ( (eachItem.getItem().equals(item)) && (eachItem.getAmount() >= 1) ) { // compare item with item
				return true ;
			}
		}
		return false ;
	}

	public void addItem(Item newItem, int count){
		// This method adds new items to the inventory, equal to the given number. If the
		// given count is not a positive integer, then it does nothing.

		// If this item already exists in the inventory, it adds the count to the ItemCounter
		// corresponding to the pre-existing item in ArrayList items.

		// If this item does NOT already exist in the inventory, then initialize a new ItemCounter
		// corresponding to this item with the given count, then add it to ArrayList items.

		if (count < 0) return ;
		// check if items contains in items (arraylist of inventory) [Note : cannot use .contains() directly , use loop instead]
		for (int pos = 0 ; pos < items.size() ; pos++) {
			ItemCounter eachItemCounter = items.get(pos) ;
			// case 1 : item exist in ArrayList
			if ( eachItemCounter.getItem().equals(newItem) ) { // eachItemCounter.getItem() = eachItem
				// add count to ItemCounter
				eachItemCounter.setAmount( eachItemCounter.getAmount() + count );
			}
			// case 2 : item not exist in ArrayList
			else {
				// initialize new ItemCounter with given amount , then add to ArrayList
				ItemCounter newItemCounter = new ItemCounter(newItem , count) ;
				items.add( newItemCounter ) ;
			}
		}
	}

	public void removeItem(Item toRemove, int count) {

		// if the amount is zero or negative, just return. nothing is removed.
		if (count <= 0)
			return;

		ItemCounter removeIfNeg = null;

		for (ItemCounter ic : items) {
			if (ic.getItem().equals(toRemove)) {
				// Remove the card equal to count.
				ic.setAmount(ic.getAmount() - count);
				removeIfNeg = ic;
			}
		}

		// If removeIfNeg isn't null (meaning something got removed) then we need to
		// check if it is negative.
		if (removeIfNeg != null) {
			// If it goes into the negative, then remove this entry from the deck entirely.
			// You cannot modify a for loop while it's inside, so this has to be done
			// outside.
			if (removeIfNeg.getAmount() <= 0) {
				items.remove(removeIfNeg);
			}
		}

	}

	// getters setters
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		if (playerName.isBlank() == true) this.playerName = "Untitled Player" ;
		else this.playerName = playerName ;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		if (money < 0) this.money = 0 ;
		else this.money = money ;
	}

	public ArrayList<ItemCounter> getItems() {
		return items;
	}

	public void setItems(ArrayList<ItemCounter> items) {
		this.items = items;
	}
}
