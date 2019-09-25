package com.class01;

public class Pattern {
	public static void main(String[] args) {
		 for (int x = 0; x <5; x++) {
			 for (int y =x ; y <5; y++) {
			 System.out.print("*");
			 }
			 System.out.println();
	}
		 
		 int a = 0, b = 1, c, i, count = 10;
		 // To print 0 and 1
		
		 // loop starts from 2. We have already printed 0 and 1 in the previous step
		 for (i = 0; i < count; i++) {
		 c = a + b;
		 System.out.print(" " + c);
		 a = b;
		 b = c;
		 }
		 

		 
		 
}
}

