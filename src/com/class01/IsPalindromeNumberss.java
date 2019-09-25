package com.class01;

public class IsPalindromeNumberss {
	
	public static void isPalindromeNumber (int num) {
		
		int rev=0;
		int t;
		t=num;
		
		while (num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
		if (rev==t) {
			System.out.println(t+" is a Palindrome number");
			
			
		}else {
			System.out.println(t+" is not a Palindrome number");
		}		
	}
	
	public static void isArmstrong (int num) {
		
		int r=0;
		int cube=0;
		int t;
		t=num;
		while(num!=0) {
		r=num%10;
		num=num/10;
		cube=cube+(r*r*r);
		}if (cube==t) {
			System.out.println(t+" is Armstrong");
		}else {
			System.out.println(t+" is NOT  Armstrong");
		}
	}

	public static void main(String[] args) {
		
		isPalindromeNumber(636);
		isArmstrong(153);
	}

}
