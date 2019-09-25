package com.class01;

public class Question7 {
public static void main(String[] args) {
	
	//write a java program to check whether a given number is prime or not
	
	int num=17;
	boolean flag=true; 
	for (int i=2; i<=num; i++) {
		if (num%i==0) {
			flag=false;
			break;
		}
		
	}
	if(!flag) {
		System.out.println(num+" is a prime number");
	}else {
		System.out.println(num +" is not a prime number");
		
	}
	
	
	int a=0, b=1, c;
	System.out.println(a+" "+b);
	for (int i=2; i<=10; i++){
		
		c=a+b;
		System.out.println(" "+c);
		a=b;
		b=c;
	}
}
}
