package encapsulationTest1;

public class Student {
	
	private String stName;
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
	public String getStDOB() {
		return StDOB;
	}
	public void setStDOB(String stDOB) {
		StDOB = stDOB;
	}
	private int stID;
	private String StDOB;
	
}
