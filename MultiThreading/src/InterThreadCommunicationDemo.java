
class BahubaliThread extends Thread {
	// to calculate sum of 1st 100 numbers
	
	int sum = 0;
	@Override
	public void run() {
		System.out.println("BahubaliThread performs calculation");
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		synchronized(this) {
			System.out.println("BahubaliThread giving notification");
//			this.notify(); // to send notification for 1 thread	
			this.notifyAll(); // to send notification for all threads
		}
		
		System.out.println("Performs another logic");
	}
	
	// performs another logic
	
}

public class InterThreadCommunicationDemo {
	public static void main(String[] args) throws InterruptedException {
		BahubaliThread thread = new BahubaliThread();
		thread.start();

//		thread.join(); // waits for another logic to complete
//		Thread.sleep(1000); // waits for 1 sec
		
		synchronized (thread) { // waiting for BahubaliThread, so its reference
			System.out.println("Main thread is waiting");
			thread.wait();			
		}
		
		// main thread job : to print sum of 1st 100 numbers
		System.out.println("Main thread accessing sum property");
		System.out.println(thread.sum);
	}
}
