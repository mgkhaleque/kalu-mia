package VariableMethod;

public class Employee{//opening curly brace and class body
	
	String fullName;//declare variable
	int salary;
	char sex;
	boolean usCitizen;
	int evaluation;
	String origin;
	
	
	
	public void employeeInfo() {//void or no-returning type method
		System.out.println("Emp info: " +fullName+ " " +salary+ " "+sex+ " " +usCitizen);//method initalized		
	}
	
	public int employeeEvaluation() {//return type method
		return evaluation;
		
	}
	
	public String employeeOrigin() {
		return origin;
		
	}
	
	
}