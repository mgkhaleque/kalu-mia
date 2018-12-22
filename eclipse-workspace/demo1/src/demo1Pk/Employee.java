package demo1Pk;

public class Employee{//opening curly brace and class body
	
	String fullName;//decalare variables
	int salary;
	char sex;
	boolean usCitizen;
	int evaluation;
	String origin;
	
	public void employeeInfo() {// void or non-returing method
		System.out.println(" Emp info: " + fullName + " " + salary + " " + sex + " " + usCitizen);

	}
	
	public int employeeEvaluation() { // returning method
		return evaluation;
		
		
	}
	
	public String employeeOrigin() {//method 3
		return origin;
		
		
	}
	
	
	
	
	
	
}