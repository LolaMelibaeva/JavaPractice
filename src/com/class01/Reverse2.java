package com.class01;

public class Reverse2 {
	
	public static void getReversed(String str) {
		
		for (int i=str.length()-1; i>=0; i--) {
			StringBuilder obj=new StringBuilder();
			obj.append(str.charAt(i));
			System.out.print(obj.toString());
		}
		
		
	}

	public static void main(String[] args) {

		getReversed("today is Friday");

	}

}
