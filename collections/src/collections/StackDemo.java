/*
 * Based on LIFO - Last In First Out
 */
package collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		System.out.println(s.isEmpty());
		
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.isEmpty());
	}
}
