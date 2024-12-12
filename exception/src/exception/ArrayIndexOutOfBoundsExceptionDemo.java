package exception;

public class ArrayIndexOutOfBoundsExceptionDemo {
	public static void main(String[] args) {
		System.out.println("start");
		int[] arr = {10,20,30};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		String s = null;
		
		try {
			int i = Integer.parseInt("ab");
			System.out.println(s.charAt(0));
			System.out.println(10/0);
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No element is present");
		} catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		} catch(NullPointerException e) {
			System.out.println("String value cannot be null");
		} catch(Exception e) {
//			System.out.println(e);
			System.out.println(e.getMessage());
//			e.printStackTrace();
		} //catch(ArrayStoreException e) { // CE: Unreachable catch block for ArrayStoreException. It is already handled by the catch block for Exception
//			e.printStackTrace();
//		}
		System.out.println("end");
	}
}
/* Serializable(I)
 * 		|
 * Throwable
 * 		|
 * Exception
 * 		|
 * RuntimeException
 * 		|
 * IndexOutOfBoundsException
 * 		|
 * ArrayIndexOutOfBoundsException
 * 
 * 
 *	Serializable(I)
 * 		|
 * 	Throwable
 * 		|
 * 	Exception
 * 		|
 * 	RuntimeException
 * 		|
 * 	IllegalArgumentException
 * 			|
 *  NumberFormatException
 */
