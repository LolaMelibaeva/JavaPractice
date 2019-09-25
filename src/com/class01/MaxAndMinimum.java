package com.class01;

public class MaxAndMinimum {
	
	public static void findMaxAndMin(int []num) {
		
		int maxi=num[0];
		int min=num[0];
		for (int i=0; i<num.length; i++) {
			if(num[i]>maxi) {
				maxi=num[i];
			}else if (num[i]<min) {
				min=num[i];
			}
		}
		System.out.printf(" %n %d is the Largest Number", maxi);
		System.out.printf(" %n %d is the Smallest Number", min);
		System.out.println();
		
	}
	public static void findLargestAndSecLargest(int[]a) {
	
	int max=a[0];
	int secmax=a[0];
	
	for (int i=0; i<a.length; i++) {
		if(a[i]>max) {
			secmax=max;
			max=a[i];
		}else if (a[i]>secmax && a[i]!=max) {
			secmax=a[i];
		}
	}System.out.println(max+" is max number in the array");
	System.out.println(secmax+" is the secmax number in the array");
	
	}
	public static void main(String[] args) {
		
		int a[]= {1,2,5,4,78,9,3,5,6,0,1,3};
		findMaxAndMin(a);
		findLargestAndSecLargest(a);
		
		
	}

}
