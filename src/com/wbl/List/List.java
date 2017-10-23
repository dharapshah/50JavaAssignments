package com.wbl.List;

import java.util.ArrayList;
import java.util.Iterator;


public class List {

	public void listbasic(){
		
		ArrayList<String>firstlist = new ArrayList<String>();
		firstlist.add("mon");
		firstlist.add("tue");
		firstlist.add("wed");
		firstlist.add("thu");
		firstlist.add("fri");
		firstlist.add("sat");
		firstlist.add("sun");
		
		Iterator<String>itr = firstlist.iterator();
		while(itr.hasNext()){
	    System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args) {

		List li = new List();
		li.listbasic();
	}

}
