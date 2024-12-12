
public class MethodsDemo {

	public static int findSquare(int n) {
		return n*n;
	}
	
	public static int findCube(int n) {
		return findSquare(n)*n;
	}
	
	public static void main(String[] args) {
		// Reading 1 numbers 
		int num = 15;
		
		// Calculating square and cube
		int square = findSquare(num);
		int cube = findCube(num);
		
		// display result
		System.out.println("Square of "+num+" is "+square);
		System.out.println("Cube of "+num+" is "+cube);
	}
}
