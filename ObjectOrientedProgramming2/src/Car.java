
public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car started...");
	}

	@Override
	public void move() {
		System.out.println("Car is moving...");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped...");
	}

	@Override
	public void horn() {
		System.out.println("Car is blowing horn...");
	}

}
