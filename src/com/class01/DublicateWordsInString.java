package com.class01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DublicateWordsInString {
	
	public static void findDuplicate(String str) {
		
		String newstr[]=str.split(" ");
		
		Map<String, Integer> wordcount=new HashMap<>();
		for (String word: newstr) {
			
			if(wordcount.containsKey(word)) {
			wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
		}else {
			wordcount.put(word, 1);
		}
			
			
		
	}
		
		System.out.println(wordcount);
		
		
		Set<String>words=wordcount.keySet();
		
		for (String wordprint: words) {
			if(wordcount.get(wordprint)>1) {
				System.out.println(wordprint+":"+wordcount.get(wordprint));
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		
		findDuplicate("I like java java language like");
		
		

	}

}
