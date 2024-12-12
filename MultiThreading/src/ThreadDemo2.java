
class MyThread extends Thread{
	
}

public class ThreadDemo2 {
	public static void main(String[] args) {
		System.out.println("Main start");
		MyThread myThread = new MyThread();
		myThread.start();
		myThread.start();
		System.out.println("Main end");
	}
}
