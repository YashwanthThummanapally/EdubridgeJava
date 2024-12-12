
public class Auto implements Vehicle {

	@Override
	public void start() {
		System.out.println("Auto started...");
	}

	@Override
	public void move() {
		System.out.println("Auto is moving...");
	}

	@Override
	public void stop() {
		System.out.println("Auto is stopped...");
	}

	@Override
	public void horn() {
		System.out.println("Auto is blowing horn...");
	}
	
	static void fillFuel() {
		
	}
}
