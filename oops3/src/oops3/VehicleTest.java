package oops3;

public class VehicleTest {
	public static void main(String[] args) {
//		new MyVehicle(); // cannot instantiate abstract class
		MyVehicle vehicle = new Bike();
		vehicle.start();
		vehicle.move();
		vehicle.stop();
		vehicle.numberOfWheels();
		
		System.out.println("-----------");
		
		vehicle = new Car();
		vehicle.start();
		vehicle.move();
		vehicle.stop();
		vehicle.numberOfWheels();
	}
}
