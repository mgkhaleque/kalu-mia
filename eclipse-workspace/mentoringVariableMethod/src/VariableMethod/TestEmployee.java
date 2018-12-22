package VariableMethod;

public class TestEmployee {
	public static void main(String [] args) {
		
		Employee emp1 = new Employee();
		emp1.fullName = "Mahadi";
		emp1.salary = 250000;
		emp1.sex = 'M';
		emp1.usCitizen = true;
		
		emp1.employeeInfo();
		
		emp1.employeeEvaluation();
		System.out.println("Emp evaluation in 10:" +8);
		
		
		emp1.employeeOrigin();
		System.out.println("Emp origin is; " +"Bangladesh");
		
		
		Employee emp2 = new Employee();
		emp2.fullName = "MontCristo";
		emp2.salary = 170000;
		emp2.sex = 'M';
		emp2.usCitizen = false;
		
		emp2.employeeInfo();
		
	}

	
		
		
}
