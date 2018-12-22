package oop.polymorphismOverloading;

public class TestLand {

	public static void main(String[] args) {
		LandCalculator cal = new LandCalculator();
		System.out.println(cal.areaOfLand(10, 15));
		System.out.println(cal.areaOfLand(15, 20, 25));
		System.out.println(cal.areaOfLand(30, 35, 40, 45));
		System.out.println(cal.areaOfLand(20, 22, 24, "Gulshan"));
		

	}

}
