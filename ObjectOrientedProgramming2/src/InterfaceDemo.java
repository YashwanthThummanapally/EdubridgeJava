
public class InterfaceDemo {
	public static void main(String[] args) {
//		new Calci();// instantiation not possible for interface : 
		MyCalci myCalci = new MyCalci();
		System.out.println(myCalci.sum(10, 5));
		System.out.println(myCalci.sub(10, 5));
		System.out.println(myCalci.mul(10, 5));
		System.out.println(myCalci.div(10, 5));
		System.out.println(myCalci.findSquare(10));
		System.out.println(myCalci.findCube(10));
		
		System.out.println("-----------------");
		
		// interface can be used as a reference type to hold implementation object
		Calci calci = new MyCalci();
		System.out.println(calci.sum(10, 5));
		System.out.println(calci.sub(10, 5));
		System.out.println(calci.mul(10, 5));
		System.out.println(calci.div(10, 5));	
		System.out.println(calci.findSquare(10));
		System.out.println(calci.findCube(10));
		
		// static method of interface cannot be accessed by implementation object 
//		System.out.println(myCalci.doubleIt(10));
//		System.out.println(calci.doubleIt(10));
		// static method can be accessed by interface name
		System.out.println(Calci.doubleIt(10));
//		System.out.println(MyCalci.doubleIt(10));
		
		// accessing static property of interface
		System.out.println(myCalci.PI_VALUE);
		System.out.println(calci.PI_VALUE);
		System.out.println(Calci.PI_VALUE);
		System.out.println(MyCalci.PI_VALUE);
	}
}
