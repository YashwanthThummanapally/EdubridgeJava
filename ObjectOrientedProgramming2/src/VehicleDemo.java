
public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle vehicle = new Bike();
		Vehicle.fillFuel();
		vehicle.start();
		vehicle.move();
		vehicle.horn();
		vehicle.stop();
		vehicle.meter();
		
		System.out.println("------------");
		
		vehicle = new Auto();
		Vehicle.fillFuel();
		vehicle.start();
		vehicle.move();
		vehicle.horn();
		vehicle.stop();
		vehicle.meter();
//		vehicle.fillFuel();
		
		System.out.println("----------------");
		
		vehicle = new Car();
		Vehicle.fillFuel();
		vehicle.start();
		vehicle.move();
		vehicle.horn();
		vehicle.stop();
	}
}
