package practiceJava;

public class SeleniumNov18 {
	int stID;
	int stAge;
	static String instructor;
	
	public void show() {
		System.out.println(stID+ " : "+stAge+ " : "+instructor);
	}
	
	public static void main(String []args) {
		SeleniumNov18 maxim = new SeleniumNov18();
		maxim.stID = 1234;
		maxim.stAge = 25;
		maxim.instructor = "Mafi";
		
		maxim.show();
	}

}
