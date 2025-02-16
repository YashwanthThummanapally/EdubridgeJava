/* Vector - 1.0
 * ArrayList - 1.2
 * 
 * Vector is thread safe. All methods are synchronized, so less performance
 * ArrayList is not thread safe
 */
package collections;

import java.util.ArrayList;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList<String> courseNames = new ArrayList<String>();
		courseNames.add("Java");
		courseNames.add("Python");
		courseNames.add("Angular");
		courseNames.add("ReactJS");
		courseNames.add("Javascript");
		courseNames.add("Java"); // duplicates allowed
		courseNames.add("Angular");
		System.out.println(courseNames);
		
		String couseName = courseNames.get(4);
		System.out.println(couseName);
	}
}
