package com.class01;

public class ReplaceChar {

	public static void main(String[] args) {
		
		
		String original="349384$$#^^0kjdjfabfklj";
		
		String replace=original.replaceAll("[^A-Za-z]", "");
		System.out.println(replace.length());
		
		
		String a="Welcome to the interview sessions with Syntax";
		String a1=a.substring(39);
		System.out.println(a1);
		
		String a2[]=a.split(" ");
		
		for( String words: a2) {
			System.out.print(words+", ");
		}
	}

}
