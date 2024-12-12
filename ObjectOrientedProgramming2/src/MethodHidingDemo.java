class Super{
	public static void study() {
		System.out.println("Medicine");
	}
}

class Sub extends Super{
	public static void study() {
		System.out.println("Acting");
	}
}
public class MethodHidingDemo {
	public static void main(String[] args) {
		Super super1 = new Super();
		super1.study();
		
		Sub sub = new Sub();
		sub.study();
		
		Super sub2 = new Sub();
		sub2.study(); // compile-time polymorphism
	}
}
