package exception;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		System.out.println(10/5);
		try {
			System.out.println(10/0); 			
		}catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
		System.out.println(10/2);
	}
}
