package com.class01;

public class Finalize {
	
	protected void finalize() {
		System.out.println("Garbage Collecter is called");
	}

	public static void main(String[] args) {
		
		
		Finalize obj1=new Finalize();
		
		obj1=null;
		System.gc();
	

	}

}
