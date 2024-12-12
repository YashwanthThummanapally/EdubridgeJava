import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 1st number : ");
		int num1 = in.nextInt();

		System.out.println("Enter 2nd number :");
		int num2 = in.nextInt();
		
		int min = (num1<num2)?num1:num2;
		int max = (num1>num2)?num1:num2;
		
		System.out.println("Min value is "+min);
		System.out.println("Max value is "+max);
		
		in.close();
	}
}
