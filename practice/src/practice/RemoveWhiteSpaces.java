package practice;

import java.util.Scanner;

public class RemoveWhiteSpaces {
	public static String removeSpace(String s) {
		return s.replaceAll("\\s+", "");
	}
	
	public static String removeSpace2(String s) {
		char[] arr = s.toCharArray();
		String str = "";
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=' ' && arr[i]!='\t') {
				str += arr[i];
			}
		}
		return str;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String str = new Scanner(System.in).nextLine();
		System.out.println(removeSpace2(str));
	}
}
