package classNobject;

public class TestStudent{

public static void main(String [] args) {//opening curly brace/main method
	
	Student std1 = new Student();//ref variable
	std1.fullName = "Hasan"; //variable initialized
	std1.age = 19;
	std1.sex = 'M';
	std1.bdCitizen = true;
	std1.studentInfo();//variable initialized
	std1.studentEvaluation();
	System.out.println("std evaluation in 11: "+9);
	std1.studentOrigin();
	System.out.println(" student orgin: "+"Bangladesh");
	
	Student std2 = new Student();
	std2.fullName = "Harun";
	std2.age = 17;
	std2.sex = 'M';
	std2.studentInfo();
	
}
	
	
	
	
}//closing curly brace


