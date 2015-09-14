package com.psl.order;

public class HardwareProducts extends Products{
	String brand;
	double capacity;
	/**
	 * @param brand
	 * @param capacity
	 */
	
	public String toString() {
		// TODO Auto-generated method stub
		return prodID + "\t\t" + prodName  + "\t\t" + prodSerialNum + "\t\t\t" + brand + "\t\t" + capacity;
		
	}
	
	public HardwareProducts(int id, String name, String serialNum, String brand, double capacity) {
		super();
		this.prodID = id;
		this.prodName = name;
		this.prodSerialNum = serialNum;
		this.brand = brand;
		this.capacity = capacity;
	}
}
