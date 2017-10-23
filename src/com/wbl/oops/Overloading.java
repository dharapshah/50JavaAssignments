package com.wbl.oops;


// a class having multiple methods like below, having same name (i.e  add-method name) but diff parameters (i.e int, double, etc) is know as overloading
public class Overloading {
	
	
	public static int add (int a, int b){
		return (a+b);
	}

	public static double add (double a, double b){
		return (a+b);
		
	}
	
	public static String add(String a, String b){
		return (a+b);
		
	}
	public static void main(String[] args) {
       System.out.println(add(4,8)); // whenever you are passing 2 integers it will by default know to call add int method
       System.out.println(add("Hello ", "world"));// same for integer 

	}

}
