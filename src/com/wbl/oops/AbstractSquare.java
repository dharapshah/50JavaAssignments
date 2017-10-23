package com.wbl.oops;

public class AbstractSquare extends Abstractshapes{

	  /*public AbstractSquare(){// child class constructor
			
	  }*/
	
	public static void main(String[] args) {
	
		Abstractshapes squ = new AbstractSquare();
		squ.calculatearea(5,5);
		float area=squ.getArea();
		System.out.println(area);
		
	}

	}


