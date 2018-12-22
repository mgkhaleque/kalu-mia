package classNobject;

public class Student {//opening of curly brace and class body 

	String  fullName;// variables declared
	int age;
	char sex;
	boolean bdCitizen;
	int evaluation;
	String origin;
	
	
	
	public void studentInfo() {//void or no returning method
		System.out.println(" std info: " +fullName+ " "+age+ " "+sex+ " "+bdCitizen);
		
		
	
	}
	
	public int studentEvaluation() {
		return evaluation;
		
	}
	
	public String studentOrigin() {
		return origin;
		
		
	}
	
}//closing of curly brace and end of class body