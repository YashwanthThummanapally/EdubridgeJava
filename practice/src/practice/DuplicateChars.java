package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateChars {
	public static void findDuplicates(String s) {
		char[] arr = s.toCharArray();
		int count;
		
		for(int i=0; i<arr.length-1; i++) {
			count=1;
			for(int j=i+1; j<arr.length; j++) {
				// checking char match
				if(arr[j]!='\0' && arr[i]==arr[j]) {
					++count;
					arr[j] = '\0';
				}
			}
			if(count>1) {
				System.out.println(arr[i]+" : "+count);
			}
		}		
	}
	
	public static Map<Character, Integer> findDuplicates2(String s){
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(char c : s.toCharArray()) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c)+1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s = sc.nextLine();
//		findDuplicates(s);
		
		Map<Character,Integer> map = findDuplicates2(s);
//		System.out.println(map);
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
		}
		sc.close();
	}
}
