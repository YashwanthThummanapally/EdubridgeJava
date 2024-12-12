
public class MethodDemo {

	public static int findSum(int x, int y) {
		return x + y;
	}

	public static double findMax(double num1, double num2) {
		return (num1 > num2) ? num1 : num2;
	}

	public static void greet() {
		System.out.println("Hello this is greet method");
	}

	public static void main(String[] args) {
		System.out.println("The max ele is " + findMax(124.23, 167.21));
		greet();
		System.out.println("Sum is " + findSum(121, 321));
	}
}
