package com.wbl.General;

public class Immutable {
 
	public final class contacts{// final so that it cannot be extended.
		
		private final String name;// making the fields private so that direct access is denied
		private final Integer number;
		
		public contacts (String name, Integer number)
		{
			this.name = name;
			this.number = number;
		}

		public String getName() {
			return name;
		}

		public Integer getNumber() {
			return number;
		}
		
	}
	
	
	public static void main(String[] args) {
		
	 
		

		
		


	}

}
