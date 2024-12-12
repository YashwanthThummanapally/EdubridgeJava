import java.util.Scanner;

public class MyATMApp {
	static double balance = 5000.0;
	static int pin = 5252;

	public static boolean authenticate(int pinValue) {
		if (pinValue == pin) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int option = 0;
		int pin = 0;

		do {
			System.out.println("ATM Appliation");
			System.out.println("--------------");
			System.out.println("1. Balance Check");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdraw Amount");
			System.out.println("0. Exit");
			System.out.println("Plese select a option");
			option = in.nextInt();

			switch (option) {
			case 1:
				// authenticate
				System.out.println("Enter Pin :");
				pin = in.nextInt();
				if (authenticate(pin)) {
					// show balance
					System.out.println("Balance : " + balance);
				} else {
					System.out.println("Invalid pin");
				}
				break;
			case 2:
				// enter amount
				System.out.println("Enter deposit amount :");
				double depositAmount = in.nextDouble();

				// authenticate
				System.out.println("Enter pin :");
				pin = in.nextInt();
				if (authenticate(pin)) {
					// deposit
					balance += depositAmount;
					System.out.println("Amount deposited successfully!");
				} else {
					System.out.println("Invalid pin");
				}
				break;
			case 3:
				// enter amount
				System.out.println("Enter withdraw amount :");
				double withdrawAmount = in.nextDouble();

				// authenticate
				System.out.println("Enter pin :");
				pin = in.nextInt();
				if (authenticate(pin)) {
					// withdraw
					balance -= withdrawAmount;
					System.out.println("Withdraw successfull!");
				} else {
					System.out.println("Invalid pin");
				}
				break;
			case 0:
				System.out.println("Thankyou, Have a nice day! Visit Again");
				System.exit(0); // terminate JVM
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (option != 0);
	}
}
