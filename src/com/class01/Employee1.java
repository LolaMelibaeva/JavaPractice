package com.class01;

import java.util.*;

public class Employee1 {
	
	private int empId;
	private String empName;
	private int empAge;
	private String empDep;
	
	Employee1(int empId, String empName, int empAge, String empDep){
		super();
		this.empId=empId;
		this.empName=empName;
		this.empAge=empAge;
		this.empDep=empDep;
	}
		public int getEmpId () {
			return empId;
		}
		 
		public void setEmpId(int empId) {
			this.empId=empId;
		}
		
		public int getEmpAge () {
			return empAge;
		}
		 
		public void setEmpAge (int empAge) {
			this.empAge=empAge;
		}
		
		public String getEmpName() {
			return empName;
		}
		 
		public void setEmpName (String empName) {
			this.empName=empName;
		}
		
		public String getEmpDep() {
			return empDep;
		}
		 
		public void setEmpDep (String empDep) {
			this.empDep=empDep;
		}
			 // override toString()
	    @Override
	    
	    
	    public String toString() {
	        return "empId=" + empId 
	                + ", empName=" + empName
	                + ", empAge=" + empAge 
	                + ", empDepartment=" + empDep;
	    }
	

	public static void main(String[] args) {
		
		List<Employee1> empInfo=new ArrayList<Employee1>();
		empInfo.add(new Employee1(1, "John", 32, "IT"));
		empInfo.add(new Employee1(2, "Jim", 42, "Sales"));
		empInfo.add(new Employee1(3, "Julia", 52, "Accounting"));
		int i=1;
		for (Employee1 emp: empInfo) {
			System.out.println("Employee "+i+":"+emp);
			i++;
		
	//	 empInfo.forEach((employee) -> System.out.println(employee));
		
	}

}
}