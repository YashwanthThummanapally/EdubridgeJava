package java8;

interface TestString {
	boolean startsWithS(String s);
}

public class Test5 {
	public static void main(String[] args) {
		TestString t = s -> s.toLowerCase().startsWith("s");
		System.out.println(t.startsWithS("Munitha williams"));
	}
}
