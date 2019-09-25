package com.class01;

public class Task {

	public static void main(String[] args) {
		
	/*	Write a program, which takes two parameters

		First Parameter is the array of integers and the second parameter is the integer called as Sum

		Your program should find out all the unique pairs in the array whose sum is equal to the second parameter

		For example: 

		First Parameter:{3,5 ,8, 2, 9, 6} 

		Second Parameter: 11

		Output: 

		3,8
		5,6
		2,9
		*/
		
		int [] array= {3,5 ,8, 2, 9, 6};
		int sum=11;
		
		for (int j=0;j<array.length;j++) {
            for(int i=j;i<array.length;i++) {
                int actual=array[j]+array[i];
                
                if(actual==sum) {
                    System.out.println(array[j]+" , "+array[i]);
                }
                
                
            }
            
        }
	}
}