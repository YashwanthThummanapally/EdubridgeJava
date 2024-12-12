import java.util.Scanner;

public class StringUpperToLowerViceVersa {
	public static String convert(String str) {
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			char c = arr[i];
			if(c>='a' && c<='z') {
				arr[i] -= 32;
			}
			else if(c>='A' && c<='Z') {
				arr[i] += 32; 
			}
		}
		return new String(arr);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a string :");
		String str = new Scanner(System.in).nextLine();
		System.out.println(convert(str));
	}
}
