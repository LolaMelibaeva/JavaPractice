package com.class01;

public class StringManipulation {

	public static void main(String[] args) {
		
		
		int x=10;
		int y=20;
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("new value of x="+x);
		System.out.println("new value of y="+y);
		
		
		String a="Hello";
		String b="World";
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("new value of a="+a);
		System.out.println("new value of b="+b);
				
	}

}
