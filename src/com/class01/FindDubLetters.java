package com.class01;

public class FindDubLetters {

	public static void main(String[] args) {
		
		
		String str="meeelibaeva";
		int count=0;
		int count2=0;
		char a='a';
		char []newstr=str.toCharArray();
		for(int i=0; i<newstr.length; i++) {
			if(newstr[i]==a) {
				count++;
			}else if(newstr[i]=='e') {
				count2++;
		}
		

	}
		System.out.println("there are "+count+" 'a' in the string");
		System.out.println("there are "+count2+" 'e' in the string");
	}
}
