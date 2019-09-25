package com.class01;

public class IQ {
	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		String c="Hello1";
		String d="World";
		
		c=c+d;
		d=c.substring(0,c.length()-d.length());
		c=c.substring(d.length());
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		//2nd largest number in the array
		//max, min
		int [] num= {2, 4, 6, 8, 10};
		
		int largest=num[0];
		int seclargest=0;
		
		for(int i=0; i<num.length; i++) {
			if(num[i]>largest) {
			seclargest=largest;
			largest=num[i];
		}else if(num[i]>seclargest && num[i]!=largest) {
			seclargest=num[i];
		}
		
		}
		System.out.println("Largest "+largest);
		System.out.println("Second Largest"+seclargest);

		
		int[]array= {12,13,14,15,16};
		int max=array[0];
		int min=0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}else {
				min=array[i];
			}
		}
		System.out.println("Max="+max);
		System.out.println("Min="+min);
		
		
		String given="lkgdjkd454623&%$@";
		String replaced=given.replaceAll("[^A-Za-z]", "");
		System.out.println(replaced.length());
		
		
		String str="Welcome to the interview session!";
		String[] str1=str.split(" ");
		System.out.println(str1.length);
		for(String words: str1) {
			System.out.println(words+" ");
		}
		String reverse="";
		for (int i=str.length()-1; i>=0;i--) {
			reverse+=str.charAt(i);
		}
		System.out.println(reverse);
		
		String reverse1="";
		for (int i=str1.length-1; i>=0;i--) {
			reverse1+=str1[i]+" ";
		}
		System.out.println(reverse1);
		
		
		//find a palindrom
		
		String word="madam1";
		
		String reverse2="";
		for (int i=word.length()-1; i>=0; i--) {
			reverse2+=word.charAt(i);}
			if(reverse2.equals(word)){
				System.out.println(word+" is Palindrome");
			}else {
				System.out.println(word+" is NOT palindrome");
			}
			
			
			int numb=4;
			boolean flag=true;
			
			for (int i=2; i<37; i++) {
				if(numb%i==0) {
					flag=false;
					break;
				}
			}if(flag){
				System.out.println(numb+" is prime number");
			}else {
				System.out.println(numb+" is NOT prime number");
			}
			System.out.println("Printing 10 Fibonacci numbers");
			int f=0;
			int g=1;
			int h=0;
			for (int i=0; i<10; i++) {
				
				System.out.println(h+" ");
				
				f=g;
				g=h;
				h=f+g;
				
			}
		}
		

}