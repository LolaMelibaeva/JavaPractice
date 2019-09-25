package com.class01;

public class MaxAndMinimums {
	
	public static void getMaxMinValue(int []arr) {
		
		int max=arr[0];
		int min=arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}else {
				if(arr[i]<min) {
					min=arr[i];
				}
			}
		}System.out.println("Max value is: "+max);
		System.out.println("Min value is: "+min);
	}

	public static void main(String[] args) {
		int []arr= {2,5,7,3,6,989,32,456,1};
		
		getMaxMinValue(arr);

	}

}
