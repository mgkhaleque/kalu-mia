package superExample;

public abstract class Parents{
	
	String familyName = "Bush";
	
	public Parents () {
		System.out.println("This is from superClass constractor");
	}
	public Parents(String familyName) {
		this.familyName = familyName;
		System.out.println("This is from superClass constractor"+familyName);
	}
	
	public void height() {
		System.out.println("Average height");
	}
	
	
	
	
	
	
	
	
}