package practice;

public class PyramidPattern {

	public static void printStarPyramid(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void printStarPyramid2(int n) {
		for(int i=0; i<n; i++) {
			for(int k=0; k<n-1-i; k++) {
				System.out.print("  ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void printStarPyramid3(int n) {
		for(int i=0; i<n; i++) {
			for(int k=0; k<n-i-1; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void printNumberPyramid(int n) {
		for(int i=0; i<n; i++) {
			for(int k=0; k<n-i-1; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print((i+1)+" ");
			}
			System.out.println();
		}
	}
	
	public static void printNumberPyramid2(int n) {
		for(int i=0; i<n; i++) {
			for(int k=0; k<n-i-1; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}
	}
	
	public static void printStarPyramid4(int n) {
		for(int i=0; i<n; i++) {
			for(int k=0; k<n-i-1; k++) {
				System.out.print("  ");
			}
			for(int j=0; j<2*i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printNumberPyramid(9);
	}
}
