package exception;

public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("start");
		try {
			Object[] arr = new String[] {"56", "yuaka"};
			System.out.println(10/0);			
		} catch (ArrayStoreException e) {
			System.out.println("cannot divide by zero");
		} finally {
			System.out.println("Mandatory code");			
		}
		System.out.println("stop");
		
	}
}	
/* Throwable
 * 		|
 * Exception
 * 		|
 * InterruptedException
 */
