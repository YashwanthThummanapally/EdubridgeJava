/*
 * Limitations of array :
 * 		1. Fixed size
 * 		2. insertions and deletions less effective
 * 		3. no build in methods
 * 
 * ArrayList :
 * 		1. maintains insertion order
 * 		2. index based
 * 		3. duplicates allowed
 */

package collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al.size());
		System.out.println(al);
		
		al.add(100); // appending
		al.add(200);
		System.out.println(al.size());
		System.out.println(al);
		
		al.add("Java");
		al.add("Python");
		System.out.println(al.size());
		System.out.println(al);
		
		al.add(2, "Angular"); // insertion
		System.out.println(al.size());
		System.out.println(al);
		
		al.set(0, 1000); // updating
		System.out.println(al.size());
		System.out.println(al);
		
		Object remove = al.remove(0); // deletion
		System.out.println(remove);
		System.out.println(al.size());
		System.out.println(al);

		System.out.println(al.get(0)); // access ele at index 0
		System.out.println(al.get(2));
		System.out.println(al.get(al.size()-1)); // accessing last ele
//		System.out.println(al.get(4)); //  java.lang.IndexOutOfBoundsException:
		
		al.clear();
		System.out.println(al.size());
		System.out.println(al);
	}
}
