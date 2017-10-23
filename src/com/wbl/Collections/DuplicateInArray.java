package com.wbl.Collections;

import java.util.HashSet;

// duplicate in array using set Q5,B.
public class DuplicateInArray {

	public void dupilcate(){
		
		String[] strArray = {"one", "two", "three", "one", "four", "five", "three"};
		HashSet<String> dupe1 = new HashSet<String>();
			
		
		for (String arrayElement : strArray)
        {
			//System.out.println("Before Desc Element is : "+arrayElement);
			
			boolean b1=dupe1.add(arrayElement);
			if(b1==true)
            {
				//System.out.println("Element added in hash"+arrayElement);
            }
			else
			{
				System.out.println("Duplicate Element is : "+arrayElement);
			}
		}
		//System.out.println("Hash count"+dupe1.size());
		
	}
	
	
	public static void main(String[] args) {

		DuplicateInArray dp=new DuplicateInArray();
		dp.dupilcate();

	}

}
