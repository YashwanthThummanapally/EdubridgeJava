/*
 * Array : To represent a group of fixed size of similar data elements
 */
public class ArraysDemo {
	public static void main(String[] args) {
		// Array Declaration;
		int[] arr1; // recommended
		int arr2[];
		int []arr3;
		
//		int[10] arr4; // Compilation Error
		
		// Arrays creation
		arr1 = new int[10]; // size is mandatory
//		arr2 = new int[-10]; // NegativeArraySizeException
		arr3 = new int[0]; // no error
		
		// Array initialization
		arr1[0] = 44;
		arr1[1] = 55;
		arr1[2] = 66;

		// Access array elements
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
//		System.out.println(arr1[10]); // ArrayIndexOutOfBoundsException
		
		// Array declaration, creation, initialization at a time
		int[] arr5 = new int[] {44,55,66,77,88};
//		int[] arr6 = new int[10] {44,55,66,77,88}; // CE
		int[] arr7 = {44,55,66,77,88};

		// find size of array
		System.out.println("Size = "+arr5.length);
		
		// Array traversal
		double[] salaries = {55000.0, 45000.0, 35000.0, 25000.0};
		
		System.out.println("Using for loop");
		for(int index=0; index<salaries.length; index++) {
			System.out.println(salaries[index]);
		}
		
		System.out.println("Using for each loop");
		for(double salary : salaries) {
			System.out.println(salary);
		}
	}
}
