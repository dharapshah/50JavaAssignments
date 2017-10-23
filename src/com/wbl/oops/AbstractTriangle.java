package com.wbl.oops;

public class AbstractTriangle extends Abstractshapes{

	/*  public AbstractTriangle(){// child class constructor
			
	  }*/

	public static void main(String[] args) {

		AbstractTriangle Tri = new AbstractTriangle();
		Tri.calculateparameter(5, 5, 5);
		float parameter = Tri.getParameter();
		System.out.println(parameter);
        Tri.setNoofsides(3);
        System.out.println(Tri.noofsides);

	}

}
