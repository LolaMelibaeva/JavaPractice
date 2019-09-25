package com.class01;
import java.util.*;

public class CatDogDuplicates {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		
		String pet[]= {"cat", "cat", "rat", "duck", "hen","hen"};
		
		Set<String>hset=new LinkedHashSet();
		Collections.addAll(hset, pet);
		
		for (String pets: hset) {
			if(!pets.equals("rat") && (!pets.equals("duck"))) {
				System.out.println(pets);
			}
		}
		
		

	}

}
