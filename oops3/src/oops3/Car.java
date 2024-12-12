package oops3;

public class Car extends MyVehicle{

	@Override
	public void stop() {
		System.out.println("Car stop...");
	}

	@Override
	public void numberOfWheels() {
		System.out.println("4 wheels");
	}

}
