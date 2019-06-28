package com.class01;

public class Question6 {
	
	public static void main(String[] args) {
		
		
		//Write a java program to find whether a String is palindrome or not.
		
		String a="horrible";
		
		String reversed="";
		
		for (int i=a.length()-1; i>=0; i--) {
			reversed=reversed+a.charAt(i);
			
		}
			if (a.equalsIgnoreCase(reversed)) {
				System.out.println("String is palindrome");
			}else {
				System.out.println("String is not palindrome");
			}
		}
	

}
