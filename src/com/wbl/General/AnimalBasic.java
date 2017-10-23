package com.wbl.General;


public class AnimalBasic {

	public static void main(String[] args) {
		Animal obj1 = new Animal();
		obj1.noise();// able to call method  because its public
		obj1.advantage();// able to call in same package because its protected.
		//unable to call method eat because its private
	}

}
