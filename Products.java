package com.psl.order;

public abstract class Products {
	
	int prodID;
	String prodName = new String();
	String prodSerialNum;

	public static void main(String[] args) {

		System.out.println("Products are:\n");
		
		Products sObj[] = new SoftwareProducts[2];
		sObj[0] = new SoftwareProducts(1, "sa ", "a", "Win98", 1000 , "SID01");
		sObj[1] = new SoftwareProducts(2, "sa ", "a", "Linux", 2000 , "SID02");
		System.out.println("ID\t\tName\t\tSerial_Num\t\tOS\t\tMemory\t\tLisence");
		System.out.println(sObj[0] + "\n" + sObj[1]);
		
		Products hObj[] = new HardwareProducts[2];
		hObj[0] = new HardwareProducts(3, "sa ", "a", "DELL", 2.0);
		hObj[1] = new HardwareProducts(4, "sa ", "a", "HP", 1.0);
		System.out.println("\nID\t\tName\t\tSerial_Num\t\tBrand\t\tCapacity");
		System.out.println(hObj[0] + "\n" + hObj[1]);
		
	}
}
