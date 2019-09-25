package com.class01;

public class PrimeNumero {

	
		
		public static boolean isPrimeNumber (int num) {
			
			for (int i=2; i<num; i++) {
				if (num%i==0) {
					return false;
				}
			}
			
			return true;
			
		}
		
		public static void getNumbers (int num) {
			
			for (int i=2; i<=num; i ++) {
				if(isPrimeNumber(i)) {
					System.out.print(i+", ");
				}
			}
		}

		public static void main(String[] args) {
			
		System.out.println(isPrimeNumber(15));
		System.out.println(isPrimeNumber(13));
		System.out.println("Number is 6 " +isPrimeNumber(6));
		System.out.println(isPrimeNumber(20));
		getNumbers(25);
		
		}
}
