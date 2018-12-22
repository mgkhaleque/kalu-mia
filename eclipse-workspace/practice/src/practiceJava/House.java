package practiceJava;

public class House {
	public int houseNumber;
	public String houseName;
	
	public House(String houseName) {
		this.houseName = houseName;
		System.out.println(houseName);
		
	}
	
	public House (int houseNumber, String houseName) {
		this.houseName = houseName;
		this.houseNumber = houseNumber;
	    System.out.println(houseName + "  "+houseNumber);	
	}
	
	 public void numberOfBedRoom() {//non returning methos
		 System.out.println("there are 3 bed rooms");
	 }
	public static void main(String []args) {
		
		House Baridhara = new House(43, "Green House");
		Baridhara.numberOfBedRoom();
		
		
	}

}
