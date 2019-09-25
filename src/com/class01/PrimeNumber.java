package com.class01;

public class PrimeNumber {
	
	public static void isPrime(int num) {
		boolean flag=true;
		for (int i=2; i<num; i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}if(flag) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}

	public static void main(String[] args) {
		isPrime(15);
		
		int a[]= {1,5,2,5,77,88,32};
		int max=a[0];
		int secmax=a[0];
		
		for (int i=0; i<a.length; i++) {
			if(a[i]>max) {
				secmax=max;
				max=a[i];
			}
		}System.out.println(max+" is max number in the array");
		System.out.println(secmax+" is the secmax number in the array");
		
		
	}

}
