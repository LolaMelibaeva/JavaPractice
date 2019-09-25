package com.class01;
import java.util.*;
import java.util.stream.Collector;

public class ConvertingListIntoMap {

	public static void main(String[] args) {
		
		
		List<String>listOfString=new ArrayList<String>();
		
		listOfString.add("Al");
		listOfString.add("Esam");
		listOfString.add("Marat");
		listOfString.add("Waqas");
		
		

		Map<String, Integer> map = new HashMap<>();
		for(String str: listOfString){	   
			map.put(str, str.length());
		}
		
		System.out.println(map);
//		Map<String, Integer> map8 = listOfString.stream().collect(toMap
//				(s -> s , s -> s.length()));
//	}

	
	

}
}
