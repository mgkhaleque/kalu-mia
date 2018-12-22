package variable;

public class Employee{//opening of curly brace and class body
	String fullName;//decalare variables
	int salary;
	int empAge;
	char sex;
	boolean bdCitizen;
	
	
	public Employee() {//default  or no-argument constructor
		System.out.println("this is from default constructor");
		
		
	}
	
	public Employee(String fullName) {// parameterized constructor (String fullName is parameter or called local
										// variable
		this.fullName = fullName;
		System.out.println(fullName);

	}
	
	public Employee(String fullName, int salary, int empAge, char sex, boolean usCitizen) {
	
	this.fullName = fullName;
	this.salary = salary;
	this.empAge = 42;
	this.sex = sex;
	this.bdCitizen =true;
	System.out.println(fullName+ " " +salary+ " " +empAge+ " " +sex+ " " +bdCitizen);
	
	}
}
	