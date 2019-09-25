package com.class01;

public class Singleton2 {
	
	private static Singleton2 singleton_instance; 
	 public String str=null;
	
	private Singleton2() {
		str="I am a private constuctor";
	}
	
	
	public static Singleton2 getInstatnce() {
		if(singleton_instance==null) {
			singleton_instance=new Singleton2();
		}
		return singleton_instance;
	}
	
	
	

	public static void main(String[] args) {
		
		Singleton2 obj=Singleton2.getInstatnce();
		Singleton2 obj2=Singleton2.getInstatnce();
		
		obj.str=obj.str.toUpperCase();
		System.out.println(obj.str);
		System.out.println(obj2.str);
		
		
	}

}
