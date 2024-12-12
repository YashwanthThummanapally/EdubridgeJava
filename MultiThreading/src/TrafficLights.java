
class RedLight implements Runnable {

	@Override
	public void run() {
		System.out.println("Red light");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
}

class YellowLight extends Thread {
	@Override
	public void run() {
		System.out.println("Yellow light");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class GreenLight implements Runnable {

	@Override
	public void run() {
		System.out.println("Green light");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class TrafficLights {
	public static void main(String[] args) throws InterruptedException {
		while(true) {
			RedLight redLight = new RedLight();
			Thread thread1 = new Thread(redLight);
			thread1.start();
			thread1.join();
			
			YellowLight yellowLight = new YellowLight();
			yellowLight.start();
			yellowLight.join();
			
			GreenLight greenLight = new GreenLight();
			Thread thread2 = new Thread(greenLight);
			thread2.start();
			thread2.join();
		}
	}
}
