package com.class01;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		
		int arr[]= {15,22,43,4,5,6,1000};
		
		int max=arr[0];
		int secmax=arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				secmax=max;
				max=arr[i];
//			}else if(arr[i]>secmax && arr[i]!=max) {
//				secmax=arr[i];
			}
		}
		System.out.println("Largest num in the array="+max);
		System.out.println("Largest num in the array="+secmax);
		
		int maks=arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>maks) {
				maks=arr[i];
			}else {
				min=arr[i];
			}
		}
		
		System.out.println("Max num is="+maks);
		System.out.println("Min num is="+min);
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-2]);
		
		String str="kfjsdju9393$%^&*";
		String replaced=str.replaceAll("[^A-Za-z]", "");
		System.out.println(replaced);
		
		String a="Today I have onsite interview with Tista";
		String []a1=a.split(" ");
		System.out.println("There are "+ a1.length+" words in the string");
		for(String words: a1) {
			System.out.print(words+", ");
		}
		System.out.println();
		String reverse="";
		for (int i=a.length()-1; i>=0; i--) {
			reverse+=a.charAt(i);
		}
		System.out.println("Reverse string is: "+reverse);
		String reverse1="";
		 char a2[]=a.toCharArray();
		 for (int i=a2.length-1; i>=0; i--) {
			 reverse1+=a2[i];
		 }
		 System.out.println(reverse1);
	}

}
