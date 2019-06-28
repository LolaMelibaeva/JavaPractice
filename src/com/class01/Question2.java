package com.class01;

import java.util.Arrays;

public class Question2 {
	
	public static void main (String [] args) {
		
		
		//find 2nd largest number in the array
		
		
		int []a= {2, 4, 5, 8, 1, 0};
		
		
		Arrays.sort(a);
		System.out.println("2nd largest number "+(a[a.length-2]));
		System.out.println("Largest number "+ (a[a.length-1]));
		
		int [] arr= {5,789,102,784, 1000};
		
		int largest=arr[0];
		int seclargest=0;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>largest) {
				seclargest=largest;
				largest=arr[i];
				
			}else if (arr[i]>seclargest && arr[i]!=largest) {
					seclargest=arr[i];
				}
			}

		System.out.println(largest+" "+seclargest);
		
		
		
		
		
		
		
		
		
//		int largest=b[0];
//		int seclargest=0;
//		
//		for (int i=0; i<b.length;i++) {
//			if(b[i]>largest) {
//			seclargest=largest;
//			largest=b[i];
//			
//			}else if (b[i]>seclargest && largest!=b[i]) {
//				seclargest=b[i];
//			}
//			
//			}
//		System.out.println("Largest number is "+largest+ " Second largest is "+seclargest);
	}

}
