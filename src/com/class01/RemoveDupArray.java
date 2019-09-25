package com.class01;
import java.util.*;

public class RemoveDupArray {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6,3,2,5};
		
		
		Set<Integer> num=new LinkedHashSet<Integer>();
		for (Integer array: arr) {
			num.add(array);
			
		}
		System.out.println(num+", ");
		
		List<Integer>list=new ArrayList<Integer>();
		for(Integer array: arr) {
			list.add(array);
		}
		System.out.println(list+", ");

	}

}
