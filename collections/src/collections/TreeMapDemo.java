/*
 * TreeMap :
 * 	1. stores key and value pair
 * 	2. ordered based on the keys 
 * 	3. Null key is not allowed - NullPointerException, null values allowed
 */
package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, Integer> hm = new TreeMap<String, Integer>();
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
		
		Set<Entry<String,Integer>> entrySet = hm.entrySet();
		System.out.println(entrySet);
//		System.out.println(hm.entrySet());
		
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry);
		}
	}
}
