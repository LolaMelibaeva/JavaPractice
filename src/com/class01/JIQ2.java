package com.class01;

public class JIQ2 {
	
	
	public static void getSecondLargest(int [] arr) {
		
		int max=arr[0];
		int secmax=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				secmax=max;
				max=arr[i];		
			}else if(arr[i]>secmax && arr[i]!=max) {
				secmax=arr[i];
			}
		}
		System.out.println("Second Largest in array: "+secmax);
	}

	public static void main(String[] args) {
		
		int []arr= {1,4,5,3,7,45,36,98,4};
		
		getSecondLargest(arr);
	
	}
}