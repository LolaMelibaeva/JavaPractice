package com.class01;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWords {
	
	public static void findDupWords (String str) {
		
		String []newstr=str.split(" ");
		
		Map<String, Integer> wordcount=new HashMap<>();
		
		for (String words : newstr) {		
			if(wordcount.containsKey(words)) {
			wordcount.put(words, wordcount.get(words)+1);
		}else {
			wordcount.put(words, 1);
		}
	}System.out.println(wordcount);
	}

	public static void main(String[] args) {
		
		findDupWords("I like java java prog. lang. a lot a lot");
		findDupWords("I know know how in write in Java Java");

	}

}
