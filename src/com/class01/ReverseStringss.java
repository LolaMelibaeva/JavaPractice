package com.class01;

public class ReverseStringss {

	public static void main(String[] args) {
		
		
		String str="Today is a beautiful day";
		String reverse="";
		
		for (int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
		}
		System.out.println(reverse);
		
		String reverse1="";
		
		char[]arr=str.toCharArray();
		for(int i=arr.length-1; i>=0; i--) {
			reverse1+=arr[i];
		}
		System.out.println(reverse1);
		
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
	}

}
