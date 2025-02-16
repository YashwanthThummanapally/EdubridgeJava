package collections;

import java.util.LinkedList;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add(100);
		al.add(200);
		al.add("Java");
		al.add("Python");
		al.add(25000.0);
		al.add(35000.0);
		System.out.println(al);
		
		Object obj = al.get(0);
		int a = (int)obj;
		System.out.println(al.get(0));
		System.out.println(a);
		
		// Generic ArrayList - Type safety & avoids type casting 
		LinkedList<Integer> subjectMarks = new LinkedList<Integer>();
		subjectMarks.add(44);
		subjectMarks.add(55);
		subjectMarks.add(66);
		subjectMarks.add(77);
		subjectMarks.add(88);
		subjectMarks.add(99);
//		subjectMarks.add("Java");
		System.out.println(subjectMarks);
		Integer i = subjectMarks.get(0);
		System.out.println(i);
		
		al.clear();
		System.out.println(al.size());
		System.out.println(al);
	}
}
