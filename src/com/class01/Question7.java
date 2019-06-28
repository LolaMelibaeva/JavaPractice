package com.class01;

public class Question7 {
public static void main(String[] args) {
	
	//write a java program to check whether a given number is prime or not
	
	int num=17;
	boolean flag=true; 
	for (int i=2; i<num/2; i++) {
		if (num%i==0) {
			flag=false;
			break;
		}
		
	}
	if(flag) {
		System.out.println(num+" is  a prime number");
	}else {
		System.out.println(num +" is not a prime number");
		
	}
}
}
