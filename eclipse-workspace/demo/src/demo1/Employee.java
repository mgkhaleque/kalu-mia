package demo1;

public class Employee {//opening curly brace and class body
	
	String fullName;
	int salary;
	char sex;
	boolean usCitizen;
	int evaluation;
	String origin;
	
	
	public void employeeInfo() {//void or non-returning type method
		System.out.println("Emp info: " +fullName+ " " +salary+ " " +sex+ " " +usCitizen);//method implemented
		
	}
	
	
	public int employeeEvaluation() {//return type method
		return evaluation;
		
	}
	
	public String employeeOrigin() {
		return origin;
		
	}

}
