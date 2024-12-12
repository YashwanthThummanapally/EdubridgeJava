
public interface Vehicle {
	public abstract void start();
	public abstract void move();
	public abstract void stop();
	public abstract void horn();
	
	public default void meter() {
		System.out.println("Calculates price based on the distance");
	}
	
	static void fillFuel() {
		System.out.println("Fill petrol/diesel as fuel");
	}
}
