package java8features;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {
	public static void main(String[] args) {
		// print even numbers 
		List<Integer> list = Arrays.asList(55,44,88,99,55,66);

		// using for each loop
		System.out.println("Using for each loop");
		for(int i : list) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		// using forEach()
		System.out.println("Using forEach()");
		list.forEach(i -> {
			if(i%2==0) {
				System.out.println(i);
			}
		});
		
		// using stream API
		System.out.println("Using Stream API");
//		Predicate<Integer> predicate = i -> i%2==0; 
//		list.stream().filter(predicate).forEach(System.out::println);
		
		list.stream().filter(i -> i%2==0).forEach(System.out::println);
	}
}
