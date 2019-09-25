package com.class01;

public class Largest {

	public static void main(String[] args) {
		 //find the largest value
		 int[] arr={28,3,15,9,17,4,23,2};
		 
		 int val=0;
		  int small=0;
		 
		 for(int i=0; i<arr.length;i++) {
			 if(arr[i]>val) {
				 val=arr[i];
			
			 }else {
				 small=arr[i];
			 }
		 }System.out.println(val+" largest");
		 System.out.println(small+ " smallest");

	}

}
