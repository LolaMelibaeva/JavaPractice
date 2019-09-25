package com.class01;

import java.util.Arrays;

public class PrintOddAndEven {

	public static void main(String[] args) {
		int arr[]= {25,1,2,5,4,9,3,5,78,9,4,5,6};
		Arrays.sort(arr);
		System.out.println("Even numbers are:");
		for (int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+",");
			
			}
			
		}System.out.println();
		
		System.out.println("Printing odd number");
		for (int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+",");
		
				
			}
		}
		System.out.println();
		
}
}