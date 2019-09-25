package com.class01;

public class ReverseStringsss {
	
	public static void getReversed (String str) {
		
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev+=str.charAt(i);			
		}
		System.out.println(rev);
	}
	
	public static void getReversed1(String str) {
		String rev1="";
		char[] newstr=str.toCharArray();
		for (int i=newstr.length-1; i>=0; i--) {
			rev1+=newstr[i];
		}
		System.out.println(rev1);
	}
	
public static void getReversed3 (String str) {
		
		
		for(int i=str.length()-1; i>=0; i--) {
		StringBuilder obj=new StringBuilder();
		obj.append(str.charAt(i));
		System.out.print(obj);
		}
		
	}

	public static void main(String[] args) {
		getReversed("Today is Saturday");
		getReversed1("Today is Sunday");
		getReversed3("Today is Monday");
	}

}
