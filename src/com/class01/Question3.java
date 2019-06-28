package com.class01;

import java.util.Arrays;

public class Question3 {
//max and min number in the array
	
	public static void main(String[] args) {
		
	
	int [] array= {10,2,3,45,5,61,7,8,9,12};
	
	Arrays.sort(array);
	for (int i=0; i<array.length; i++) {
		System.out.println(array[i]);
	}
	
	System.out.println("Max "+array[array.length-1]);
	System.out.println("Min "+array[0]);
	
	int max=0;
	int min=array[0];
	
	for (int i=0; i<array.length; i++) {
		if (array[i]>max) {
			max=array[i];
		}else {
			min=array[i];
	}
	
	}
	
	System.out.println(max + " "+min );
}
}