package com.psl.order;

public class StockItem {
	int itemNumber;
	String itemDescription;
	double itemPrice;
	int quantity;

	public StockItem(int itemNumber, String itemDescription, double itemPrice,
			int quantity) {
//		super();
		this.itemNumber = itemNumber;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	}

	int getQuantity() {
		return quantity;
	}
	void setQuantity(int num){
		this.quantity = num;
	}
}
