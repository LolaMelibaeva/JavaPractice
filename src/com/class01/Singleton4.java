package com.class01;

public class Singleton4 {
	
	private static Singleton4 singleton_instance=null;
	public String str;
	
	private Singleton4() {
		str="I am a private constructor";
	}
	
	public static Singleton4 getInstance () {
		if(singleton_instance==null) {
			singleton_instance=new Singleton4();
			
		}
		return singleton_instance;
	}

	public static void main(String[] args) {
		
		Singleton4 x=Singleton4.getInstance();
		Singleton4 y=Singleton4.getInstance();
		x.str=(x.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
	}

}
