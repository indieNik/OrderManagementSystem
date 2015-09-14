package com.psl.order;

public class CustomerTest {
	public static void main(String[] args) {
		Customer obj1 = new Customer(1, "Nikhil");
			
		obj1.setPhoneNumbers("00000", "2151", "01531531");
		obj1.setPrintingAddress("sbdk", "csnlkan", "dnas", "519210");
		
		obj1.printCustomer();
		obj1.printShippingAddress();
		obj1.printPhoneNumbers();
		
		Customer obj2 = new Customer(2, "Ritesh");
		
		obj2.setPhoneNumbers("00000", "2151", "01531531");
		obj2.setPrintingAddress("sbdk", "csnlkan", "dnas", "519210");
		
		obj2.printCustomer();
		obj2.printShippingAddress();
		obj2.printPhoneNumbers();
		
		Customer obj3 = new Customer(3, "Asif");
		
		obj3.setPhoneNumbers("00000", "2151", "01531531");
		obj3.setPrintingAddress("sbdk", "csnlkan", "dnas", "519210");
		
		obj3.printCustomer();
		obj3.printShippingAddress();
		obj3.printPhoneNumbers();
		
	}
}
