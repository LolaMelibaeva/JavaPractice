package com.class01;

public class DubLetterString {

	
	public static void findDupLetters (String str) {
		
		char []arr=str.toCharArray();
		char a='a';
		int count=0;
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==a) {
				count++;
			}
			
		}
		System.out.println(count);		
	}
	
	public static void insertNewLetter (String str) {
		
		char []arr=str.toCharArray();
		
		String newstr="";
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='a' || arr[i]=='o' || arr[i]=='e' || arr[i]=='i' || arr[i]=='i') {
				newstr+='x';
			}else {
				newstr+=arr[i];
			}
		}
		System.out.println(newstr);
	}
	
	
	public static void main(String[] args) {
		
		findDupLetters("al rashid");
		
		insertNewLetter("hollywood");
		
		
		

	}

}
