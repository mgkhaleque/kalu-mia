package practiceJava;

public class TestEmp1 {

	public static void main(String[] args) {// main method
		Emp1 emp = new Emp1();// creating object

		emp.fullName = "MaximGorki";// calling parameters
		emp.age = 35;
		emp.sex = 'M';
		emp.usCitizen = true;
		emp.evaluation = 8;
		emp.origin = "Us";

		emp.employeeInfo();// calling void or non-returning method
		emp.employeeEvaluation();// calling returning method#1
		System.out.println("Emp evaluation in 10: " + 8);// returning method#1 implemented

		emp.employeeOrigin();// calling returning method#2
		System.out.println("Emp origin: " + "UnitedStates");
		
		Emp1 emp2 = new Emp1();//creating object for emp2
		emp2.fullName = "Achillis";//calling parameters for emp2
		emp2.age = 45;
		emp2.sex = 'M';
		emp2.usCitizen= false;
		emp2.evaluation = 7;
		emp2.origin = "Greece";
		
		emp2.employeeInfo();//calling void or non-returning method for emp2
		emp2.employeeEvaluation();//calling returning method#1 for emp2
			System.out.println(" Emp2 evaluation in 10:"+7 );//method implemented
		emp2.employeeOrigin();//calling returning method#2 for emp2
		System.out.println(" Emp2 origin: "+"Greece");
			
		}	
}
