package com.class01;

public class PatternPrinting {

	public static void main(String[] args) {
		
		for(int i=0; i<6; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		for(int i=0; i<6; i++) {
			for (int j=i; j<6; j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
		int arr[]= {8,3,4,7,5,6,2,9};
		int sum=11;
		
		for(int i=0; i<arr.length; i++) {
			for (int j=i; j<arr.length; j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}

}
