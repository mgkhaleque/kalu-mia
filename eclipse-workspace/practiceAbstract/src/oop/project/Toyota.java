package oop.project;

public class Toyota extends MotorCar implements Car {
	
	//Car
	public void start() {
		System.out.println("start the car to drive");
	}
	public void stop() {
		System.out.println("put on brake to stop the car");
	}
	
	//Toyota
	public void motorCar() {
		System.out.println("implement motor engine to drive the car");
	}
	
	//MotorCar
	public void fourWheelCar() {
		System.out.println("implement fourWheelDrive");
		
	}
	//HybridCar
	public void electricBattery() {
		System.out.println("implement hybrid battery to run engine");
	}

}
