package com.class01;

public class EncapsulationSimple {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}

	public static void main(String[] args) {
		EncapsulationSimple obj=new EncapsulationSimple();
		
		obj.setName("Al Rashid");
		obj.setAge(25);
		System.out.println("Student's name is "+obj.getName()+"\n"+"Student's age is "+obj.getAge());
		
	}

}
