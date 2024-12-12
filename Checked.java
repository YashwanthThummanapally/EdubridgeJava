// Checked & Unchecked Exception

public class Checked{
	public static void main(String[] args) //throws InterruptedException
	{
		int x = 10;
		int y = 0;
		
		try{
			System.out.println(x/y); // unchecked exception	
		}catch(ArithmeticException e){System.out.println("Cannot divide by zero");}

		System.out.println("Hello");
		try{
			Thread.sleep(5000); // checked exception
		}catch(InterruptedException e){ System.out.println("Exception Raised!");}
		System.out.println("Java");
	}
}

// unreported expection InterruptedException : must be caught or declared to be thrown
// Exception : unexpected event which disturbs the normal execution flow of thr program