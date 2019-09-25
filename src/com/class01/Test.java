package com.class01;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Test obj=new Test();
		obj.studenDetails();
		
	}

	void studenDetails() throws InterruptedException {
		System.out.println("A student is sleeping");
		Thread.sleep(3000);
		System.out.println("Please don't disturb");
	}
	
	
	
}
