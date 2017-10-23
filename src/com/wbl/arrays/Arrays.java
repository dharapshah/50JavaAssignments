package com.wbl.arrays;

import java.lang.reflect.Array;

public class Arrays {

	
	
	
	//to find the largest number in a given array Q2-A
	
	public void largestno(){
		
		int largest=0;// generally a variable(itemp) is made to store object
		int[] numbers = {3,25,46,57,70,30};
		for(int i=0; i<numbers.length; i++){
			 int iTemp1=numbers[i];
				if(iTemp1>largest)
				{
					largest=iTemp1;
				}
		}	
		System.out.println(largest);
		
	}
	
	 ////or
	
	public void largestnumber(){
		
		int [] numbers = new int []{10,40,20,30,60,90};
		int largest = 0;
		for (int i=0; i<numbers.length;i++){
			if (numbers [i]> largest);
			largest = numbers[i];
		}
		System.out.println(largest);
		
		
	}
	
	//Q2-B Write a program to find the missing number in a series of sorted numbers stored in an array.
	public void missingno (){
		
		int[] number = new int[] {55,57,58};
		int mn = 0;//(1) mn=0, (2) mn = 55
		int first=number[0];// (1)first = 55, (2) first = 56
		for (int i = 0;i<number.length;i++){// (1)i=0;i<3 (2) i=1;1<3
			mn=number[i];//(1)55 (2)57 
			if(first!=number[i]) //(1)55=55 so  line no 102 first ++ means 55 +1, (2) 56 is not equal to 57 
			{
				System.out.println(first);//(2) prints 56
				break;
			}
		first++;
		}
				
	}
	
	
	//find the common number in any given two arrays Q2-C
	  
		public void commonelements(){
			
			
			int[] arr1 = {1,3,5,6,7,10,15};
			int[] arr2 = {1,3,5,8,7,9};
			for(int i=0; i<arr1.length; i++){
				for(int j=0; j<arr2.length; j++){
					if(arr1[i]  == arr2[j]){
					 System.out.println(arr1[i]);
					}
				}
			}
		}
	
	//Q-2 D Write a program to perform a linear search on any given array.
	public void linearsearch(){
		
		int[] linearno = {5,6,7,8,9,10,12,15};
		int searchno=15;
		for(int i=0; i<linearno.length; i++);// reads value from array
	    	int x = 0; // assign value 
		 if (searchno==linearno[x]);
		 {
			 System.out.println("value found: " + searchno);
		 }
	}
	
	
	//Write a program to sort an array Q2-E
		public void sort(){
			
			int[] obj1 = new int []{2,7,9,4,1};
			
			for (int i = 0; i < obj1.length; i++)
			{
				
	          for (int j = i + 1; j < obj1.length; j++)
	          {
	             int swap =0;
	              
	             
	             
	            	 if ( obj1 [i] > obj1 [j] )
	                 {
	                	  swap = obj1[i];
	                	 
	                	 obj1[i] = obj1[j];
	                	 
	                	 obj1[j] = swap;        	 
	                 }
	          }	
			}
		
		
			for (int i = 0; i < obj1.length; i++)
			{
				System.out.println(obj1 [i]);
			}
		
		}
		
		
	 
		
	
		
	// Q2-F Write a program to locate and swap only 2 elements which are not sorted in a given sorted array. 
    public void locateandswap(){
		
		int[] obj1 = new int []{1,2,5,6,4};
		
		for (int i = 0; i < obj1.length; i++)
		{
			
          for (int j = i + 1; j < obj1.length; j++)
          {
             int swap =0;
              
             
             
            	 if ( obj1 [i] > obj1 [j] )
                 {
                	  swap = obj1[i];
                	 
                	 obj1[i] = obj1[j];
                	 
                	 obj1[j] = swap;        	 
                 }
          }	
		}
	
	
		for (int i = 0; i < obj1.length; i++)
		{
			System.out.println(obj1 [i]);
		}
	
	}
	
    
 // Q2-G Write a program to merge 2 arrays
    public void mergearray(){
    		
    		
    		int[] arr1 = {1,5,10,15};
    		int[] arr2 = {1,3,5,9};
    		
    		int resultoflength =0;
    		resultoflength = arr1.length+arr2.length;
    		int[] arr3 =new int[resultoflength];
    		
    		
    		for(int i=0; i<arr1.length; i++){
    			arr3[i] = arr1[i];
    				      
    		}
    		int iCount=0;
    		
    		for(int j=arr1.length; j<arr3.length; j++){// j=4th position of arr1 till 7th position of arr3
    			//j=4;j<7
    			arr3[j] = arr2[iCount];
    			iCount++;  
    		}
    		
    		for (int i=0; i<resultoflength; i++)
    		{
    		System.out.println(arr3[i]);
    		}
    }
	public static void main(String[] args) {
		Arrays A= new Arrays();
         A.mergearray();

	}

}
