package com.wbl.oops;

public abstract class Abstractshapes implements ShapeConstants{ // parent class

	
	public int noofsides;
	public float area;
	public float parameter;
	
      /*public Abstractshapes(){// constructor

	}*/
	
	public int getNoofsides() {
		return noofsides;
	}
	
	public void setNoofsides(int noofsides) {
		this.noofsides = noofsides;
	}
	
	
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	
	
	public float getParameter() {
		return parameter;
	}
	public void setParameter(float parameter) {
		this.parameter = parameter;
	}
	
	
	public void calculatearea(int Height,int width)
	{
		area=Height*width;
		
	}
	
   public void calculateparameter(int a, int b, int c)
   {
	parameter=a+b+c;   
   }
	

}
