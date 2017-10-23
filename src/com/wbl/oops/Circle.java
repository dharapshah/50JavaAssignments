package com.wbl.oops;

public class Circle extends Abstractshapes{



public double radius;//properties/variable
   
  /*public Circle(){// child class constructor
	
}*/
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void  radius(double circumfrance){
		

		radius = circumfrance / (2.00 * pi);
		
	
		
			
		
	}

	

	
	
}
