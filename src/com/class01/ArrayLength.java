package com.class01;

public class ArrayLength {
	public static void main(String[] args) {
		
		
		int [] arr= {1,2,3,4,5};
		int length=arr.length;
		System.out.println(length);
		for (int i=0; i<length; i++) {
			System.out.println(arr[i]);
		}
		
		String [] array= {"a", "ba", "cd", "df"};
		int arr2=array.length;
		System.out.println(arr2);
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		String toReverse="Hello World";
		String reverse="";
		for (int i=toReverse.length()-1; i>=0; i--) {
			reverse+=toReverse.charAt(i);
		}
		System.out.println(reverse);
	}

}
