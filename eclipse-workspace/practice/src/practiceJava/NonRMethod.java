package practiceJava;

public class NonRMethod {//opening curly brace/class body
	
	String fullName;//declare variables
	int salary;
	char sex;
	boolean usCitizen;
	
	public void employeeInfo() {//void or non-returning method
		System.out.println("Emp Name: "+fullName+ " Emp salary: "+salary+ " Emp sex: "+sex+ " Emp citizenship info: "+usCitizen);
		
	}

	public static void main(String []args) {//main method
		
		NonRMethod emp1 = new NonRMethod();//creating object
		
		emp1.fullName = "Achilis";//initialized variables
		emp1.salary = 1200;
		emp1.sex = 'M';
		emp1.usCitizen = true;
		
		emp1.employeeInfo();//calling method
		
		NonRMethod emp2 = new NonRMethod();
		emp2.fullName = "Hector";
		emp2.salary = 3200;
		emp2.sex = 'M';
		emp2.usCitizen = false;
				
		emp2.employeeInfo();
		
		
	}
	
}
