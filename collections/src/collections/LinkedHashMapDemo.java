/*
 * LinkedHashMap
 * 	1. stores key, value pair
 * 	2. maintains insertion order based on the keys
 */
package collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		hm.put("Java Full Stack", 400);
		hm.put("Python Full Stack", 400);
		hm.put("MEAN", 250);
		hm.put("MERN", 250);
		System.out.println(hm);

		hm.put("Java Full Stack", 500);
		System.out.println(hm);
		
		// giving null key
		hm.put(null, 100);
		System.out.println(hm);
	
		// giving null value
		hm.put("Angular", null);
		System.out.println(hm);

		Set<String> keySet = hm.keySet();
		System.out.println(keySet);

		Collection<Integer> values = hm.values();
		System.out.println(values);
//		System.out.println(hm.values());

		Set<Entry<String, Integer>> entrySet = hm.entrySet();
		System.out.println(entrySet);
//		System.out.println(hm.entrySet());

		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry);
		}
	}
}
