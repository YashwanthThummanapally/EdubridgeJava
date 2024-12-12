package exception;

public class CustomizedExceptionDemo {

	private static double balance = 5000;
	
	public static void withdraw(double amount) {
		if(amount<=balance) { // if balance is non-static : Cannot make a static reference to the non-static field balance
			balance -= amount;
			System.out.println("Collect cash");
		} else {
			throw new InsufficientBalanceException("Insufficient funds!");
		}
	}
	
	public static void checkAge(int age) throws InvalidAgeException {
		if(age>=18) {
			System.out.println("Eligible to vote");
		} else {
			throw new InvalidAgeException("Not eligible to vote");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (InvalidAgeException e) {
			System.err.println(e.getMessage());
		}
		
		withdraw(6000);
	}
}
