package test;

public class Employee{//opening of curly brace
	String fullName;//declare variable
	int salary;
	char sex;
	boolean usCitizen;
	
	
	public Employee() {//default or no-argument constructor 
		System.out.println("this is from default constructor");
		
	}
	
	public Employee(String fullName) {// parameterized constructor, String fullName is a parameter also called as
										// local variable
		this.fullName = fullName;
		System.out.println(fullName);

	}
	
	public Employee (String fullName, int salary, char sex, boolean usCitizen) {//constructor 3
		this.fullName = fullName;
	    this.salary = salary;
	    this.sex = sex;
	    this.usCitizen = usCitizen;
	    
	    System.out.println(fullName+ " "+salary+ " "+sex+ " "+usCitizen);
		
	}
	
	
	
}