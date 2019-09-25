package com.class03;

import java.util.Arrays;

public class PrintPair {

	public static void main(String[] args) {
		int arr[] = new int[] { 3, 5, 6, 8, 12, 5, 9, 14, 83, 0, 11 };
        int n = 18;
        
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                if(arr[i]+arr[j]==n) {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        
        //2nd way.
        
        Arrays.sort(arr);
        for (int i:arr) {
        	System.out.print(i+ ", ");
        }
        
        
        for(int o=0; o<arr.length; o++) {
            for(int p=arr.length-1; p>=0; p--) {
                if(arr[o]+arr[p]==17) {
                System.out.println(arr[o]+" "+arr[p]);
                }
            }
        } 
        
    }

	

}
