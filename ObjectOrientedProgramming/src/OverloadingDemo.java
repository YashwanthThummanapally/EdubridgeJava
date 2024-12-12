
class MyCalci {
	// overloaded methods
	public static int findMax(int x, int y) {
		return (x > y) ? x : y;
	}

	public static double findMax(double x, double y) {
		return (x > y) ? x : y;
	}

	public static long findMax(long x, long y) {
		return (x > y) ? x : y;
	}
}

public class OverloadingDemo {
	public static void main(String[] args) {
		System.out.println(MyCalci.findMax(78, 45));
		System.out.println(MyCalci.findMax(8.9, 6.7));
		System.out.println(MyCalci.findMax(9390851956L, 9440845081L));
	}
}

//class Test extends String{
//	
//}
