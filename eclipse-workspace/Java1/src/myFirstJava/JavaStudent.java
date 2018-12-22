package myFirstJava;

public class JavaStudent {//opening curly brace
	String firstName;//declare variale
	int studentId;
	char quality;
	boolean usCitizen;
	float review;
	
	public void goodStudentName(){//declaration of construction
		System.out.println("The goodStudent's name is: " +firstName);
	}
	public void studentInformation() {//method implementation
		System.out.println("student Information is: "  +firstName+ "  "  +studentId+ "  " +quality+ "  " +usCitizen+ "  " +review);
	}
	

}//closing curly brace
