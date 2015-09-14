package com.psl.order;

public class OrderItems {
	StockItem stockItem;
	int numberOfItems;

	double getTotal() {
		return numberOfItems * stockItem.itemPrice;
	}

	/**
	 * @param stockItem
	 * @param numberOfItems
	 */
	public OrderItems(int numberOfItems, StockItem stockItem) {
		this.stockItem = stockItem;
		if (stockItem.quantity < numberOfItems) { //
			System.out.printf("Sorry!!! Only %d %s left\n",stockItem.quantity,stockItem.itemDescription);
		} else {
			this.numberOfItems = numberOfItems;
			stockItem.quantity -= numberOfItems; //Update the Currently available Quantities
		}
	}
}
