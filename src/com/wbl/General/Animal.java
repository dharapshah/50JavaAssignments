package com.wbl.General;

public class Animal {
	// if we remove public it will be a default access modifier.Hence cannot be accessed outside package.

	public String name;
	public String breed;
	public String color;
	
	private void eat(){
		System.out.println("It eats dogs biscuits ..");
	}
	
	protected void advantage(){
		System.out.println("It is faithfull animal");
	}
	
	
	public void noise(){
		System.out.println("It screams bhow bhow !!");
	}
	
	public void displaydetails(){
		System.out.println("Name is:" + name);
		System.out.println("Breed is:" + breed);
		System.out.println("color is:"+ color);
		
		
		
	}
	
	public static void main(String[] args) {
		Animal obj1 = new Animal();
		obj1.breed = "Labrador";
		obj1.color = "White";
		obj1.name = "Nyon";
		obj1.eat();
		obj1.noise();
		obj1.displaydetails();
		obj1.advantage();
		
	}

}
