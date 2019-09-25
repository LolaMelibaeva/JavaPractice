package com.class01;

public class ReplaceVowels {

	public static void main(String[] args) {
	
		String str="Java is an OOP language";
		
		String newstr="";
		
		int i=0;
		while(i<str.length()) {
			char c=str.charAt(i);
			if(c=='a' || c=='e'|| c=='o'||c=='u'||c=='i') {
				newstr+='x';
			}else {
				newstr+=c;
			}
			i++;
		}
		
		System.out.println(newstr);
			
			
		
		

	}

}
