package com.class01;

public class Question5 {
	
	public static void main(String[] args) {
		
		//Reverse string
		
		
		String str="Hello World!";
		String reversed="";
		for (int i=str.length()-1; i>=0; i--) {
			reversed=reversed+str.charAt(i);
			
		}
		System.out.println(reversed);
		
		
		StringBuffer sb=new StringBuffer(str);
		//sb.reverse();
		System.out.println(sb);
		String reversed1="";
		char[]str1=str.toCharArray();
		for (int i=str1.length-1; i>=0; i--) {
			reversed1=reversed1+str1[i];
	}
		System.out.println(reversed1);
		
		String a="Hello World!";
		String reversed2="";
		for (int i=a.length(); i>=1; i--) {
			reversed2=reversed2+a.substring(i-1, i);
		}
		System.out.println(reversed2);
		
		String b="Today is Sunday!";
		
		String reversed3="";
		String [] arr=b.split(" ");
		for (int i=arr.length-1; i>=0; i--) {
			reversed3=reversed3+arr[i]+" ";
		}
		System.out.println(reversed3);
}
}