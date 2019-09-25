package com.class01;

public class Palindrome {
	
	public static void isPalindrome(String word) {
		String reverse="";
		
		for (int i=word.length()-1; i>=0; i--) {
			reverse+=word.charAt(i);
			
		}
		if(reverse.equalsIgnoreCase(word)) {
			System.out.println(word +" is Palindrome");
		}else {
			System.out.println(word+" is Not Palindrome");
		}
		
	}

	public static void main(String[] args) {
		isPalindrome("madam");
		isPalindrome("NeverOddorEven");
		isPalindrome("racecar");
		
	}

}
