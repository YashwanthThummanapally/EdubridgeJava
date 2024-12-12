
public class ArrayDemo4 {
	public static void main(String[] args) {
//		byte b = 100;
//		int i = b;
		int i = 100;
		byte b = (byte) i;
		System.out.println(b);
		System.out.println(i);

		int i2 = 130;
		byte b2 = (byte) i2;
		System.out.println(b2); // data loss
		System.out.println(i2);

		int i3 = 123;
		double d = i3;
		System.out.println(i3);
		System.out.println(d);

		double d2 = 25.67;
		int i4 = (int) d2;
		System.out.println(d2);
		System.out.println(i4); // data loss

		String s1 = "10";
		String s2 = "20";
		System.out.println(s1 + s2);
//		int i5 = (int)s1;
//		int i6 = (int)s2;
		int i5 = Integer.parseInt(s1);
		int i6 = Integer.parseInt(s2);
		System.out.println(i5 + i6);

		String s3 = "10.3";
		String s4 = "20.4";
		System.out.println(s3 + s4);
		double d3 = Double.parseDouble(s3);
		double d4 = Double.parseDouble(s4);
		System.out.println(d3 + d4);

		String s5 = "130.45";
		int i7 = (int) Double.parseDouble(s5); 
		System.out.println(i7); // data loss
		int i8 = (byte) Double.parseDouble(s5);
		System.out.println(i8); // data loss
	}
}
