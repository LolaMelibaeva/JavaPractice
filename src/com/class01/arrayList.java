package com.class01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class arrayList {
	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add("apple");
		list.add("pear");
		list.add("banana");
		
		System.out.println("----Printing using for loop----");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("------Printing enhanced loop----");
		
		for (Object fruit:list) {
			System.out.println(fruit);
			
		}
		
		System.out.println("------Printing Iterator------");
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String fruits=it.next();
			System.out.println(fruits);
		}
		
		System.out.println("----Printing using while loop----");
		
		int count=0;
		while(list.size()>count) {
			System.out.println(list.get(count));
			count++;
		}
		
		System.out.println("----Printing array---");
		String [] array=new String[3];
		array[0]="kiwi";
		array[1]="peach";
		array[2]="plum";
		System.out.println(array.length);
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		List linkedList=new LinkedList();
		linkedList.add("A");
		linkedList.add("B");
		System.out.println(linkedList);
		linkedList.add(2,"C");
		linkedList.add(3,"D");
		System.out.println(linkedList);
		linkedList.remove("A");
		linkedList.remove(0);
		System.out.println(linkedList);
		
		Set hset=new HashSet();
		hset.add("BMW");
		hset.add("Mazda");
		hset.add("Mazda");
		hset.add(null);
		hset.add(null);
		System.out.println("---Printing using for each loop----");
		//to Print out HashSet we can do using Enhanced Loop and Iterator;
		for(Object car:hset) {
			System.out.println(car);
		}
		System.out.println("----Printing Iterator------");
		Iterator<String> it1=hset.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		Map<String, Integer> map=new LinkedHashMap<>();
		map.put("Milk", 2);
		map.put("Bread", 1);
		map.put("Juice",2);
		for(Map.Entry<String, Integer> products:map.entrySet()) {
			if(products.getKey().contains("Milk")) {
				products.setValue(5);
			}
			
			
			
			System.out.println(products.getKey()+":"+products.getValue());
		}
		
		for (String key:map.keySet()) {
			if(key.contains("Bread")) {
				map.replace(key, 5);
			}
		}
		
		System.out.println(map);
		System.out.println("-------Printing Hashtable key and values-----");
		Map<Integer,String> htable=new Hashtable<Integer, String>();
		htable.put(1,"January");
		htable.put(2,"February");
		htable.put(3,"March");
		htable.put(4,"April");
		
		for (Map.Entry month : htable.entrySet()) {
			System.out.println(month.getKey()+":"+month.getValue());
		}
		
	}

}
