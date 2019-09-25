package com.class01;

public class Singleton3 {
	
	
	private static Singleton3 singleton_instance=null;
	public String str;
	
	private Singleton3() {
		str="I am a private constructor";
	}
	
	public static Singleton3 getInstance () {
		if(singleton_instance==null) {
			singleton_instance=new Singleton3();
			
		}
		return singleton_instance;
		
	}
	

	public static void main(String[] args) {
		
		Singleton3 x=Singleton3.getInstance();
		Singleton3 y=Singleton3.getInstance();
		x.str=(x.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		
		
		
		
	}

}
