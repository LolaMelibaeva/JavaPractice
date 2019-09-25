package com.class01;

public class ReplaceWithVowels {

	public static void main(String[] args) {
		
		
		String str="It is a Wonderful Day outside today, aaa?";
		
		String newstr="";
		
		int i=0;
		while(i<str.length()) {
			char c=str.charAt(i);
			if(c=='a' || c=='e' || c=='o' || c=='u' || c=='i') {
				newstr+="x";
			}else {
				newstr+=c;
			}
			i++;
		}
		System.out.println(newstr);
	}

}
