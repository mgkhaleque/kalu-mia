package practiceJava;

public class EmployeeCnst{//opening curly brace and class body
	
	String fullName;//declaring variables
	int salary;
	char sex;
	boolean usCitizen;
	
	public EmployeeCnst() {//default or no-argument constructor
		System.out.println("this is from default costractor");
	}
	
	public EmployeeCnst(String fullName) {//parameterized constructor. here string fullName is a parameter or local variable
	    this.fullName = fullName;
		System.out.println(fullName);	
	}
	
		
	public EmployeeCnst(String fullName, int salary, char sex, boolean usCitizen) {
	this.fullName = fullName;
	this.salary = salary;
	this.sex = sex;
	this.usCitizen = usCitizen;
	System.out.println(fullName+ " "+salary+ " "+sex+ " "+usCitizen);
		
	}
}