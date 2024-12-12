
public class SelectionSort {
	public static int[] sortAsc(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] sortDesc(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void traverse(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 3, 7, 4, 1, 6 };
		traverse(arr);
		sortAsc(arr);
		traverse(arr);
	}
}
