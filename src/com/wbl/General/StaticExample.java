package com.wbl.General;

public class StaticExample {
		
		int rollno;
		String name;
		static String college = "GLS";
		
		StaticExample(int r,String n){
			rollno=r;
			name=n;
		}
		
		public void display (){
			System.out.println(rollno + " " + name + " " + college);
		}
	

	

	public static void main(String[] args) {
		
		StaticExample S1 = new StaticExample(111, "Krish");
		StaticExample S2 = new StaticExample(222, "Kiana");
		
		S1.display();
	    S2.display();
		
	}

	

}
