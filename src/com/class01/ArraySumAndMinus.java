package com.class01;

public class ArraySumAndMinus {

	public static int sumArrElements(int[]num) {
		
		int sum=0;
		for (int i=0; i<num.length; i++) {
			sum+=num[i];
		}	
		
		return sum;
	}
	public static void main (String [] args) {
		
		
		int []num= {1,2,3,4,5,6,7,8};
		
		System.out.println(sumArrElements(num));

	}
 
}
