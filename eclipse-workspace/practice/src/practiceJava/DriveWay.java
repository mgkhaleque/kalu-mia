package practiceJava;

public class DriveWay{
	
	public static int driveWaySize;
	
	public void setDriveWaySize(int driveWaySize) {
		this.driveWaySize = driveWaySize;
	}
	public int getDriveWaySize() {
		return driveWaySize;
	}
	
	public static void buildDriveWay() {
		System.out.println("lets build a driveway so that we can share");
	}
	
	public static void main (String []args) {
		
		DriveWay achillis = new DriveWay();
		achillis.setDriveWaySize(10);
		System.out.println("Achillis's driveway size: "+achillis.getDriveWaySize());
		
		DriveWay hector = new DriveWay();
		hector.setDriveWaySize(9);
		System.out.println("Hector's driveway size: "+ hector.getDriveWaySize());
		
		DriveWay.buildDriveWay();
		
	}
	
	
	
	
	
	
	
}