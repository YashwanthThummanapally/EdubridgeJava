package exception;

// Unchecked exception
public class InsufficientBalanceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException() {
		super();
	}
	
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
