
public class Loops {

	public static void printNumbers(int start, int end) throws InterruptedException {
		System.out.println("start...");
		while (start <= end) {
			System.out.println("Count : " + start);
			Thread.sleep(1000 * 1); // 1 sec
			start++;
		}
		System.out.println("end...");
	}

	public static void printReverse(int start, int end) {
		while (end >= start) {
			System.out.println("Count : " + end);
			end--;
		}
	}

	// print squares and cube up to the given number
	public static void printSquaresCubes(int num) {
		System.out.println("Number\tSquare\tCube");
		for (int i = 1; i <= num; i++) {
			System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
		}
	}

	public static void main(String[] args) throws InterruptedException {
//		printNumbers(1, 10);
//		printReverse(1, 10);
		printSquaresCubes(30);
	}
}
