package com.wbl.strings;

public class Strings {

	
	// program to reverse a string Q3-A
	public void reverse(){
	
	String a= new String ("Beautiful");
	 {
	     System.out.print(a);
	 }
	     System.out.println("");

	 for(int i = a.length()-1; i >= 0; i--)
	 {
	     System.out.print(a.charAt(i)); 
	 }
	}
	
	// program to find a substring in a given string and then replace it Q3-B
	public void substring(){
		//String str = new String("Good Morning") or below is fine
		String str = "Good Morning";
		String str1 = "Hello World";
		System.out.println(" substring form 3 to 8 :" + str.substring(5, 10));
		System.out.println("Replace char in str1: " + str1.replace("Hello", "Hi"));
}
	
	//Q3-C /program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3" 
		public void stringBasic(){
			String MainString = new String ("This i nice");
			String strResult="";
			String a[] = MainString.split(" ");
			for(int i=0; i<a.length;i++)
			{
				int J=i+1;
				strResult = strResult+a[i]+J+" ";
			}
			System.out.println(strResult);
		}
	
		// Write a program to reverse each individual word in a sentence.Q3-D
		public void reverseStatement(){
			
			String statement = new String("My name is Sunita");
			System.out.println(statement);
			String a[] = statement.split(" "); // this will help to know where to split .i.e here betn space
			for (int i=a.length-1; i>=0; i--)
			{System.out.print(a[i]+ " ");}
			
			
		}
		
		
	//Q3-E/program to check for a palindrome string. 
	public void Palindrome(){
		
		String str = new String ("dhara");
		System.out.print(str);
		System.out.println("");
	    String reverse= "";
		for (int i = str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
			char Temp=(str.charAt(i));
			reverse += Temp;
			}
		
		System.out.println("");
		if (str.equals(reverse))
		{
			System.out.println("String is palindrome");
			}
		else
		{
			System.out.println("String is not palindrome");
}
	}
	
	// program to implement equals() methods.
	
	
	public void EqualsNHashcode(){
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "JAVA";
		String s4 = ".net";
		System.out.println("Is equal:"+ s1.equals(s3));
		System.out.println("Is equal:"+ s1.equals(s2));
		System.out.println("Is equal:"+ s1.equals(s4));
		System.out.println("Hashcode value:" + s1.hashCode());
		System.out.println("Hashcode value:"+ s4.hashCode());
	
		
		
	}
	
	public static void main(String[] args) {
		Strings STR = new Strings();
		STR.EqualsNHashcode();

	}

}
