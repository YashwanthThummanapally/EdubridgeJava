package oops3;

public class Bike extends MyVehicle { // This type must implement inherited abstract methods

	@Override
	public void stop() {
		System.out.println("Bike stop...");
	}

	@Override
	public void numberOfWheels() {
		System.out.println("2 wheels");
	}
	
}
