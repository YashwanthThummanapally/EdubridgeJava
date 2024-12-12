package oops3;

public abstract class MyVehicle implements Vehicle {
	
	@Override
	public void start() { // if modifier changed to default/protected/private : Cannot reduce the visibility of inherited method
		System.out.println("vehicle start...");
	}
	
	@Override
	public void move() {
		System.out.println("vehicle move...");
	}
	
	static void horn() {}
	
	@Override
	public abstract void stop(); // the Type must be a abstract class to define abstract methods
	
	@Override
	public abstract void numberOfWheels(); // the Type must be a abstract class to define abstract methods
}
