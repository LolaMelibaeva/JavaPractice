package com.class01;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int num=0;
		
		do{
			System.out.println("Enter a number, 0 to finish");
			num=sc.nextInt();
			System.out.println(num*num);
		
	}while(num!=0);
		
		
		for (int i=100; i>0; i-=5) {
			System.out.println(i);
		}

}
}
