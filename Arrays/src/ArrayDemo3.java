
public class ArrayDemo3 {
	public static void main(String[] args) {
		// storing heterogeneous elements
		Object[] objArr = { 1, "Jones", 45000.0, true };
		int ele1 = (int)objArr[0];
		String ele2= (String)objArr[1];
		double ele3 = (double)objArr[2];
		boolean ele4 = (boolean)objArr[3];
		System.out.println(ele1);
		System.out.println(ele2);
		System.out.println(ele3);
		System.out.println(ele4);
	}
}
