package oop.project;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Toyota();
		car.fourWheelCar();
		car.start();
		car.stop();
		
		Toyota camry = new Toyota();
		camry.electricBattery();
		camry.fourWheelCar();
		camry.motorCar();
		camry.oilMotorEngine();
		camry.start();
		camry.stop();
		
		MotorCar hybridCar = new Toyota();
		hybridCar.fourWheelCar();
		hybridCar.oilMotorEngine();
		hybridCar.start();
		hybridCar.stop();
		
		
		
		
		

	}

}
