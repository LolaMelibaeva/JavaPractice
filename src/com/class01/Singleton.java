package com.class01;

public class Singleton {
	
	private static Singleton singleton_instance=null;
	public String str;
	
	private Singleton() {
		str="This is a private Singleton constructor";
	}
	
	public static Singleton getInstance() {
		
		if(singleton_instance==null) {
			singleton_instance=new Singleton();
				
		}
		return singleton_instance;
	}
			

	public static void main(String[] args) {
		
		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		x.str=(x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		
	}

}
