package com.class01;

public class StaticOverloadingTest {	
	
	
	
	public static void main(String[] args) {
		
		greet("John");
		greet("John", "Hello");
		
		
	}
	
	

	public static void greet (String name) {
		
		System.out.println("Hello "+name);
		
	}
	
	public static void greet(String name, String greeting) {
		System.out.println(greeting +" "+name);
	}
}
