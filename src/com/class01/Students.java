package com.class01;
import java.util.*;

public class Students {
	
	
	private int studentId;
	private String studentName;
	private int studentYOB;
	private String stuHmrTeacher;
	
	Students(int studentId, String studentName, int studentYOB, String stuHmrTeacher){
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentYOB=studentYOB;
		this.stuHmrTeacher=stuHmrTeacher;		
	}
	
	public int getStudId() {
		return studentId;
	}
	public void setStudId(int studentId) {
		this.studentId=studentId;
	}
	
	public int getStudYOB() {
		return studentYOB;
	}
	public void setStudYOB(int studentYOB) {
		this.studentYOB=studentYOB;
	}
	
	public String getStudName() {
		return studentName;
	}
	public void setStudName(String studentName) {
		this.studentName=studentName;
	}
	
	public String getStudHrmTeacher () {
		return stuHmrTeacher;
	}
	
	public void setStudHmrTeacher(String stuHmrTeacher) {
		this.stuHmrTeacher=stuHmrTeacher;
	}
	
	@Override
	
	public String toString() {
		
		return "StudentID="+studentId+", Student Name="+studentName+" , Student YOB="
		+studentYOB+" , Student HomeRoom Teacher: "+stuHmrTeacher;
		
	}	
	

	public static void main(String[] args) {
		
		
		List<Students> students=new ArrayList<Students>();
		students.add(new Students(1, "John Smith", 2014, "Ms.Nelson"));
		students.add(new Students(2, "Bella Smith", 2014, "Mrs.Morales"));
		students.add(new Students(3, "Liza Becker", 2014, "Mrs.White"));
		students.add(new Students(4, "Al Rashid", 2014, "Mr.Johnson"));
		int i=1;
		for (Students student: students) {
			System.out.println("Student#"+i+": "+student);
			i++;
		}
	}

}
