package demo1Pk;

public class TestEmployee {

	public static void main(String [] args) {
		
		Employee emp1 = new Employee();
		
		emp1.fullName = "Zahir";
		emp1.salary = 180000;
		emp1.sex = 'M';
		emp1.usCitizen = true;
		
		emp1.employeeInfo();
		
		emp1.employeeEvaluation();
		System.out.println("Emp evaluation in 10:" +8);
		
		emp1.employeeOrigin();
		System.out.println("Emp origin is:" +"Bangladesh");
		
	}

}
