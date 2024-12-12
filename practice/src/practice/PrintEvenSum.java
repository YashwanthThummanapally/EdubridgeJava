package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintEvenSum {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(66, 33, 77, 44, 55, 99);

		// using for each loop
		int sum = 0;
		for (Integer item : list) {
			if (item % 2 == 0) {
				sum += item;
			}
		}
		System.out.println(sum);
		
		//using forEach()
		list.forEach(new Consumer<Integer>() {
			int sum = 0;
			@Override
			public void accept(Integer t) {
				if(t%2==0) {
					sum += t;
				}
				System.out.println(sum);
			}
		});
		
		
		list.forEach(i -> {
			int total = 0;
			if(i%2==0) {
				total += i;
			}
		});
	}
}
