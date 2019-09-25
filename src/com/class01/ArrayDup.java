package com.class01;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrayDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {2,3,4,5,6,45,4,3,2,7,80};
		
		Set<Integer> num=new TreeSet<>();
		for(Integer numb: arr) {
			num.add(numb);
			
		}
		
		System.out.println(num);
		
		
		String str="melibaeva";
		String reverse="";
		
		for (int i=str.length()-1; i>0; i--) {
			reverse+=str.charAt(i);	
			
			}
		if (reverse.equals(str)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
			
		}
		
	}

}
