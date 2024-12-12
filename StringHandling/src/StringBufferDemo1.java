/*
 * StringBuffer is mutable (changeable)
 * equals() performs reference comparison only
 * Thread safe : only 1 thread will access the methods remaining threads wait, more execution time
 */
public class StringBufferDemo1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		sb.append("23");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("Java");
		System.out.println(sb.equals(sb2)); // reference comparision
//		System.out.println(sb==sb2);
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1.equals(s2)); // content comparision
		System.out.println(s1.hashCode()+" "+s2.hashCode());
	}
}
