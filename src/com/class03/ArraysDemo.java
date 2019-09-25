package com.class03;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]=new int[] {3,5,6,8,12,5,9};
		int sum=0;
		int ave=0;
		for (int i=0; i<arr.length; i++) {
			sum+=arr[i];
			ave=sum/arr.length;
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+ave);
		
		String[] a= {"lola", "mariam"};
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
