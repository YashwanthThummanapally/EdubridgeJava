/*
 * if body has no business logic, but calls another method
 */
package java8features;

@FunctionalInterface
interface Printer {
	void print();
}

public class MethodReferenceDemo {
	public static void beginPrintJob() {
		System.out.println("print job begins...");
	}

	public void startPrintJob() {
		System.out.println("print job begins...");
	}

	public static void main(String[] args) {
		Printer p1 = () ->  MethodReferenceDemo.beginPrintJob();
		p1.print();
		
		// Method reference with static method
		Printer p2 = MethodReferenceDemo :: beginPrintJob;
		p2.print();
		
		Printer p3 = () -> new MethodReferenceDemo().startPrintJob();
		p3.print();
		
		// Method reference with instance method
		Printer p4 = new MethodReferenceDemo() :: startPrintJob;
		p4.print();
	} 
}
