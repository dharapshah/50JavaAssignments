package com.wbl.Loops;

public class Loops {
	
	
		
	// fibonaci series Q1-A
	public void fibonaci(){
		int a=0,b=1,c,i,count=20;
		
		System.out.println(a);
		System.out.println(b);

	
		for (i=2; i<count; i++){
			c=a+b;
			System.out.println(" " + c);
			a=b;
			b=c;
			}		
	}
	
	// Q1-B
		public void pingpong(){
			
			for (int i=1; i<=15; i++){
				
				 if (i%3==0 && i%5==0)
				{System.out.println(i + "ping pong");}
				 
				 else if (i%3==0)
					{System.out.println(i + "ping");}
					
				 else if (i%5==0)//if there is no reminder when we divide it by 5 then the number is divisible by 5 
					{System.out.println(i  + "pong");}
				 
				else
					System.out.println(i  + "It is not divisible by 3 and 5");	
			}
		}

		public void Swap1(){
			
          int a= 10;
          int b=20;
          int temp=0;
			
          System.out.println("before swap value of a :" + a);
          System.out.println("before swap value of b :" + b);
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println("after swap value of a :" + a);
			System.out.println("after swap value of b :" + b);
			
			}
				
			
		public void swap2(){
		
			 int a= 50;
	          int b=100;
	          int temp=0;
	          
	     System.out.println("before swap value of a :" + a);
	     System.out.println("before swap value of b :" + b);
	     
	     temp=a; //50
	     a=b; //100
	     b=temp; // 50
	     
	     System.out.println("after swap value of a :" + a);
		System.out.println("after swap value of b :" + b);
			
			
		}
			
		
			
		
	
		
// calculate factorial - Q1-D
	public void factorialusingloop(){
		
		int i, fact=1;
		for (i=1; i<=5; i++){
		
		fact = fact * i;
                /* 1X1=1
                  2X1=2
                  3X2=6
                  4X6=24
                  5X24=120*/
		}
      System.out.println("Factorial is:"+fact);  }
	
	
	
	

//check if a given number is prime or not Q1-E
	public void primenumber(){
		
		int num = 15;
		boolean isprime = true;
		
		
		for(int i=2; i<num; i++){
			if (num%i==0)// (==0 means there is no reminder if we divide it by...,
			{
				isprime = false;
				break;		
			}
		}
			if (isprime)
			{
				System.out.println(num + " is a prime number");
			}
			else
			{
				System.out.println(num + " is not a prime number");
			}
		}


//prints a pattern  Q1-H
	public void printStars(int input){//nested loop, means a loop inside a loop

		for (int irow=0; irow<=10; irow++){
			
			for(int jcolumn=0; jcolumn<=irow; jcolumn++){
				System.out.print("*");		
			}
			System.out.println();
		}
	}


public static void main(String[] args) {
	Loops l = new Loops();
	l.swap2();
}

}
//C,F,G REMAINING