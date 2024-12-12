package practice;

public class StringReverseRecursion {

	public static String reverse(String s) {
		if(s==null || s.length()<=1) {
			return s;
		}
		return reverse(s.substring(1))+s.charAt(0);
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("Hello Java"));
	}
}
