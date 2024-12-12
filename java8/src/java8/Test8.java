/*
 * @FunctionalInterface
 * public interface Predicate<T> {
 * 		boolean test(T x);
 * 	}
 */

package java8;

import java.util.function.Predicate;

public class Test8 {
	public static void main(String[] args) {
		// check name starts with R
		Predicate<String> p = s -> s.startsWith("R");
		System.out.println(p.test("Rakesh"));

		// check number is even or not
		Predicate<Integer> p2 = i -> i % 2 == 0;
		System.out.println(p2.test(88));

		// check user is admin or not
		Predicate<String> p3 = s -> s.equalsIgnoreCase("ADMIN");
		System.out.println(p3.test("admin"));

		// check eligible for voting or not
		Predicate<Integer> p4 = age -> age >= 18;
		System.out.println(p4.test(16));
		
		// vowel or not
		Predicate<Character> p5 = c -> c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
		System.out.println(p5.test('E'));
	}
}
