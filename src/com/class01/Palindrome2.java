package com.class01;

public class Palindrome2 {

	
	public static void isPalindrome (String str) {
		
		String rev="";
		boolean flag;
		for (int i=str.length()-1; i>=0; i--) {
			rev+=str.charAt(i);
			
		}
		
		if(rev.equalsIgnoreCase(str)) {
			System.out.println(str+" is Palindrome");
			
		}else{
			System.out.println(str+" is NOT Palindrome");
		}
	}
	public static void main(String[] args) {
		
		isPalindrome("madam");

	}

}
