package practiceJava;

public class StaticJV {
	int stID;
	int stAge;
	static String instructor;
	
	public void show() {
		System.out.println(stID+ " : "+stAge+ " : "+instructor);
	}
	
	public static void main(String [] args) {
		
		StaticJV achilis = new StaticJV();
		
		achilis.stID = 1234;
		achilis.stAge = 25;
		achilis.instructor = "Priaam";
		
		achilis.show();
		
		StaticJV hector = new StaticJV();
		hector.stID = 12345;
		hector.stAge = 27;
		hector.instructor = "Afrodite";
		
		hector.show();
		
		
	}

}
