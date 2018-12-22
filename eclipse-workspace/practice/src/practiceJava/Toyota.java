package practiceJava;

public class Toyota implements Car {
	
	//Car
	public void start() {
		System.out.println("start the car to drice");
	}
	public void stop() {
		System.out.println("put on brake to stop the car");
	}
	
	//Toyota
	public void motorCar() {
		System.out.println("implement motor engine");
	}
	//HybridCar
	public void electricBattery() {
		System.out.println("implement electic battery engine");
	}
	
	//MotorCar
	public void fourWheelCar() {
		System.out.println("implement four Wheel drive");
	}
}
