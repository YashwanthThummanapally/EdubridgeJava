package practice;

public class CheckPrime {
	public static boolean isPrime(int n) {
		if(n<=1)
			return false;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Is prime : "+isPrime(19));
	}
}
// 1 2 3  5  7  
//  11  13   17  