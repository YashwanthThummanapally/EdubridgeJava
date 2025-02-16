package practice;

import java.util.Scanner;

public class CheckArmstrong {
	public static boolean isArmstrong(int num) {
		int temp = num;
		int count = 0; // counting number of digits
		int sum = 0; // sum of digits raised to power of number of digits
		
		while(temp!=0) {
			++count;
			temp /= 10;
		}
		
		temp = num;
		while(temp!=0) {
			int digit = temp%10;
			long res = 1;
			
			for(int i=1; i<=count; i++) {
				res *= digit;
			}
			sum += res;
			temp /= 10;
		}
		if(num==sum) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check armstron :");
		int num = sc.nextInt();
		System.out.println(isArmstrong(num));
	}
}
