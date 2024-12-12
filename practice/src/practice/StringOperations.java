package practice;

public class StringOperations {
	public static void doLenghtSum(String s1, String s2) {
		System.out.println(s1.length() + s2.length());
	}

	public static void isLexicographicallyGreater(String s1, String s2) {
		if (s1.compareTo(s2) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static void firstLetterCapital(String s1, String s2) {
		System.out.println(s1.substring(0, 1).toUpperCase() + s1.substring(1) + " " + s2.substring(0, 1).toUpperCase()
				+ s2.substring(1));
	}

	public static void main(String[] args) {
		doLenghtSum("hello", "java");
		isLexicographicallyGreater("hello", "java");
		firstLetterCapital("hello", "java");
	}
}
