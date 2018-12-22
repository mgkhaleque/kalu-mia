package practiceJava;

public class AddSubt{
	
	int a = 70;
	int b = 130;
	int c = a+b;
	int d = b-a;
	
	public void add() {
		System.out.println(c);
	}
	public String subt() {
		System.out.println(d);
		return "anything";
	}
	
	
	public static void main(String [] args) {
		
		AddSubt ca = new AddSubt();
		ca.add();
		ca.subt();
	}
	
	
}