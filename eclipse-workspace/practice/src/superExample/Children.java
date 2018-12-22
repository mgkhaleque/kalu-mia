package superExample;

public class Children extends Parents{
	
	public Children () {
		//super ();
		super("Bush");
	}
	
	public void shapeNHeight() {
		System.out.println(super.familyName);
		super.height();
		System.out.println("Average shape");
	}
	
	
}