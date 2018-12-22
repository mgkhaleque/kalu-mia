package myFirstJava;

public class Student_declared {// opening curly brace
	String firstName;// declare variable
	int studentId;
	char quality;
	boolean bdCitizen;

	public void studentInformation() {// declare constructor
		System.out.println("student Information: " + firstName + "  " + studentId + "   " + quality + "  " + bdCitizen);
	}

	public void goodStudent() {
		System.out.println("The good Student's name is:" + firstName);
	}
}


