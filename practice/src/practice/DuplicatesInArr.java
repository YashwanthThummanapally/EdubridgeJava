package practice;

import java.util.Scanner;

public class DuplicatesInArr {
	public static void findDuplicates(int[] arr) {
		int count;
		for(int i=0; i<arr.length-1; i++) {
			count=1;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]!='\0' && arr[i]==arr[j]) {
					++count;
					arr[j] = '\0';
				}
			}
			if(count>1) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of ele :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements :");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		findDuplicates(arr);
	}
}
