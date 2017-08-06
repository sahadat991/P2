package abstraction;

public class Testcar {

	public static void main(String[] args) {
		
		TravelVehicle travelVehicle = new Car();
		travelVehicle.start();
		travelVehicle.stop();
		
		MotorCar motorCar = new Car();
		motorCar.engine();
		motorCar.electricCar();
		
		Car toyota = new Car();
		toyota.bodyShape();
		
	}

}
