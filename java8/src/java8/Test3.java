package java8;

interface Length {
	int getLength(String s);
}
public class Test3 {
	public static void main(String[] args) {
//		Length l = s -> {
//			return s.length();
//		};
		
//		Length l = s -> s.length();
		
		Length l = String::length;
				
		System.out.println(l.getLength("Purushotham"));
	}
}
