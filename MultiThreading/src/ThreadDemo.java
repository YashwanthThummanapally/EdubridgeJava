
class Programming {
	public void coding() {
		System.out.println("coding is fun...");
	}
}


// creating user defined thread using Thread class
class JavaThread extends Thread //, Programming 
{
	@Override
	public void run() //throws InterruptedException{ // Exception InterruptedException is not compatible with throws clause in Thread.run()
	{
		// define thread job
		for(int i=1; i<=5; i++) {
			System.out.println("Java "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // Unhandled exception type InterruptedException
		}
	}
}

// creating user defined thread using Runnable interface
class PythonThread extends Programming implements Runnable { // implementing Runnable is recommended

	@Override
	public void run() //throws InterruptedException { // Exception InterruptedException is not compatible with throws clause in Runnable.run()
	{
		for(int i=1; i<=5; i++) {
			System.out.println("Python "+i);
			try {
				Thread.sleep(1000);				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // The type PythonThread must implement the inherited abstract method Runnable.run()
	
}

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		JavaThread javaThread = new JavaThread();
		javaThread.start(); // begin thread execution
//		javaThread.run(); // new thread wont be created
//		javaThread.join(); // linear execution of thread // throws InterruptedException
		javaThread.join(2000);
		
		PythonThread pythonThread = new PythonThread();
//		pythonThread.start(); // The method start() is undefined for the type PythonThread
		Thread thread = new Thread(pythonThread);
		thread.start();	
		thread.join();
		
		// main thread job
		for(int i=1; i<=5; i++) {
			System.out.println("Main "+i);
			Thread.sleep(1000);
		}
	}
}
