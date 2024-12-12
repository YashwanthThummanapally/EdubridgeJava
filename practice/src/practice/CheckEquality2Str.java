package practice;

import java.util.Scanner;

public class CheckEquality2Str {
	public static boolean isEqual(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string :");
		String s1 = sc.nextLine();
		System.out.println("Enter 2nd string :");
		String s2 = sc.nextLine();
		
		System.out.println(isEqual(s1, s2));
	}
}
