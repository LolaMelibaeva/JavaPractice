package com.class01;

public class Question8 {
	public static void main(String[] args) {
		
		//write a java program to print 1st 10 numbers of Fibonacci series
		
		
		int a=0; int b=1; int c=0;
		
		for (int i=0; i<10; i++) {
			
			System.out.print(c+" ");
			
			a=b;
			b=c;
			c=a+b;
					
		}
		
		
	}

}
