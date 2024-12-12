/* Linked List :
 * 		**If frequent insertion and deletion operations performed on the list go with LinkedList
 * 		1. maintains insertion order
 * 		2. index based
 * 		3. allows duplicates elements
 */
package collections;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10); // appending
		ll.add(20);
		ll.add("Java");
		ll.add("Python");
		ll.add(25000.0);
		ll.add(35000.0);
		
		System.out.println(ll.size());
		System.out.println(ll);
		
		ll.add(2, "Angular"); // insertion
		System.out.println(ll.size());
		System.out.println(ll);

		Object remove = ll.remove(5); // deletion
		System.out.println(remove);
		System.out.println(ll.size());
		System.out.println(ll);
 
		Object object = ll.get(2); // access
		System.out.println(object);
		System.out.println(ll.size());
		System.out.println(ll);
	}	
}
