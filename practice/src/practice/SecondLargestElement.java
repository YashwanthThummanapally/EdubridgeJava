package practice;

public class SecondLargestElement {	
	public static int findSecondLargest(int[] arr) {
		
		// sort
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//find second largest
		for(int i=arr.length-2; i>=0; i--) {
			if(arr[i]<arr[arr.length-1]) {
				
			}
		}
		return arr[arr.length-2];
	}
	
	public static int findSecondLargest2(int[] arr) {
		// find 1st largest
		int lar = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(lar < arr[i]) {
				lar = arr[i];
			}
		}
		
		// second largest ele greater than all ele, less than 1st largest
		int sec;// = arr[0];
		if(arr[0]!=lar) {
			sec = arr[0];
		}else {
			// assign min ele
			int min = arr[0];
			for(int i=0; i<arr.length; i++) {
				if(min > arr[i]) {
					min = arr[i];
				}
			}
			sec = min;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(sec < arr[i] && arr[i] < lar) {
				sec = arr[i];
			}
		}
		
		return sec;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,46,14,12,45,45,22,26};
		System.out.println("Second largest : "+findSecondLargest2(arr));
		
	}
}
