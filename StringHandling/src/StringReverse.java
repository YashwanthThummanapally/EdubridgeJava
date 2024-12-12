
public class StringReverse {
	public static String reverse(String s) {
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev += s.charAt(i);
		}
		return rev;
	}
	
	public static String reverse2(String s) {
		char[] arr = s.toCharArray();
		
		for(int i=0; i<arr.length/2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		return new String(arr);
	}
	
	public static String reverse3(String s) {
		String rev = "";
		for(int i=0; i<s.length(); i++) {
			rev = s.charAt(i)+rev;
		}
		return rev;
	}
	
	// recursion
	public static void reverse4(String s, int index) {
		if(index<s.length()) {
			reverse4(s, ++index);
		}
		System.out.print(s.charAt(index));
	}
	
	public static void main(String[] args) {
		reverse4("HelloJava",0);
	}
}
