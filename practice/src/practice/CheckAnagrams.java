package practice;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] arr1 = a.replaceAll(" ", "").toLowerCase().toCharArray();
        char[] arr2 = b.replaceAll(" ", "").toLowerCase().toCharArray();
                
        if(arr1.length!=arr2.length) {
        	return false;
        }
        // sort
        for(int i=0; i<arr1.length-1; i++){
            for(int j=i+1; j<arr1.length; j++){
                if(arr1[i] > arr1[j]){
                    char temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
                if(arr2[i] > arr2[j]){
                    char temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }        
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
// TAB - BAT ABT tab

