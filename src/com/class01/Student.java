package com.class01;

public class Student {
	
	private String name;
	
	public String getName () {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public static void main (String [] args) {
		Student obj=new Student();
		obj.setName("John");
		System.out.println("Student's name is "+obj.getName());
		
	}
}
