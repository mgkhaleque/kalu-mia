package practiceJava;

public class Cnst2{
	String fullName;
	int salary;
	int age;
	char sex;
	boolean usCitizen;
	
	public Cnst2() {
		System.out.println("This is from default constructor");
	}
	public Cnst2(String fullName) {
		this.fullName = fullName;
		System.out.println(fullName);
	}
	public Cnst2(String fullName, int salary, int age, char sex, boolean usCitizen) {
		this.fullName = fullName;
		this.salary = salary;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(fullName+ " "+salary+ " "+age+ " "+sex+ " "+usCitizen);
		
		
		
	}
}