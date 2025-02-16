package java8;

interface Calculate {
	void doSum(int a, int b);
//	void doMul(int a, int b);
}

//class Calci implements Calculate {
//	@Override
//	public void doSum(int num1, int num2) {
//		System.out.println(num1+num2);
//	}
//}
public class Test2 {
	public static void main(String[] args) {
//		new Calci().doSum(100, 210);
		
		// anonymous inner class
//		new Calculate() {
//			@Override
//			public void doSum(int num1, int num2) {
//				System.out.println(num1+num2);
//			}
//		}.doSum(120, 617);
		
		// lambda expression
		Calculate c = (num1,num2) -> System.out.println(num1+num2);
		c.doSum(12, 34);
	}
}
