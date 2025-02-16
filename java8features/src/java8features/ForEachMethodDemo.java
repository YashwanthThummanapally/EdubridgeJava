package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMethodDemo {
	public static List<Integer> filterEven(List<Integer> list){
		List<Integer> even = new ArrayList<Integer>();
		
		for(int item : list) {
			if(item%2==0) {
				even.add(item);
			}
		}
		return even;
	}
	
	public static int findSum(List<Integer> list) {
		int sum = 0;
		for(int item : list) {
			sum += item;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(55,44,88,99,55,66);
		
		System.out.println("Using for each loop");
		for(int x : list) {
			System.out.println(x);
		}
		
		System.out.println("Using forEach() method with lambda expression from java8");
//		Consumer<Integer> consumer = (element) -> System.out.println(element);
//		list.forEach(consumer);
		list.forEach(System.out :: println);
		
		System.out.println("Using forEach() method with Method references from java8");
//		Consumer<Integer> consumer2 = System.out :: println;
//		list.forEach(consumer2);		
//		list.forEach(System.out :: println);
//		list.forEach(i -> System.out.println(i));
		list.forEach(System.out::println);
		
		// filter even numbers
		System.out.println("Printing even elements");
		List<Integer> filterEven = ForEachMethodDemo.filterEven(list);
//		filterEven.forEach(i -> System.out.println(i));
		filterEven.forEach(System.out :: println);
		
		// filter even numbers and find sum of those numbers
		System.out.println("Sum of even numbers :");
		List<Integer> filterEven2 = ForEachMethodDemo.filterEven(list);
		int findSum = ForEachMethodDemo.findSum(filterEven2);
		System.out.println(findSum);
	}
}
