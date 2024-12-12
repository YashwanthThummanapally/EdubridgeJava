package practice;

public class RemoveDuplicatesUniqueVowels {
	public static void main(String[] args) {
		String s = "Heleleeo Worlood".toLowerCase();
		char[] arr = s.toCharArray();
		int length = s.length();

		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					for (int k = j; k < length - 1; k++) {
						arr[k] = arr[k + 1];
					}
					--length;
					--j;
				}
			}
		}

		for (int i = 0; i < length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				System.out.println(arr[i]);
			}
		}
	}
}
