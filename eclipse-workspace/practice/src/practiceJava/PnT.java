package practiceJava;

public class PnT{
	
	private String stName;
	private int stID;
	private double stGrade;
	private char sex;
	private boolean usCitizen;
	
	public PnT() {
		
	}
	public PnT(String stName, int stID, double stGrade, char sex, boolean usCitizen) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.stGrade = stGrade;
		this.sex = sex;
		this.usCitizen = usCitizen;
	}
	
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStID() {
		return stID;
	}
	public void setStID(int stID) {
		this.stID = stID;
	}
	public double getStGrade() {
		return stGrade;
	}
	public void setStGrade(double stGrade) {
		this.stGrade = stGrade;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean isUsCitizen() {
		return usCitizen;
	}
	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}
	
	public static void main(String []args) {
		
		PnT sd = new PnT();
		
		sd.setStName("Achillis");
		sd.setStID(1234);
		sd.setStGrade(4.666);
		sd.setSex('M');
		sd.setUsCitizen(true);
		
		System.out.println("Student info: "+sd.getStName()+" "+sd.getStID()+" "+sd.getStGrade()+" "+sd.getSex()+" "+sd.isUsCitizen());
		
		
		PnT sd2 = new PnT("Hector", 567, 4.9999, 'M', false);
		System.out.println("Student info: "+sd2.getStName()+" "+sd2.getStID()+" "+sd2.getStGrade()+" "+sd2.getSex()+" "+sd2.isUsCitizen());
		
		
		PnT sd3 = new PnT("Afrodite", 342,4.777, 'F', true);
		System.out.println("Student info: "+sd3.getStName()+" "+sd3.getStID()+" "+sd3.getStGrade()+" "+sd3.getSex()+" "+sd3.isUsCitizen());
		
		PnT sd4 = new PnT("Pryam", 342,4.777, 'F', true);
		System.out.println("Student info: "+sd4.getStName()+" "+sd4.getStID()+" "+sd4.getStGrade()+" "+sd4.getSex()+" "+sd4.isUsCitizen());
		
	}
	
	    
	    
	
	
	
	

	
	
}