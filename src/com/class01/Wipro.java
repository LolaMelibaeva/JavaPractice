package com.class01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Wipro
{

	public static void main(String[] args) {
		
		
		String s1=new String("Hello");
		String s2=new String("Hello");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		Map<String,Integer> map=new HashMap<>();
		map.put("bread",1);
		map.put("milk",1);
		for(Map.Entry<String, Integer> food: map.entrySet()) {
			System.out.println(food.getKey()+":"+food.getValue());
			
		}
		
		Set<String> groceries=map.keySet();
		for(String grocery: groceries) {
			System.out.println(grocery+":"+map.get(grocery));
		}
		
		
		

	}

}
