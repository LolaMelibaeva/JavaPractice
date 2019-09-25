package com.class01;

import java.util.Arrays;

public class PrintArray {
	public static void main(String []args) {
		
		String []arr= {"lola", "mariam", "baby"};
		System.out.println(Arrays.toString(arr));
		
		int[]array= {1,2,3,4,5,7};
		Arrays.sort(array);
		System.out.println(array[array.length-2]);
		
		String given="fadfadfj78346&^%$#@";
		String replaced=given.replaceAll("[^A-Za-z]", "");
		System.out.println(replaced);
		
	}

}
