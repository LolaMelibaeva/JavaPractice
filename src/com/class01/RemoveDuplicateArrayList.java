package com.class01;
import java.util.*;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {


		ArrayList<Integer> aList=new ArrayList<Integer>();
		aList.add(1);
		aList.add(2);
		aList.add(1);
		aList.add(2);
		
		Set hset=new HashSet(aList);
		for( Object num: hset) {
			System.out.println(num);
		}
	}

}
