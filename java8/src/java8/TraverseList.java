package java8;

import java.util.Collections;
import java.util.Vector;

public class TraverseList {
	public static void main(String[] args) {
		Vector<String> fruits = new Vector<String>();
		fruits.add("Mango");
		fruits.add("Guava");
		fruits.add("Apple");
		fruits.add("Pomegranate");
		fruits.add("Banana");
		fruits.add("Kiwi");
		fruits.add("Orange");
		fruits.add("Dragon fruit");
		fruits.add("Sapota");
		fruits.add("Papaya");
		fruits.add("Muskmilan");
		fruits.add("Grape");
		fruits.add("Watermilon");
		fruits.add("Custurdapple");
		
		Collections.sort(fruits);

		System.out.println("------Iterate using ordinary for loop----------");
		for(int i=0; i<fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
	}
}
