package concenpt;

public class TestEmployees {
	public static void main(String[] args) {// opening of curly brace and variables initialized
		Employees emp1 = new Employees();
		emp1.fullName = "Masud";
		emp1.salary = 265000;
		emp1.sex = 'M';
		emp1.usCitizen = false;
		emp1.employeeInfo();

		Employees emp2 = new Employees();
		emp2.fullName = "Habib";
		emp2.salary = 198000;
		emp2.sex = 'M';
		emp2.usCitizen = true;
		emp2.employeeInfo();

		Employees emp3 = new Employees();
		emp3.fullName = "Rokeya";
		emp3.salary = 210000;
		emp3.sex = 'F';
		emp3.usCitizen = false;
		emp3.employeeInfo();

	}
}//closing curly brace and variable initialization completed. 
