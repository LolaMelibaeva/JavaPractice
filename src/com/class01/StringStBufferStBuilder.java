package com.class01;

public class StringStBufferStBuilder {
	
	
	public static void concat1 (String s1) {
		
		s1=s1+" World!";
	}
	
//	public static void concat2 (StringBuffer s2) {
//		s2.append(" World!");
//	}
	
	public static void concat3 (StringBuilder s3) {
		s3.append(" World!");
	}

	public static void main(String[] args) {
		
		String s1="Hello";
		concat1(s1);
		System.out.println(s1);
		
		StringBuilder s3=new StringBuilder("Hello");
		
		concat3(s3);
		System.out.println(s3);
	

	}

}
