package com.class01;

public class LetterDuplicate {

	public static void main(String[] args) {
		String str="melibaeva";
		int count=0;
		char[]newstr=str.toCharArray();
		for (int i=0; i<str.length(); i++) {
			if(newstr[i]=='a') {
				count++;
			}
		}
		System.out.println("there are "+ count+" a letters");
	}

}
