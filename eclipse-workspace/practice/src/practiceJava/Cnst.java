package practiceJava;

public class Cnst{
	
	String fullName;
	int salary;
	char sex;
	boolean usCitizen;
	
	
	public Cnst() {
		System.out.println("this is from default/non-argument constructor");
	}
	
	public Cnst(String fullName) {
		this.fullName = fullName;
		System.out.println(fullName);
	}
	
	
	public Cnst(String fullName, int salary, char sex, boolean usCitizen) {
		this.fullName = fullName;
		this.salary = salary;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(fullName + " " + salary + " " + sex + " " + usCitizen);
	}
	
	public static void main (String []args) {
		
		Cnst emp1 = new Cnst();
		Cnst emp2 = new Cnst("Achillis");
		Cnst emp3 = new Cnst ("Hector", 123, 'M', true);
	}
	
	
	
	
	
}