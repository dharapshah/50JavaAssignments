package com.wbl.Animal;

import com.wbl.General.Animal;

public class Animaltest {

	public static void main(String[] args) {
		Animal obj1 = new Animal();
		obj1.noise();// unable to call method eat because its private
		obj1.displaydetails();
		
	}

}
