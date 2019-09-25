package com.class01;

public class FinalizeMethod {

	
	protected void finalize() {
		System.out.println("Finalize method");
	}
	public static void main(String[] args) {
		
		FinalizeMethod obj=new FinalizeMethod();
		FinalizeMethod obj1=new FinalizeMethod();
		
		obj=null;
		obj1=null;
		
		System.gc();
		
	}

}
