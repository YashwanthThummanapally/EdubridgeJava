/*
 * Functional interface = 1 abstract method + (static & defaultmethods) 
 */

@FunctionalInterface
public interface Printer {
	void print(); // only 1 abstract method allowed
//	void scan();
	
	// any number of default & static methods
	default void scan() {
		System.out.println("Printer scanning...");
	}
	
	static void threeDPrinting() {
		System.out.println("Printer 3D printing");
	}
}
