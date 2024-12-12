/*
 * LinkedHashSet
 * 1. maintains insertion order
 * 2. stores unique elements
 * 3. not index based
 */
package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		System.out.println(hs);
		
		hs.add(100);
		hs.add(400);
		hs.add(500);
		hs.add(200);
		hs.add(300);
		System.out.println(hs);
		
		hs.add(100);
		hs.add(200);
		System.out.println(hs); // duplicate elements are not allowed
	
//		System.out.println(hs.get(0)); // CE : The method get(int) is undefined for the type LinkedHashSet<Integer> - elements are not stored in index order
	}
}