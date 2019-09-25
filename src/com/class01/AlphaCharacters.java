package com.class01;

public class AlphaCharacters {

	public static void main(String[] args) {
		
		
		String str="fldskjfkj234^&45";
		String replaced=str.replaceAll("[^A-Za-z]", "");
		System.out.println(replaced.length());
		
		String str1="Today is a beautifule day";
		String []newstr=str1.split(" ");
		for (String newstr1: newstr) {
			System.out.print(newstr1+",");
		}

	}

}
