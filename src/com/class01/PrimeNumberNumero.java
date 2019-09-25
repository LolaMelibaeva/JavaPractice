package com.class01;

public class PrimeNumberNumero {
	
	public static boolean isPrime (int num) {
		for (int i=2; i<num; i++) {
			if(num%i==0) {
				return false;				
			}
		}return true;
	}
	
	public static void getPrimeAllNum(int num) {
		for (int i=2; i<num; i++) {
			if(isPrime(i)) {
				System.out.print(i+", ");
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println(isPrime(13));
		getPrimeAllNum(25);

	}

}
