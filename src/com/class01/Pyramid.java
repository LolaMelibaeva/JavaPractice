package com.class01;

public class Pyramid {

	public static void main(String[] args) {

		
		 for (int x = 0; x <= 6; x++) {
		 for (int y = 0; y <= x; y++) {
		 System.out.print("*");
		 }
		 System.out.println();
		 }
		 
		 for (int x = 6; x >0; x--) {
			 for (int y = x; y >0; y--) {
			 System.out.print("*");
			 }
			 System.out.println();
			 }
		 
	}

}
