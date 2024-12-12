
class Parent {
	public void property() {
		System.out.println("1 own house + 2 Flats + 50 acre land");
	}

	public void profession() {
		System.out.println("Working as a Lawyer in Siddipet dist. court");
	}

	public final void religion() {
		System.out.println("Practises hindu religion");
	}
}

final class Child extends Parent {
	@Override
	public void profession() {
		System.out.println("Works as a software engineer");
	}

//	public void religion() {
//		System.out.println("Practises Budhism");
//	}
}

//class Child2 extends Child {
//
//}

public class OverridingDemo {
	public static void main(String[] args) {
		Parent father = new Parent();
		father.property();
		father.profession();
		father.religion();

		System.out.println("--------------");

		Child son = new Child();
		son.property();
		son.profession();
		son.religion();

		System.out.println("-------------");
		final double PI_VALUE = 3.14;
		System.out.println(PI_VALUE);
//		PI_VALUE = 3.12;
	}
}
