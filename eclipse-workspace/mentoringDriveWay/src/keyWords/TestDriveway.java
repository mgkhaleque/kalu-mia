package keyWords;

public class TestDriveway {

	public static void main(String[] args) {
		DriveWay tofael = new DriveWay();
		tofael.setDriveWaySize(6);
		System.out.println( "Tofael's drive way size: " +tofael.getDriveWaySize());
		
		DriveWay arif = new DriveWay();
		arif.setDriveWaySize(7);
		System.out.println(" Arif's drive way size: " + arif.getDriveWaySize());
		
		
        System.out.println( "Tofael's driveway size: " + tofael.getDriveWaySize());
        int totalSize = tofael.getDriveWaySize() + arif.getDriveWaySize();
        System.out.println(totalSize);
        DriveWay.buildDriveWay();
	}

}
