package com.class01;

public class PalindromeNumber {
	
	public static void isPalindromeNum (int num) {
		
		int rev=0;
		int t;
		t=num;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(rev==t) {
			System.out.println(t+" is Palindrome");
		}else {
			System.out.println(t+" is not Palindrome");
		}
	
	}
	public static void isArmstrong (int num) {
		int cube=0;
		int r=0;
		int t;
		t=num;
		
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(cube==t) {
			System.out.println(t+" is a Armstrong number");
		}else {
			System.out.println(t+" is Not Armstrong number");
		}
	}
	
	public static void main(String[] args) {
		isPalindromeNum(222);
		isPalindromeNum(236);
		isArmstrong(151);

}
}