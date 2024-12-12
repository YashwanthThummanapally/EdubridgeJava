
public interface Calci {
	public static final double PI_VALUE = 3.14;
//	static {
//		PI_VALUE = 9.0;
//	} // CE - Interface cannot define an initializer

	public abstract int sum(int a, int b);

	public abstract int sub(int x, int y);

	public abstract int mul(int x, int y);

	public abstract int div(int x, int y);
//	public abstract int findSquare(int x);
//	public abstract int findCube(int x);

	// from java 8
	public default int findSquare(int x) {
		return x * x;
	}

	public default int findCube(int x) {
		return findSquare(x) * x;
	}

	public static int doubleIt(int a) {
		return a+a;
	}
}
