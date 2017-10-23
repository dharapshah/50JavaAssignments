package com.wbl.General;


public class printNumbers {// using recursion method
	
	public static void printno(int n){
		
		if (n<=100){
		System.out.println(n);
		printno(n+1);
		
	}
	}


	public static void main(String[] args) {
		printno(1);
		

	}
	
}
