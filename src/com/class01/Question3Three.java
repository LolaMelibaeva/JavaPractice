package com.class01;

public class Question3Three {
	public static void main (String []args) {
		
		//Find out how many alpha characters present in a string?
		
		String str="kjfkljdklfjoiu984737$##^&##?><";
		
		String newstr=str.replaceAll("[^A-Za-z]","");
		System.out.println(newstr.length());
		
		
	}

}
