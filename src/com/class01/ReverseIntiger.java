package com.class01;

public class ReverseIntiger {
	
public static int revInteger (int num) {
		
		int rev=0;
		
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		return rev;
		
}
	public static void main(String[] args) {
		
		System.out.println(revInteger(3566));
		
		
		//Write A Function To Reverse A Number In Java?
				int B = 57;
				String A = Integer.toString(B);
				String reverse = "";
				
				for (int i = A.length()-1; i>=0; i--) {
					reverse =reverse+ A.charAt(i);
				}
				
				System.out.println(reverse);
				
				long num =325512121;
				
			//	StringBuffer sb=new StringBuffer(String.valueOf(num).reverse());
				
		
	}
		
}
	
	
	
	
	
	
	


