
class MultiplicationTable{
	public synchronized void printTable(int num) { // thread safety
		for(int i=1; i<=10; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));	
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class KohliThread extends Thread {
	
	private MultiplicationTable table;
	
	public KohliThread(MultiplicationTable table) {
		this.table = table;
	}

	@Override
	public void run() {
		table.printTable(18);
	}
}

class DhoniThread extends Thread {
	
	private MultiplicationTable table;
	
	public DhoniThread(MultiplicationTable table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		table.printTable(19);
	}
}

class RohitThread extends Thread {
	
	private MultiplicationTable table;
	
	public RohitThread(MultiplicationTable table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		table.printTable(20);
	}
}

public class SynchronizationDemo {
	public static void main(String[] args) {
		MultiplicationTable table = new MultiplicationTable();
		
		KohliThread kohliThread = new KohliThread(table);
		DhoniThread dhoniThread = new DhoniThread(table);
		RohitThread rohitThread = new RohitThread(table);
		
		kohliThread.start();
		dhoniThread.start();
		rohitThread.start();
	}
}

/*
 * multiple threads accessing same resource data inconsistency
 * synchronization - only 1 thread will execute at a time
 */
