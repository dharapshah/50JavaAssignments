package com.wbl.Collections;

import java.util.ArrayList;
import java.util.List;

public class Statistics {
	
	//Q5-C/program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn and produces output as a1,b1,a2,b2,a3,b3
	public void statsbasics(){
		
		List<String>statlist1 = new ArrayList<String>();
		statlist1.add("a1");
		statlist1.add("a2");
		statlist1.add("a3");
		statlist1.add("a4");
		
		List<String>statlist2 = new ArrayList<String>();
		statlist2.add("b1");
		statlist2.add("b2");
		statlist2.add("b3");
		statlist2.add("b4");
		
		for(int i=0; i<4 ;i++){
		System.out.println(statlist1.get(i));
		System.out.println(statlist2.get(i));
		}
			
	
	}

	public static void main(String[] args) {
		Statistics St = new Statistics();
		St.statsbasics();
		


	}

}
