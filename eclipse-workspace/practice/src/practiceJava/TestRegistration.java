package practiceJava;

public class TestRegistration {

	public static void main(String[] args) {
		
		//5 days later
		Registration newuser1 = new Registration("Mary");
		System.out.println(newuser1.putUsernameDatabase()
				+ "username created and entered into database");
		
		//one hour later
		
		Registration newuser2 = new Registration("Mark");
		System.out.println(newuser2.putUsernameDatabase()
				+ "newuser2 created and entered into database");
		
		//Next day
		System.out.println(Registration.getUsernameCount());
		
		//2 years later
		
        Registration newuser3 = new Registration("Achillis");
        System.out.println(newuser3.putUsernameDatabase()
        		+ "newuser3 created and entered into database");
        
        //Next day
        System.out.println(Registration.getUsernameCount());
	}

}
