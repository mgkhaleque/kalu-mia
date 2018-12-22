package practiceJava;
/**
 * 
 * @author zibonibrahim
 *
 */
public class Registration {

	public String usernameA;//object or instance variable
	public static int usernameCount = 0;//static variable 2 
	
	public Registration(String A) {
		
		usernameA  = A;
		usernameCount++;	
	}
	public String putUsernameDatabase() {//retrun method
		return usernameA;
		//put that username into our db
	}
	
	public static int getUsernameCount() {//static method
		return usernameCount;
	}
	
	
	
}
