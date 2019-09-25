package com.class01;

public class lettersA {

	public static void main(String[] args) {
		
		
		String str="lola";
        char[]arrCH=str.toCharArray();
        int count = 0;
        
        for(char run:arrCH) {
            if(run=='l') {
                count++;
            }                 
        }
        System.out.println(count);
	}

}
