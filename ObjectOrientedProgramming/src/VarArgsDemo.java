
class FindSum {
	// Variable Length arguments
	public static void m1(int... num) {
		int sum = 0;
		for (int ele : num) {
			sum += ele;
		}
		System.out.println(sum);
	}
}

public class VarArgsDemo {
	public static void main(String[] args) {
		FindSum.m1();
		FindSum.m1(10);
		FindSum.m1(10, 20);
		FindSum.m1(10, 20, 30);
		FindSum.m1(new int[] { 1, 2, 3, 4, 5 });
	}
}
