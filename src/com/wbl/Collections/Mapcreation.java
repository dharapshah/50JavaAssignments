package com.wbl.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapcreation {
	
	//Q-5,D /program having below methods.
	//Write a program having below methods
	
	public void MapExp(){
		
		Map<Integer, String> map = new HashMap <Integer, String>();
		map.put(78676, "Jan");
		map.put(65, "Feb");
		map.put(8768, "Mar");
		map.put(90898088, "Apr");
		map.put(345678, "May");
		
		
	
	
		
		for (Map.Entry<Integer, String> mapentry : map.entrySet()){
			System.out.println("Key:" + mapentry.getKey() + ";Value:" + mapentry.getValue());
			
		}
	
		System.out.println("Value:" + map.get(new Integer (65)));
	

        /*Map<Integer,String> treeMap = new TreeMap<Integer, String>(map);	
	for (Map.Entry<Integer, String> mapentry : treeMap.entrySet()){
		System.out.println("Key:" + mapentry.getKey() + ";Value:" + mapentry.getValue());
		
	}*/
	
	}
	
		
		
		

	
	
	public static void main(String[] args) {
	Mapcreation mp = new Mapcreation();
	mp.MapExp();
	

	}

}
