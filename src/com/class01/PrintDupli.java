package com.class01;

import java.util.LinkedHashMap;

public class PrintDupli {

	public static void main(String[] args) {
		
/////////////// print duplicate words - 1 way //////////////////////////////
  String str = "cat cat dog dog rat";
  LinkedHashMap<String, Integer> map = new LinkedHashMap();
  for (String word : str.split(" ")) {
      if (map.containsKey(word)) {
    	  
          map.put(word, map.get(word) + 1);
          
      } else {
          map.put(word, 1);
      }
  }
  System.out.println(map); 
 

	}

}
