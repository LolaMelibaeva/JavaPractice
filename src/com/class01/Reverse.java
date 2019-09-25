package com.class01;

public class Reverse {

	public static void main(String[] args) {
		String str="Hello everyone!";
		 String reverse="";
		 for(int j=str.length()-1; j>=0; j--) {
			 reverse+=str.charAt(j);
			 
		 }
		 System.out.println(reverse);
		
	}

}
