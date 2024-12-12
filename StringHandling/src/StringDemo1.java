
public class StringDemo1 {
	public static void main(String[] args) {
		// using literal
		String s1 = "Java";
		
		// using new operator
		String s2 = new String("Python");
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = "Java";
		String s4 = new String("Python");
		
		System.out.println(s1==s3); // true
		System.out.println(s2==s4); // false
	}
}
