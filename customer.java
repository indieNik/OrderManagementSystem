package com.psl.order;

public class Customer {
	int id;
	String name;
	String homePhone, workPhone, cellPhone;
	String street, city, state, zip;
	int purchaseOrderNumber;
	
	public Customer(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}
	
	void printPhoneNumbers() {
		// TODO Auto-generated method stub
		System.out.println("Ph: " +homePhone+ "(h), " +cellPhone+ "(m), " +workPhone + "(w)\n");
	}
	
	void printShippingAddress() {
		// TODO Auto-generated method stub
		System.out.println(street+ ", " +city+ ", " +state+ "\nPin Code: " +zip);
	}
	
	void setPrintingAddress(String state, String city, String street, String zip) {
		// TODO Auto-generated method stub
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	void setPhoneNumbers(String hPhone, String cPhone, String wPhone) {
		// TODO Auto-generated method stub
		this.cellPhone = cPhone;
		this.homePhone = hPhone;
		this.workPhone = wPhone;
	}
	
	void printCustomer() {
		// TODO Auto-generated method stub
		System.out.println(id+ ". " +name);
	}
}
