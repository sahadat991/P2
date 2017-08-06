package abstraction;

public class Car extends MotorCar implements TravelVehicle, FlyingVehicle {
	
	public void bodyShape(){
		System.out.println("The car is 6 feet long");
	}
	public void start() {
		System.out.println("it should have satrt feature in order to move the vehicle");
	}
	public void stop() {
		System.out.println("it must have break feature to stop the vehicle, public sefty is important");
	}
	
	public void electricCar(){
		System.out.println("We have electric car in next phase");
	
	}
		
	public void fly(){
		System.out.println("The car can fly");
	
	}

}