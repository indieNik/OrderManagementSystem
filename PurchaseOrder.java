package com.psl.order;

import java.util.Date;

public class PurchaseOrder{

	int poNumber;
	Date orderDate;
	Date shipDate;
	OrderItems items[];
	
	/**
	 * @param poNumber
	 * @param orderDate
	 * @param shipDate
	 * @param items
	 */
	public PurchaseOrder(OrderItems items[]) {
		this.items = items;
	}

	boolean isShipped(){
		// Returns true if shipDate is Set
		if(shipDate == null)
			return false;
		else
			return true;
	}

	double sumItems(){
		//Returns the Total Price for this Purchase Order
		double sum = 0;
		for (int i = 0; i < items.length; i++) {
			sum += items[i].getTotal();
		}
		return sum;
	}

	void setShipDate(Date date){
		this.shipDate = date;
		System.out.println("Item Shipped! (shipDate is Set)");
		System.out.println("Order Detail:\n");
	}

	void create(int poNo, Date orderDt){
		this.orderDate = orderDt;
		this.poNumber = poNo;
	}

	OrderItems[] getItems(){
//		return items in the Current Purchase Order
		return items;  
	}
}
