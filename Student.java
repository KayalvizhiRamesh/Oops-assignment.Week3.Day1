package org.student;

import org.department.Department;

public class Student extends Department{
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.deptName();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();		
	}
	
	public void studentName() {
		System.out.println("Student name is Kayal");
	}
	public void studentDept() {
		System.out.println("Student dept is IT");
	}
	public void studentId() {
		System.out.println("Student Id is 180349");
	}

}
