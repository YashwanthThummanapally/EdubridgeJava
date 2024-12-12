
public class ConditionalStatement {

	public static boolean isEven(int num) {
		boolean status = false;

		if (num % 2 == 0) {
			status = true;
		}
		return status;
	}

	public static boolean isOdd(int num) {
		boolean status = false;

		if (num % 2 != 0) {
			status = true;
		}
		return status;
	}

	public static void findEvenOrOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is Even");
		} else {
			System.out.println(num + " is Odd");
		}
	}

	/*
	 * billAmount                                discount
	 *  <100                                        0%
	 *  >100 and <=250                              5% 
	 *  >250 and <=500                              10%
	 *  >500 and <=750                              15%
	 *  >750 and <=1000                             20%
	 *  >1000                                       30%
	 */

	public static double findDiscount(double billAmount) {
		double discount = 0.0;

		if (billAmount > 100 && billAmount <= 250) {
			discount = billAmount * 0.05; // 5%
		} else if (billAmount > 250 && billAmount <= 500) {
			discount = billAmount * 0.1; // 10%
		} else if (billAmount > 500 && billAmount <= 750) {
			discount = billAmount * 0.15; // 15%
		} else if (billAmount > 750 && billAmount <= 1000) {
			discount = billAmount * 0.2; // 20%
		} else if (billAmount > 1000) {
			discount = billAmount * 0.3; // 30
		} else {
			discount = 0.0;
		}
		return discount;
	}

	public static void billGenerator(double billAmount) {
		double discount = findDiscount(billAmount);

		System.out.println("Bill Amount = " + billAmount + " Rs./-");
		System.out.println("Discount = " + discount + " Rs./-");
		System.out.println("Final Bill Amount = " + (billAmount - discount) + " Rs./-");
	}
	
	public static void calci(int num, String operation) {
		switch (operation) {
		case "square":
			System.out.println("Square of " + num + " = " + (num * num));
			break;
		case "cube":
			System.out.println("Cube of " + num + " = " + (num * num * num));
			break;
		default:
			System.out.println("Invalid operation");
		}
	}

	public static void main(String[] args) {
//		System.out.println(isEven(10));
//		System.out.println(isOdd(11));
//		System.out.println(isEven(12));
//		System.out.println(isOdd(18));
//
//		System.out.println();
//		findEvenOrOdd(10);
//		findEvenOrOdd(11);
//		findEvenOrOdd(12);

		billGenerator(12);
		
		System.out.println();
		calci(10, "abd");
	}
}
