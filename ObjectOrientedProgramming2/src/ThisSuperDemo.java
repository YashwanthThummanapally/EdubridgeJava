class Upper {
	int a = 10;
	int b = 20;
	int i = 15;

	public Upper() {
//		this(); // CE
		this(10);
		System.out.println("0-Upper.Upper()");
	}

	public Upper(int a) {
		this(a, 20);
		System.out.println("1-Upper.Upper()");
//		this(10,20); // CE
	}

	public Upper(int a, int b) {
//		this(); // CE
		System.out.println("2-Upper.Upper()");
	}

	public void m1() {
		System.out.println("Java");
	}
}

class Lower extends Upper {
	int a = 100;
	int b = 200;
	int j = 20;

	public Lower() {
		super();
//		super(10);
//		super(10,20);
		System.out.println("0-Lower.Lower()");
	}

	public void add(int a, int b) {
		System.out.println(a + b);
		System.out.println(this.a + this.b);
		System.out.println(super.a + super.b);

		System.out.println(i);
		System.out.println(super.i);
		System.out.println(this.i);

		System.out.println(j);
		System.out.println(this.j);
//		System.out.println(super.j); // CE
	}

	public void m1() {
		System.out.println("Python");
	}

	public void m2() {
		m1();
		this.m1();
		super.m1();
	}
}

public class ThisSuperDemo {
	public static void main(String[] args) {
		Lower lower = new Lower();
		lower.add(1000, 2000);
		lower.m2();
	}
}
