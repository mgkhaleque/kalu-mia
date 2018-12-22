package practiceJava;

public class Practicing{//opening curly brace
	
	String fullName;//declare variables
	int salary;
	char sex;
	boolean usCitizen;
	int evaluation;
	String origin;
	
	//void or non-returning method
	
	public void employeeInfo() {
		
		//method implementation
		System.out.println("Emp info: " + fullName+ " "+ salary+ " "+sex+ " "+usCitizen+ " "+evaluation+ " "+origin);
		
	}
	
	//returning method
	public int employeeEvaluation() {
		return evaluation;
	}
	public String employeeOrigin() {
		return origin;
	}
	
	

	
}
	
	
	
	
	
	
