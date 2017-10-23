package com.wbl.Collections;

import java.util.ArrayList;

public class MyArrayList {
	
	//Q5-G/ Write a program to copy arraylist to an array
	public void ArrayList(){
	

  ArrayList<String> FirstArrayList = new ArrayList<String>();
  FirstArrayList.add("One");
  FirstArrayList.add("Two");
  FirstArrayList.add("Three");
  FirstArrayList.add("Four");

  System.out.println("Actual ArrayList:" + FirstArrayList);
  String[] stdArray = new String[FirstArrayList.size()];
  FirstArrayList.toArray(stdArray);
	
  
  for (String Str: stdArray){
  System.out.println("Actual Array:" + Str);
  
	}
	}
	

	public static void main(String[] args) {
	MyArrayList AL = new MyArrayList();
	AL.ArrayList();
	
	

	}

}
