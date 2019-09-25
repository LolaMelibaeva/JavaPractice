package com.class01;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
		String x="Hello";
		String y="World";
		
		x=x+y;
		y=x.substring(0, x.length()-y.length());
		x=x.substring(y.length());
		System.out.println(x+" "+y);
		
		int []arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int max=arr[0];
		int secmax=0;
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				secmax=max;
				max=arr[i];
				
			}else if (arr[i]!=max && arr[i]>secmax) {
				secmax=arr[i];
			}
		}
		
		System.out.println("Max num is "+ max);
		System.out.println("Secmax num is "+secmax);
		
		Arrays.sort(arr);
		System.out.println("Max number is "+arr[arr.length-1]);
		System.out.println("Max number is "+arr[arr.length-2]);
		
	}

}
