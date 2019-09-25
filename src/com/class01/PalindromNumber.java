package com.class01;

public class PalindromNumber {

	
		
		public static void isPalindrome (int num) {
	
		int rev=0;
		int t;
		t=num;
		
		
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		
		if(t==rev) {
			System.out.println(rev+" is palindrome");
		}else {
			System.out.println("is not palindrome");
		}
	}
		public static void main(String[] args) {
			
			isPalindrome(111);
	}
}
