package com.class01;

public class JIQ1 {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" and "+b);
		
		String x="Hello";
		String y="World";
		
		x=x+y;
		y=x.substring(0, x.length()-y.length());
		x=x.substring(y.length());
		System.out.println(x+" and "+y);

	}

}
