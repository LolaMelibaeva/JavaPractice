package com.class01;

public class ArmstrongNumber {

	
		
		public static void isArmstrong (int num) {
			System.out.println("Given number is "+ num);
			int cube=0;
			int r;
			int t;
			t=num;
			
			while(num>0) {
				r=num%10;
				num=num/10;
				cube=cube+(r*r*r);
				
			}
			if (cube==t) {
				System.out.println(t +" is Armstrong number");
			}else {
				System.out.println(t+ " is Not Armstrong number");
			}
			
		}
		public static void main(String[] args) {
			isArmstrong(153);
			isArmstrong(200);
	}

}
