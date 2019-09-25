package com.class01;

import java.util.*;

import java.util.Set;

public class CatDog {

	public static void main(String[] args) {
		String []pet= { "cat", "cat", "dog", "dog", "rat", "mouse"};
		
	Set	<String> set=new HashSet<>();
//	Collections.addAll(set, pet);
//    for(String run:set) {
//       
//       if(!run.equalsIgnoreCase("rat") && (!run.equalsIgnoreCase("mouse"))) {
//           System.out.println(run);
//       }
//       
       for(String pets:pet) {    	  
    	   if(!pets.equals("rat") && !pets.equals("mouse")) {
    		   set.add(pets);
       }
    
	
	}
       System.out.println(set);
}
		
}

	
//	public String getAlertText() {
//		Alert alert=driver.switchTo().alert();
//		return alert.getText();
//	}

