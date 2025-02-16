/*
 * TreeSet
 * 		1. maintains ordered sequence of elements
 * 		2. stores unique elements 
 * 		3. not index based
 */
package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
//		TreeSet<Integer> hs = new TreeSet<Integer>();
		TreeSet<Integer> hs = new TreeSet<Integer>(Comparator.reverseOrder());
		System.out.println(hs);

		hs.add(400);
		hs.add(200);
		hs.add(100);
		hs.add(300);
		hs.add(500);
		System.out.println(hs);

		hs.add(100);
		hs.add(200);
		System.out.println(hs); // duplicate elements are not allowed

//		System.out.println(hs.get(0)); // CE : The method get(int) is undefined for the type TreeSet<Integer> -
										// elements are not stored in index order

//		TreeSet<String> ts = new TreeSet<String>();
		TreeSet<String> ts = new TreeSet<String>(Comparator.reverseOrder());
		ts.add("Java");
		ts.add("Angular");
		ts.add("Python");
		ts.add("React");
		System.out.println(ts);

		// traversal
		for (String course : ts) {
			System.out.println(course);
		}

		for (int price : hs) {
			System.out.println(price);
		}
	}
}
