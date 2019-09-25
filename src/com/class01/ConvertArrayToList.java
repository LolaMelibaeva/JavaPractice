package com.class01;

import java.util.*;

public class ConvertArrayToList {

	public static void main(String[] args) {
		
		
		String [] fruits= {"banana", "pear", "apple"};
		
		
		
		List<String> fruit=Arrays.asList(fruits);
		for(String food: fruit) {
			System.out.println(food);
		}
		

	}

}
