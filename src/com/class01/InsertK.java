package com.class01;

public class InsertK {

	public static void main(String[] args) {


		String str="fluffy";
		
		String str1=str.replace("f", "Kf");
		
		System.out.println(str1);
		
		int a=10;
		
		Integer a1=Integer.valueOf(a)+5;
		System.out.println(a1);
		
		
		
		
		String newstr="";
		int i=0;
		
		
		while(i<str.length()) {
			char word=str.charAt(i);
			if(word=='f') {
				newstr+='K';
			}else {
				newstr+=word;
			}i++;
		}
		System.out.println("New String is " +newstr);

	}

}
