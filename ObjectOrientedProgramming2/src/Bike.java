
public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Bike started...");
	}

	@Override
	public void move() {
		System.out.println("Bike is moving...");
	}

	@Override
	public void stop() {
		System.out.println("Bike stopped...");
	}

	@Override
	public void horn() {
		System.out.println("Bike is blowing horn...");
	}
	
	
	@Override
	public void meter() {
		System.out.println("Meter attached to bike to check how much distance travelled");
	}
}
