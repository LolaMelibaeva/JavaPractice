package com.class01;

import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class ConsecutiveNum {

	public static void main(String[] args) {
		
		int [] array = { 8, 1, 3, 6, 1, 2, 3, 4, 9, 1, 3, 4, 5, 6, 7 };
		
		Arrays.sort(array);
		
		
		Set<Integer>num=new TreeSet<Integer>();
		for (int i=0; i<array.length; i++) {
			if(array[i]<8 && array[i]>2) {
				num.add(array[i]);
					
				}
			}System.out.println(num);
			
			
			int arr[]= {2, 3, 4, 5, 6, 7};
			
			List<Integer> list=new ArrayList<>();
			for(int i=0; i<arr.length; i++) {
				list.add(arr[i]);
			}
			System.out.println("Converted array to ArrayList"+list);
		}
	}


