// method resolution is taken care by JVM based on run-time object 
class Parent{
	public void study() {
		System.out.println("Medicine");
	}
}

class Child extends Parent{
	public void study() {
		System.out.println("Acting");
	}
}

public class RuntimePolymorphismDemo {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.study();
		
		Child child = new Child();
		child.study();
		
		Parent child2 = new Child(); 
		child2.study(); // run time polymorphism
	}
}
