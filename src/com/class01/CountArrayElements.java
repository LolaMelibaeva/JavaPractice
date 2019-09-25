package com.class01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountArrayElements {

	public static void main(String[] args) {
		String []pet= { "cat", "cat", "dog", "dog", "rat", "mouse"};
		
		
		Map<String, Integer> petcount=new HashMap<>();
		for(String pets:pet) {
			if(petcount.containsKey(pets)) {
				petcount.put(pets, petcount.get(pets)+1);
			}else {
				petcount.put(pets, 1);
			}
		}
		System.out.println(petcount);
		
		
		Set <String> animal=new HashSet<>();
		int count=0;
		for(String anml: pet) {
			if(animal.add(anml)==false) {
				count++;		
				
			}
			
		}
		System.out.println(animal+);
	}

}
