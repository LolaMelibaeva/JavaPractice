package com.class01;

public class FibonacciNumbers {
	
	public static void calcFibonacci(int num) {
		
		int a=0;
		int b=1;
		int c=0;
		for (int i=0; i<=num; i++) {
			System.out.print(c+",");
			a=b;
			b=c;
			c=a+b;
		}
	}

	public static void main(String[] args) {
		calcFibonacci(100);
	}

}
