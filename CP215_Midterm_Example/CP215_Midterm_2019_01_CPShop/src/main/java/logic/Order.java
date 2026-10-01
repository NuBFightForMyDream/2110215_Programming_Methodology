package logic;

import java.util.ArrayList;

public class Order {
	private ArrayList<OrderItem> orderItemList;
	private static int totalOrderCount = 0;
	private int orderNumber;
	
	public Order() {
		// initialize value
		setOrderItemList( new ArrayList<OrderItem>() ); // orderItemList = new ArrayList...
		setOrderNumber( totalOrderCount );
		totalOrderCount++ ;

	}

	public OrderItem addItem(Item item, int amount) {
		// TODO
		// Loop the orderItemList to find if item of any orderItem equals to the given item
		// if there is orderItem with given item, increase that orderItem itemAmount with amount
		// and return that orderItem
		for (OrderItem eachOrderItem : orderItemList) {
			if ( eachOrderItem.getItem().equals(item) ) {
				eachOrderItem.increaseItemAmount(amount);
				return eachOrderItem ;
			}
		}

		// else create new orderItem with given item and amount, then return the new orderItem
		OrderItem newOrderItem = new OrderItem(item , amount) ;
			// add newOrder to ArrayList (orderItemList)
		orderItemList.add( newOrderItem ) ;
		return newOrderItem ;
	}

	public int calculateOrderTotalPrice() {
		// TODO
		// Calculate total price of the order by summing total price of each orderItem in orderItemList
		int totalPriceFromOrderList = 0 ;
		for (OrderItem eachOrderItem : orderItemList) {
			totalPriceFromOrderList += eachOrderItem.calculateTotalPrice();
		}
		return totalPriceFromOrderList ;
	}


	public static int getTotalOrderCount() {
		return totalOrderCount;
	}
	
	public static void resetTotalOrderCount() {
		totalOrderCount = 0;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public ArrayList<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public static void setTotalOrderCount(int totalOrderCount) {
		Order.totalOrderCount = totalOrderCount;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
}
