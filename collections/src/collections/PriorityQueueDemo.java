/*
 * FIFO - First In First Out
 */
package collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		System.out.println(q.isEmpty());
		
		q.offer(100);
		q.offer(200);
		q.offer(300);
		q.offer(400);
		q.offer(500);
		System.out.println(q);
		
		System.out.println(q.poll()); // retrieve and remove ele
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
	}
}
