package oops3;

public interface Vehicle {
	void start();
	void move();
	void stop();
	void numberOfWheels();
	
	static void horn() {
		System.out.println("Horn...");
	}
}
