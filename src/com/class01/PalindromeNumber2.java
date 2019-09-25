package com.class01;

public class PalindromeNumber2 {
	
	
	public static void isPalidromeNum (int num) {
		
		int reverse=0;
		int t;
		t=num;
		
		
		while(num>0) {
			reverse=reverse*10+num%10;
			num=num/10;
			
		}
		
		if(t==reverse) {
			System.out.println(reverse+ " is Palindrome");
		}else {
			System.out.println(" is not palindrome");
		}
		
		
	}

	public static void main(String[] args) {
		
		isPalidromeNum(112);

	}

}
