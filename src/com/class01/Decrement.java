package com.class01;

public class Decrement {

	public static void main(String[] args) {
		
		
		String str="Java is boring";
		String newString="";
		
		int i=0;
		while(i<str.length()) {
			char c=str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) {
				newString+='x';
			}else {
				newString+=c;
			}
			i++;
		}
		System.out.println(newString);
	}

}
