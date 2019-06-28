package com.class01;

public class Question4 {
	
	public static void main(String[] args) {
		
		
		//how to find out the part of the string from a string? What is a substring? Find number of words in string?
		
		
		String str="Welcome to your interview session!";
		String str1=str.substring(8);
		System.out.println(str1);
		String [] str2=str.split(" ");
		for (String str3: str2) {
			System.out.println(str3);
		}
	}

}
