package com.class01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Question9 {
public static void main(String[] args) {
	
	
	//How can you remove all duplicates from ArrayList?
	ArrayList list=new ArrayList();
	
	list.add(2);
	list.add(5);
	list.add(5);
	list.add(4);
	
	HashSet hs=new HashSet(list);
	for (Object num: hs) {
		System.out.println(num);
	}
	
}
}
