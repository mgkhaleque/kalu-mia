package practiceJava;

public class SelNov{
	int stID;
	int stAge;
	String instructor;
	
	
	public void bring() {
		System.out.println(stID+ " : "+stAge+ " : "+instructor);
		
	}
	
	public static void main(String [] args) {
		
		SelNov ekthiandar = new SelNov();
			ekthiandar.stID = 38;
			ekthiandar.stAge = 25;
			ekthiandar.instructor = "Agamemnon";
			
			ekthiandar.bring();
			
		SelNov maximGorki = new SelNov();
		maximGorki.stID = 54;
		maximGorki.stAge = 24;
		maximGorki.instructor = "BradPit";
		
		maximGorki.bring();
		
		
		
	}
	
	
}