package testEmployees;


public class Constructor{
	
	String fullName;
	int salary;
	
	
	
	public Constructor() {
		System.out.println("this is from default constructor");
	}
	
	public Constructor(String fullName) {
		this.fullName = fullName;
		System.out.println(fullName);
	}
}