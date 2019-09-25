package com.class01;

public class Singlton {

	
		//1.Singlton class is a class that can have only 1 object or an instance of the class
		//2.How to design a Singlton class we need create private constructor and create a static method with a return type, 
		//which returns Object of the Singlton class.
		
		
		private static Singlton singlton_instance=null;
		public String str=null;
		
		private Singlton() {
			str="I am a private constructor";
		}
		
		public static Singlton getInstance() {
			if(singlton_instance==null) {
			singlton_instance=new Singlton();			
			}
			return singlton_instance;
			
			
		}
		
		public static void main(String[] args) {
			
			Singlton x=Singlton.getInstance();
			
			
			Singlton y=Singlton.getInstance();
			Singlton z=Singlton.getInstance();
			
			x.str=x.str.toUpperCase();
			y.str=y.str.toLowerCase();
			System.out.println(x.str);
			System.out.println(y.str);
			System.out.println(z.str);
		
	}

}
