package com.psl.order;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Customer jamie = new Customer(1, "Jamie");
		Customer Bill = new Customer(2, "Bill");
		Customer Joe = new Customer(3, "Joe");

		StockItem milk = new StockItem(1, "Milk", 20.00, 5);
		StockItem chicken = new StockItem(2, "Chicken", 458.78, 10);
		StockItem apple = new StockItem(3, "Apple", 15.0, 20);
		StockItem egg = new StockItem(4, "Egg", 5.0, 7);
		StockItem orange = new StockItem(5, "Orange", 15.0, 15);

		
		
		OrderItems[] o1 = new OrderItems[3];
		o1[0] = new OrderItems(2, milk);
		o1[1] = new OrderItems(2, chicken);
		o1[2] = new OrderItems(12, egg);
		PurchaseOrder po1 = new PurchaseOrder(o1);
		jamie.purchaseOrderNumber = po1.poNumber;
		po1.create(1, new Date(9/11/2015));

		jamie.printCustomer();
		po1.setShipDate(new Date(14/9/2015));
		
		System.out.println("Total : "+po1.sumItems());

		
		
		
		
//		
//		OrderItems[] items2 = new OrderItems[3];
//		items2[0] = new OrderItems(5, apple);
//		items2[1] = new OrderItems(10, orange);
//		PurchaseOrder po2 = new PurchaseOrder(items2);
//		po2.create(1, new Date(10/11/2015));
//		po2.setShipDate(new Date(15/9/2015));
//		
//		
//		OrderItems[] items = new OrderItems[3];
//		items[0] = new OrderItems(2, milk);
//		items[1] = new OrderItems(2, chicken);
//		items[2] = new OrderItems(12, egg);
//		PurchaseOrder po1 = new PurchaseOrder(items);
//		po3.create(1, new Date(11/11/2015));
//		po3.setShipDate(new Date(16/9/2015));
	}
}
