/*
 * BiPredicate:
 * @FunctionalInterface
 * public interface BiPredicate<T,U>{
 * 		boolean test(T x, U y);
 * 	}
 */
package java8;

import java.util.function.BiPredicate;

public class Test12 {
	public static void main(String[] args) {
		// check 2 strings equal or not
		BiPredicate<String, String> b1 = (s1, s2) -> s1.equalsIgnoreCase(s2); // String::equalsIgnoreCase
		System.out.println(b1.test("HellO", "hello"));

		// check string length
		BiPredicate<String, Integer> b2 = (s, i) -> s.length() == i;
		System.out.println(b2.test("Hari", 4));

		// check sum of 2 integers is even
		BiPredicate<Integer, Integer> b3 = (num1, num2) -> (num1 + num2) % 2 == 0;
		System.out.println(b3.test(4, 7));
	}
}
