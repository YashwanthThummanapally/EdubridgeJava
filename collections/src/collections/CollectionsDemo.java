package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(55,44,88,99,77,66);
		System.out.println(list);
		
//		Collections.sort(list);
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		int[] arr = {55,88,44,99,77,66};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr)); // converting array object to String representation
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int i = Arrays.binarySearch(arr, 55);
		System.out.println(i);
		System.out.println(Arrays.binarySearch(arr, 67));
	}
}
