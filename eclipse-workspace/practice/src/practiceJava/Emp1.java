package practiceJava;

public class Emp1{//opening curly brace and class body
	
	String fullName;//declare variables
	int age;
	char sex;
	boolean usCitizen;
	int evaluation;
	String origin;
	
	//void or non-returning method
	public void employeeInfo() {
		
		//method implemented
		System.out.println(" Emp info: "+fullName+ " "+age+ " "+sex+ " "+usCitizen+ " "+evaluation+ " "+origin);
		
	}
	
	public int employeeEvaluation() {//returning method#1
		return evaluation;
	}

	public String employeeOrigin() {
		return origin;
	}
	
}//closing curly brace and class body
