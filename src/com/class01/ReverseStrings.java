package com.class01;

public class ReverseStrings {

	
		public static boolean isPalindrome( String str) {
		String reverse="";
		boolean flag;
		
		for(int i=str.length()-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
		}
		
		
		if(reverse.equals(str)){
			return true;
			
		
			
		}
		return false;
		}
		public static void main(String[] args) {
		
		System.out.println(isPalindrome("lola"));
		
		
	}

}
