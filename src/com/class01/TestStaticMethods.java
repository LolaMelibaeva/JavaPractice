package com.class01;

public class TestStaticMethods{
	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.name();
		
		p=new Child();
		
		p.name();
		
		
		Child p1=new Child();
		p1.name();
	}
}

class Parent {
	
	public void name() {
		System.out.println("This is a parent class static method");
	}

}
class Child extends Parent{
	
	public  void name() {
		System.out.println("This is a child class static method");
	}
	
	
}
