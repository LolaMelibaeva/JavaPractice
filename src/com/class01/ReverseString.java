package com.class01;

public class ReverseString {

	public static void main(String[] args) {
		String str="Java is boring";
		String reversed="";
		
		int i=str.length()-1;
		do {
			reversed+=(str.charAt(i));
			i--;
		}while(i>=0);
		System.out.println(reversed);
	}

	}


