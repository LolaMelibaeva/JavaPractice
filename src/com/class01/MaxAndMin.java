package com.class01;

public class MaxAndMin {

	public static void main(String[] args) {
		
		
		int [] a= {1, 22, 33, 442, 4, -2 };
		
		int max=a[0];
		int min=a[0];
		
		for (int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}else {
				min=a[i];
			}
		}
		System.out.println("Max num is "+ max);
		System.out.println("Min num is "+min);
	}

}
