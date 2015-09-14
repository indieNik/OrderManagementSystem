package com.psl.order;

public class SoftwareProducts extends Products{
	String os;
	double memory;
	String licenceKey;
	/**
	 * @param os
	 * @param memory
	 * @param licenceKey
	 */
	public SoftwareProducts(int id, String name, String serialNum, String os, double memory, String licenceKey) {
		super();
		this.prodID = id;
		this.prodName = name;
		this.prodSerialNum = serialNum;
		this.os = os;
		this.memory = memory;
		this.licenceKey = licenceKey;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return prodID+ "\t\t" + prodName  + "\t\t" + prodSerialNum + "\t\t\t" + os + "\t\t" + memory + "\t\t" + licenceKey ;
	}
	
}
