package com.class01;

public class PrimeInsidePrime {
	
	
	public static boolean isPrime (int num) {
		boolean flag;
		for (int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void checkPrime(int num) {
		for (int i=2; i<num; i++) {
			if(isPrime(i)) {
				System.out.println(i+", ");
			}
		}
	}

	public static void main(String[] args) {
		checkPrime(100);
		System.out.println(isPrime(3));
	}

}
