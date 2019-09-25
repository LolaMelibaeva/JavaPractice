package com.class01;

public class Prime100 {

	public static void main(String[] args) {
		 
		
		int num=15;
		boolean flag=true;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println(num+" is prime");
		}else {
			System.out.println(num +" is not prime");
	   }
}

}
