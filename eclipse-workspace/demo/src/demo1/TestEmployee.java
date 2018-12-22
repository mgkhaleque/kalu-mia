package demo1;

public class TestEmployee {
	
	public static void main(String [] args) {//main method, opening curly brace
		
		Employee emp1 = new Employee();// create objective/calling variables and put down values
		
		emp1.fullName = "Achillis";//variable initialized
		emp1.salary = 210000;
		emp1.sex = 'M';
		emp1.usCitizen = true;
		
		emp1.employeeInfo();
		
		emp1.employeeEvaluation();
		System.out.println("Emp evaluation in 10: "+8);
		
		
		emp1.employeeOrigin();
		System.out.println("Emp origing is: " +"Bangladesh");
		
		
		
	}

}
