/*
 * HashSet :
 * 1. don't maintain insertion order - Unorder
 * 2. elements are inserted based on hashcode of the object
 *      Insertion order won't be maintained
 * 3. do not allow duplicates
 * 		stored unique elements     
 */
package collections;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		System.out.println(hs);

		hs.add(500);		
		hs.add(200);
		hs.add(400);		
		hs.add(300);
		hs.add(100);		
		System.out.println(hs);
		
		hs.add(100);
		hs.add(200);
		System.out.println(hs); // duplicate elements are not allowed
		
//		System.out.println(hs.get(0)); // CE : The method get(int) is undefined for the type HashSet<Integer> elements are not stored in index order
	}
}
/*
 *  String[] Geeks = GFG.toArray(new String[GFG.size()]); 
  
        // Accessing elements by index 
        System.out.println("Element at index 3 is: "
                           + Geeks[3]); 
                           
                           
      // Iterator declaration 
        int currentIndex = 0; 
  
        // Desired Index 
        int desiredIndex = 3; 
        
        for (String element :GFG) {  
          // Implementing for loop 
  
            if (currentIndex == desiredIndex) 
            { 
                System.out.println("Element at index 3 is: "+ element); 
                break; 
            } 
            currentIndex++; 
        } 
        
                              
        // Converting HashSet to ArrayList 
        List<String> list = new ArrayList<String>(GFG); 
  
        System.out.println("Element at index 3 is: "
                           + list.get(3));                       
 */
