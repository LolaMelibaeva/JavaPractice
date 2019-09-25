package com.class01;

public class EvenAndOddNumbers {
	
	public static void reverseInteger( int nom) {
	
	int rev=0;
	
	while (nom!=0) {
		rev=rev*10+nom%10;
		nom=nom/10;
	}
	System.out.println("Reverse number is" +rev);
	
	}
	public static void main(String[] args) {
		
		int num=100;
		System.out.println("Even numbers are: ");
		for (int i=2; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i+", ");			
			
		}
	}
		System.out.println();
		System.out.println("Odd numbers are: ");
		for (int i=2; i<=100; i++) {
		if(i%2!=0) {
	System.out.print(i+", ");
		}
		}
		System.out.println();
		int arr[]= {2, 4, 3, 6, 7, 8, 15};
		System.out.println("Even numbers in the array");
		for (int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" , ");
			}
		}
		reverseInteger(155);
		
}
}