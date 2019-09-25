package com.class01;

import java.util.ArrayList;
import java.util.List;

public class SumArray {
	
	
	public static int getSum(int[]num){
		
		int sum=0;		
		
		for (int i=0; i<num.length; i++) {
			sum+=num[i];
			
		}
	System.out.println(sum);

		return sum;
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		
		getSum(arr);
				
	}

}
