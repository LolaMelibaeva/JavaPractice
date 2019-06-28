package com.class01;

public class Question1 {
		public static void main (String [] args) {
	//swap 2 number
	
	int a=10;
	int b=20;
	
	System.out.println("Numbers before swap"+" a= "+a+" b= "+ b);
	
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("Numbers before swap"+" a= "+a+" b= "+ b);
	
	
	String c="Hello";
	String d="Class";
	System.out.println("String before swap"+" c= "+c+" d= "+d);
	
	c=c+d;//"HelloClass"
	d=c.substring(0, c.length()-d.length());    //  HelloClass-Class
	c=c.substring(d.length());
	System.out.println("String before swap"+" c= "+c+" d= "+d);
}
}