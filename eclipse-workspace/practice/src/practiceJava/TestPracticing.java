package practiceJava;

public class TestPracticing {

	public static void main(String []args) {//main method
		
		//creating object
		Practicing emp1 = new Practicing();
		
		emp1.fullName = "Samuel LangHorn Clemence";//initialized variables
		emp1.salary = 380000;
		emp1.sex = 'M';
		emp1.usCitizen = true;
		emp1.evaluation = 7;
		emp1.origin = "UnitedStates";
		
		emp1.employeeInfo();//calling method
		
		emp1.employeeEvaluation();//calling returning method
		System.out.println("Emp evaluation in 10: "+7);//returning method implemented
		
		emp1.employeeOrigin();
		System.out.println("Emp origin: "+"UnitedStates");
		
		Practicing emp2 = new Practicing();//creating objective for emp2
		emp2.fullName = "Achillis";
		emp2.salary = 370000;
		emp2.sex = 'M';
		emp2.usCitizen = false;
		emp2.evaluation = 6;
		emp2.origin = "Greece";
		
		emp2.employeeInfo();
		
		emp2.employeeEvaluation();
		System.out.println("Emp evaluation in 10: "+6);
		emp2.employeeOrigin();
		System.out.println("Emp origin: "+ "Grecce");
		
		
		
		
	}
}
