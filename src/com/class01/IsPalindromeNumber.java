package com.class01;

public class IsPalindromeNumber {
	
	
	
	public static boolean isPalindromeNumber (int num) {
		
		boolean flag;
		int rev=0;
		int t;
		t=num;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(t==rev) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindromeNumber(235));
	}

}
