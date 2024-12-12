package java8;

import java.util.function.BiFunction;

public class Test14 {
	public static void main(String[] args) {
		// concatenate 2 strings
		BiFunction<String, String, String> concat = (s1,s2) -> s1.concat(s2);
		System.out.println(concat.apply("Pink", "Panther"));
	}
}
