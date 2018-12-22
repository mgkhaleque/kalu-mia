package testEmployees;

public class Employees{//opening curly brace
	String fullName;// declare variables
	int salary;
	char sex;
	boolean usCitizen;
	String origin;
	int evaluation;
	
	
	
	public void employeeInfo () {//void or non-returning method
		System.out.println(" Emp info: " +fullName+ " " +salary+ " " +sex+ " " +usCitizen);//method initialization
		
	}
	
	public int employeeEvaluation() {
		return evaluation;
		
	}
	
	public String employeeOrigin() {
		return origin;
	}
}
