package com.class01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		List<String> tvSeries=new ArrayList<>();
		tvSeries.add("A");
		tvSeries.add("B");
		tvSeries.add("C");
		tvSeries.add("D");
		tvSeries.add("E");
		
		tvSeries.forEach(shows->{
			System.out.println(shows);
		});
		
		System.out.println("Iterator------------");
		
		//2. Iterator
		
		Iterator<String> it=tvSeries.iterator();
		while(it.hasNext()) {
			String show=it.next();
			System.out.println(show);
		}
		
		System.out.println("IteratorLambda------------");
		//3. Iterator Lambda expression
		it=tvSeries.iterator();
		it.forEachRemaining(show ->{
			System.out.println(show);
		});
		//4. Simple Loop
		
		System.out.println("ForLoop------------");
		for (int i=0; i<tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}
		//5. For each loop
		
		System.out.println("ForEachLoop------------");
		
		for (String shows:tvSeries) {
			System.out.println(shows);
		}
		
		//6. using listIterator to traverse in both the directions
		
		System.out.println("ListIterator------------");
		
		ListIterator<String> tvSeriesListIt=tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIt.hasPrevious()) {
			String show=tvSeriesListIt.previous();
			System.out.println(show);
		}
	}

}
