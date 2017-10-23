package com.wbl.oops;


public class BankUsa extends Bank{

	public static void main(String[] args) {
	     Bank Obj1 = new BankUsa();//Here bankusa interest rate is override by bank
	     System.out.println(Obj1.getinterestrate());
	}

}
