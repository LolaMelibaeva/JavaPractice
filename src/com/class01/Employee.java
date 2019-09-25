package com.class01;

public class Employee {
	
	private int ID;
	
	public int getID () {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID=ID;
	}
	
	

	public static void main(String[] args) {
		
		Employee idNum=new Employee();
		idNum.setID(001);
		System.out.println("Employee's ID is"+idNum .getID());
	}

}
