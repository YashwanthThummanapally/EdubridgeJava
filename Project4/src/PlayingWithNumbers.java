import java.util.Scanner;

public class PlayingWithNumbers {

	public static int findSumOfDigits(int n) {
		int sum = 0;
		while(n!=0) {
			sum += n%10;
			n/= 10;
		}
		return sum;
	}
	
	public static int findReverse(int n) {
		int reverse = 0;
		while(n!=0) {
			reverse = reverse*10+n%10;
			n /= 10;
		}
		return reverse;
	}
	
	public static int countDigits(int n) {
		int count = 0;
		while(n!=0) {
			++count;
			n /= 10; 
		}
		return count;
	}
	
	public static void printReq(int n) {
		int sum = 0, count = 0, reverse = 0;
		while(n!=0) {
			sum += n%10;
			reverse = reverse*10+n%10;
			++count;
			
			n /= 10;
		}
		System.out.println("Sum = "+sum);
		System.out.println("Reverse = "+reverse);
		System.out.println("Count Digits = "+count);
	}
	
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number :");
		int nextInt = in.nextInt();
//		System.out.println("Sum = "+findSumOfDigits(nextInt));
//		System.out.println("Reverse = "+findReverse(nextInt));
//		System.out.println("Count Digits = "+countDigits(nextInt));
		printReq(nextInt);
	}
}
