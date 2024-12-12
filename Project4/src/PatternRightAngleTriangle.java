import java.util.Scanner;

public class PatternRightAngleTriangle {
	
	public static void printPattern1(int n) {
		// square
		for(int i=1; i<=n; i++) {
			for(int j=1; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void printPattern2(int n) {
		// up left right angled triangle
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printPattern3(int n) {
		// down left right angled triangle
		for(int i=1; i<=n ; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void printPattern4(int n) {
		// up right right angled triangle
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n-i; k++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	public static void printPattern5(int n) {
		// down right right angled triangle
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=i-1; k++) {
				System.out.print("  ");
			}
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void printPattern6(int n) {
		// up equilateral triangle
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void printPattern7(int n) {
		// down equilateral triangle
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=i-1; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void printPattern8(int n) {
		// print tie
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			for(int k=1; k<=n-i; k++) {
				System.out.print("  ");
			}
			for(int k=1; k<=n-i; k++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			for(int k=1; k<=i-1; k++) {
				System.out.print("  ");
			}
			for(int k=1; k<=i-1; k++) {
				System.out.print("  ");
			}
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void printPattern9(int n) {
		// diamond
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=i-1;k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int n = in.nextInt();
		
		printPattern9(n);
	}
}
