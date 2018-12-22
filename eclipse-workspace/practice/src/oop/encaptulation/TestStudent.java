package oop.encaptulation;

public class TestStudent {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.setStName("Hector");
		st1.setStID(234);
		st1.setStDOB("12-01-18");
		System.out.println(st1.getStName()+ " "+st1.getStID()+ " " +st1.getStDOB());
		
		Student st2 = new Student();
		st2.setStName("Pryam");
		st2.setStID(1234);
		st2.setStDOB("12-01-18");
		System.out.println(st2.getStName()+ " "+st2.getStID()+ " "+st2.getStDOB());
		
		
	}

}
